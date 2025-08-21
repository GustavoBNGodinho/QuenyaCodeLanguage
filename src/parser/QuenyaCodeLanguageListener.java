// Generated from QuenyaCodeLanguage.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuenyaCodeLanguageParser}.
 */
public interface QuenyaCodeLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QuenyaCodeLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QuenyaCodeLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(QuenyaCodeLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(QuenyaCodeLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(QuenyaCodeLanguageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(QuenyaCodeLanguageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(QuenyaCodeLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(QuenyaCodeLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(QuenyaCodeLanguageParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(QuenyaCodeLanguageParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(QuenyaCodeLanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(QuenyaCodeLanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(QuenyaCodeLanguageParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(QuenyaCodeLanguageParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(QuenyaCodeLanguageParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(QuenyaCodeLanguageParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(QuenyaCodeLanguageParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(QuenyaCodeLanguageParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(QuenyaCodeLanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(QuenyaCodeLanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QuenyaCodeLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QuenyaCodeLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void enterMathOp(QuenyaCodeLanguageParser.MathOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#mathOp}.
	 * @param ctx the parse tree
	 */
	void exitMathOp(QuenyaCodeLanguageParser.MathOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(QuenyaCodeLanguageParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(QuenyaCodeLanguageParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuenyaCodeLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(QuenyaCodeLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuenyaCodeLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(QuenyaCodeLanguageParser.TypeContext ctx);
}