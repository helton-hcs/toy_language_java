// Generated from ToyLanguage.g4 by ANTLR 4.4

package toyLanguage.gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ToyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ToyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#parenthesizedParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedParameterList(@NotNull ToyLanguageParser.ParenthesizedParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link ToyLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(@NotNull ToyLanguageParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull ToyLanguageParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolEqualExpr}
	 * labeled alternative in {@link ToyLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolEqualExpr(@NotNull ToyLanguageParser.BoolEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull ToyLanguageParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(@NotNull ToyLanguageParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaFunctionExpr}
	 * labeled alternative in {@link ToyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunctionExpr(@NotNull ToyLanguageParser.LambdaFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull ToyLanguageParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegateBoolExpr}
	 * labeled alternative in {@link ToyLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateBoolExpr(@NotNull ToyLanguageParser.NegateBoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#lambdaFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunctionCall(@NotNull ToyLanguageParser.LambdaFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ToyLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolRelationalExpr}
	 * labeled alternative in {@link ToyLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolRelationalExpr(@NotNull ToyLanguageParser.BoolRelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#booleanConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(@NotNull ToyLanguageParser.BooleanConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull ToyLanguageParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#lambdaFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunction(@NotNull ToyLanguageParser.LambdaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#bind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind(@NotNull ToyLanguageParser.BindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link ToyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(@NotNull ToyLanguageParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull ToyLanguageParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull ToyLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#passStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassStatement(@NotNull ToyLanguageParser.PassStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BindExpr}
	 * labeled alternative in {@link ToyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindExpr(@NotNull ToyLanguageParser.BindExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull ToyLanguageParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExponExpr}
	 * labeled alternative in {@link ToyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponExpr(@NotNull ToyLanguageParser.ExponExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#statementSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSequence(@NotNull ToyLanguageParser.StatementSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#namedFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFunctionCall(@NotNull ToyLanguageParser.NamedFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantExpr}
	 * labeled alternative in {@link ToyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpr(@NotNull ToyLanguageParser.ConstantExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#parenthesizedArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedArgumentList(@NotNull ToyLanguageParser.ParenthesizedArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull ToyLanguageParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegateExpr}
	 * labeled alternative in {@link ToyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpr(@NotNull ToyLanguageParser.NegateExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#lambdaFunctionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunctionParameters(@NotNull ToyLanguageParser.LambdaFunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link ToyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(@NotNull ToyLanguageParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolConst}
	 * labeled alternative in {@link ToyLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(@NotNull ToyLanguageParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivModExpr}
	 * labeled alternative in {@link ToyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModExpr(@NotNull ToyLanguageParser.MulDivModExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(@NotNull ToyLanguageParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParensExpr}
	 * labeled alternative in {@link ToyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParensExpr(@NotNull ToyLanguageParser.ParensExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToyLanguageParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull ToyLanguageParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link ToyLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(@NotNull ToyLanguageParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolAndOrExpr}
	 * labeled alternative in {@link ToyLanguageParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAndOrExpr(@NotNull ToyLanguageParser.BoolAndOrExprContext ctx);
}