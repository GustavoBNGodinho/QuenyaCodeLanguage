// Generated from QuenyaCodeLanguage.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuenyaCodeLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuenyaCodeLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(QuenyaCodeLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(QuenyaCodeLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(QuenyaCodeLanguageParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(QuenyaCodeLanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(QuenyaCodeLanguageParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(QuenyaCodeLanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(QuenyaCodeLanguageParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(QuenyaCodeLanguageParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(QuenyaCodeLanguageParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(QuenyaCodeLanguageParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QuenyaCodeLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#mathOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOp(QuenyaCodeLanguageParser.MathOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(QuenyaCodeLanguageParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuenyaCodeLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(QuenyaCodeLanguageParser.TypeContext ctx);
}