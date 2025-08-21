package main;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.QuenyaCodeLanguageBaseVisitor;
import parser.QuenyaCodeLanguageParser;

public class Visitor extends QuenyaCodeLanguageBaseVisitor<String> {
    private boolean scannerUsed = false;

    @Override
    public String visitProgram(QuenyaCodeLanguageParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();

        sb.append("package main;\n");
        sb.append("import java.util.Scanner;\n\n");

        sb.append("public class MainClass {\n");
        sb.append("    public static void main(String[] args) {\n");
        sb.append("        Scanner sc = new Scanner(System.in);\n");

        for (QuenyaCodeLanguageParser.StatementContext stmt : ctx.statement()) {
            String code = visit(stmt);
            for (String line : code.split("\n")) {
                sb.append("        ").append(line).append("\n");
            }
        }

        sb.append("    }\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public String visitStatement(QuenyaCodeLanguageParser.StatementContext ctx) {
        if (ctx.declaration() != null)    return visit(ctx.declaration());
        if (ctx.assignment() != null)     return visit(ctx.assignment());
        if (ctx.input() != null)          return visit(ctx.input());
        if (ctx.print() != null)          return visit(ctx.print());
        if (ctx.ifStatement() != null)    return visit(ctx.ifStatement());
        if (ctx.whileStatement() != null) return visit(ctx.whileStatement());
        if (ctx.doWhileStatement() != null) return visit(ctx.doWhileStatement());
        return "";
    }

    @Override
    public String visitDeclaration(QuenyaCodeLanguageParser.DeclarationContext ctx) {
        String type = visit(ctx.type());
        String id   = ctx.ID().getText();
        String expr = visit(ctx.expression());
        return type + " " + id + " = " + expr + ";";
    }

    @Override
    public String visitAssignment(QuenyaCodeLanguageParser.AssignmentContext ctx) {
        String id   = ctx.ID().getText();
        String expr = visit(ctx.expression());
        return id + " = " + expr + ";";
    }

    @Override
    public String visitInput(QuenyaCodeLanguageParser.InputContext ctx) {
        scannerUsed = true;
        String type   = visit(ctx.type());
        String id     = ctx.ID().getText();
        String prompt = ctx.STRING().getText();

        StringBuilder sb = new StringBuilder();
        sb.append("System.out.print(").append(prompt).append(");");
        sb.append("\n");
        if ("int".equals(type)) {
            sb.append(type).append(" ").append(id).append(" = sc.nextInt();");
        } else {
            sb.append(type).append(" ").append(id).append(" = sc.nextDouble();");
        }
        return sb.toString();
    }

    @Override
    public String visitPrint(QuenyaCodeLanguageParser.PrintContext ctx) {
        if (ctx.STRING() != null) {
            return "System.out.println(" + ctx.STRING().getText() + ");";
        } else {
            return "System.out.println(" + ctx.ID().getText() + ");";
        }
    }

    @Override
    public String visitIfStatement(QuenyaCodeLanguageParser.IfStatementContext ctx) {
        String cond = visit(ctx.condition());
        StringBuilder sb = new StringBuilder();
        sb.append("if (").append(cond).append(") {");

        // split then vs else by token index
        List<QuenyaCodeLanguageParser.StatementContext> all = ctx.statement();
        List<QuenyaCodeLanguageParser.StatementContext> thenStmts = new ArrayList<>();
        List<QuenyaCodeLanguageParser.StatementContext> elseStmts = new ArrayList<>();
        int splitTok = ctx.FC(0).getSymbol().getTokenIndex();

        for (QuenyaCodeLanguageParser.StatementContext st : all) {
            if (st.getStart().getTokenIndex() < splitTok) thenStmts.add(st);
            else elseStmts.add(st);
        }

        for (QuenyaCodeLanguageParser.StatementContext st : thenStmts) {
            sb.append("\n    ").append(visit(st));
        }
        sb.append("\n}");

        if (!elseStmts.isEmpty()) {
            sb.append(" else {");
            for (QuenyaCodeLanguageParser.StatementContext st : elseStmts) {
                sb.append("\n    ").append(visit(st));
            }
            sb.append("\n}");
        }
        return sb.toString();
    }

    @Override
    public String visitWhileStatement(QuenyaCodeLanguageParser.WhileStatementContext ctx) {
        String cond = visit(ctx.condition());
        StringBuilder sb = new StringBuilder();
        sb.append("while (").append(cond).append(") {");
        for (QuenyaCodeLanguageParser.StatementContext st : ctx.statement()) {
            sb.append("\n    ").append(visit(st));
        }
        sb.append("\n}");
        return sb.toString();
    }

    @Override
    public String visitDoWhileStatement(QuenyaCodeLanguageParser.DoWhileStatementContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("do {");
        for (QuenyaCodeLanguageParser.StatementContext st : ctx.statement()) {
            sb.append("\n    ").append(visit(st));
        }
        sb.append("\n} while(").append(visit(ctx.condition())).append(");");
        return sb.toString();
    }

    @Override
    public String visitCondition(QuenyaCodeLanguageParser.ConditionContext ctx) {
        String left  = visit(ctx.expression(0));
        String op    = visit(ctx.relationalOp());
        String right = visit(ctx.expression(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitExpression(QuenyaCodeLanguageParser.ExpressionContext ctx) {
        if (ctx.INT() != null)   return ctx.INT().getText();
        if (ctx.FLOAT() != null) return ctx.FLOAT().getText();
        if (ctx.ID() != null)    return ctx.ID().getText();

        // binary expression
        String left  = visit(ctx.expression(0));
        String op    = visit(ctx.mathOp());
        String right = visit(ctx.expression(1));
        return left + " " + op + " " + right;
    }

    @Override
    public String visitMathOp(QuenyaCodeLanguageParser.MathOpContext ctx) {
        String tok = ctx.getText();
        switch (tok) {
            case "yo":   return "+";
            case "nac":  return "-";
            case "húta": return "*";
            case "etya": return "/";
            default:     return tok;
        }
    }

    @Override
    public String visitRelationalOp(QuenyaCodeLanguageParser.RelationalOpContext ctx) {
        int count = ctx.getChildCount();

        if (count == 1) {
            String op = ctx.getChild(0).getText();
            switch (op) {
                case "hauta":  return ">";
                case "nanca":  return "<";
                case "ve":     return "==";
                case "úvëa":   return "!=";
                default:
                    throw new IllegalArgumentException(
                            "Operador relacional desconhecido: " + op);
            }
        }
        else if (count == 2) {
            String left  = ctx.getChild(0).getText();
            String right = ctx.getChild(1).getText();
            if ("hauta".equals(left) && "ve".equals(right)) return ">=";
            if ("nanca".equals(left) && "ve".equals(right)) return "<=";
            throw new IllegalArgumentException(
                    "Operador relacional composto desconhecido: " + left + " " + right);
        }

        throw new IllegalArgumentException(
                "Contexto de operador relacional inválido: " + ctx.getText());
    }

    @Override
    public String visitType(QuenyaCodeLanguageParser.TypeContext ctx) {
        String tok = ctx.getText();
        if ("nórëa".equals(tok)) return "int";
        if ("lúmëa".equals(tok)) return "double";
        return tok;
    }
}
