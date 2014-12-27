package toyLanguage.core;

import org.antlr.v4.runtime.misc.NotNull;
import toyLanguage.gen.ToyLanguageBaseVisitor;
import toyLanguage.gen.ToyLanguageParser;
import toyLanguage.utils.ToyValueConverter;
import toyLanguage.values.*;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends ToyLanguageBaseVisitor<ToyValue> {

    private final Environment environment;

    public Interpreter() {
        this(new Environment());
    }

    public Interpreter(Environment environment) {
        this.environment = environment;
    }

    //OK
    @Override
    public ToyValue visitParenthesizedParameterList(@NotNull ToyLanguageParser.ParenthesizedParameterListContext ctx) {
        if (ctx.parameterList() != null)
            return visit(ctx.parameterList());
        return new ToyList<>();
    }

    //OK
    @Override
    public ToyValue visitArgument(@NotNull ToyLanguageParser.ArgumentContext ctx) {
        return visit(ctx.expression());
    }

    //OK
    @Override
    public ToyValue visitStatementBlock(@NotNull ToyLanguageParser.StatementBlockContext ctx) {
        return visit(ctx.statementSequence());
    }

    //OK
    @Override
    public ToyValue visitLambdaFunctionExpr(@NotNull ToyLanguageParser.LambdaFunctionExprContext ctx) {
        return visit(ctx.lambdaFunction());
    }

    //OK
    @Override
    public ToyValue visitStatements(@NotNull ToyLanguageParser.StatementsContext ctx) {
        return visitChildren(ctx);
    }

    //OK
    @Override
    public ToyValue visitProgram(@NotNull ToyLanguageParser.ProgramContext ctx) {
        return visit(ctx.statementSequence());
    }

    //OK
    @Override
    public ToyValue visitBindExpr(@NotNull ToyLanguageParser.BindExprContext ctx) {
        return visit(ctx.bind());
    }

    //OK
    @Override
    public ToyValue visitArgumentList(@NotNull ToyLanguageParser.ArgumentListContext ctx) {
        final List<ToyValue> list = new ArrayList<>();
        ctx.argument().stream().forEach(argumentNode -> list.add(visit(argumentNode)));
        return new ToyList<>(list);
    }

    //OK
    @Override
    public ToyValue visitIdentifierExpr(@NotNull ToyLanguageParser.IdentifierExprContext ctx) {
        return environment.getValue(ToyValueConverter.toToyString(ctx.identifier().getText()));
    }

    //OK
    @Override
    public ToyValue visitParameter(@NotNull ToyLanguageParser.ParameterContext ctx) {
        return new ToyString(ctx.identifier().getText());
    }

    //OK
    @Override
    public ToyValue visitStatement(@NotNull ToyLanguageParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    //OK
    @Override
    public ToyValue visitPassStatement(@NotNull ToyLanguageParser.PassStatementContext ctx) {
        return new ToyNull();
    }

    //OK
    @Override
    public ToyValue visitExponExpr(@NotNull ToyLanguageParser.ExponExprContext ctx) {
        double a = ToyValueConverter.toNumber(visit(ctx.expression(0)));
        double b = ToyValueConverter.toNumber(visit(ctx.expression(1)));
        return new ToyNumber(Math.pow(a, b));
    }

    //OK
    @Override
    public ToyValue visitStatementSequence(@NotNull ToyLanguageParser.StatementSequenceContext ctx) {
        ToyValue value = new ToyNull();
        for (ToyLanguageParser.StatementContext stmtContext : ctx.statement())
            value = visit(stmtContext);
        return value;
    }

    //OK
    @Override
    public ToyValue visitBind(@NotNull ToyLanguageParser.BindContext ctx) {
        ToyString lhs = ToyValueConverter.toToyString(ctx.identifier().getText());
        if (environment.hasValue(lhs))
            throw new UnsupportedOperationException("The symbol '" + lhs + "' is already bound.");
        ToyValue rhs = visit(ctx.expression());
        environment.storeValue(lhs, rhs);
        return rhs;
    }

    //OK
    @Override
    public ToyValue visitConstantExpr(@NotNull ToyLanguageParser.ConstantExprContext ctx) {
        if (ctx.constant().StringLiteral() != null)
            return ToyValueConverter.toToyString(ctx.constant().StringLiteral().getText());
        else
            return ToyValueConverter.toToyNumber(ctx.constant().NumberConstant().getText());
    }

    //OK
    @Override
    public ToyValue visitParenthesizedArgumentList(@NotNull ToyLanguageParser.ParenthesizedArgumentListContext ctx) {
        if (ctx.argumentList() != null)
            return visit(ctx.argumentList());
        return new ToyList<>();
    }

    //OK
    @Override
    public ToyValue visitNegateExpr(@NotNull ToyLanguageParser.NegateExprContext ctx) {
        return ToyValueConverter.toToyNumber(-ToyValueConverter.toNumber(visit(ctx.expression())));
    }

    //OK
    @Override
    public ToyValue visitFunctionCallExpr(@NotNull ToyLanguageParser.FunctionCallExprContext ctx) {
        return visit(ctx.functionCall());
    }

    //OK
    @Override
    public ToyValue visitMulDivModExpr(@NotNull ToyLanguageParser.MulDivModExprContext ctx) {
        double left = ToyValueConverter.toNumber(visit(ctx.expression(0)));
        double right = ToyValueConverter.toNumber(visit(ctx.expression(1)));
        switch (ctx.op.getType()) {
            case ToyLanguageParser.Star:
                return ToyValueConverter.toToyNumber(left * right);
            case ToyLanguageParser.Div:
                return ToyValueConverter.toToyNumber(left / right);
            default:
                return ToyValueConverter.toToyNumber(left % right);
        }
    }

    //OK
    @Override
    public ToyValue visitFunctionCall(@NotNull ToyLanguageParser.FunctionCallContext ctx) {
        return visitChildren(ctx);
    }

    //OK
    @Override
    public ToyValue visitParensExpr(@NotNull ToyLanguageParser.ParensExprContext ctx) {
        return visit(ctx.expression());
    }

    //OK
    @Override
    public ToyValue visitParameterList(@NotNull ToyLanguageParser.ParameterListContext ctx) {
        final List<ToyValue> list = new ArrayList<>();
        ctx.identifier().stream().forEach(identifierNode -> list.add(ToyValueConverter.toToyString(identifierNode.getText())));
        return new ToyList<>(list);
    }

    //OK
    @Override
    public ToyValue visitAddSubExpr(@NotNull ToyLanguageParser.AddSubExprContext ctx) {
        double left = ToyValueConverter.toNumber(visit(ctx.expression(0)));
        double right = ToyValueConverter.toNumber(visit(ctx.expression(1)));
        if (ctx.op.getType() == ToyLanguageParser.Plus)
            return ToyValueConverter.toToyNumber(left + right);
        return ToyValueConverter.toToyNumber(left - right);
    }

    //OK
    @Override
    public ToyValue visitNamedFunctionCall(@NotNull ToyLanguageParser.NamedFunctionCallContext ctx) {
        ToyString functionName = ToyValueConverter.toToyString(ctx.identifier().getText());
        ToyList<ToyValue> arguments = ToyValueConverter.toToyList(visit(ctx.parenthesizedArgumentList()));
        ToyFunction function = (ToyFunction)environment.getValue(functionName);
        return function.call(arguments, environment);
    }

    //OK
    @Override
    public ToyValue visitLambdaFunctionParameters(@NotNull ToyLanguageParser.LambdaFunctionParametersContext ctx) {
        if (ctx.parameter() != null) {
            List<ToyValue> list = new ArrayList<>();
            list.add(visit(ctx.parameter()));
            return new ToyList<>(list);
        }
        else
            return visit(ctx.parenthesizedParameterList());
    }

    //OK
    @Override
    public ToyValue visitLambdaFunctionCall(@NotNull ToyLanguageParser.LambdaFunctionCallContext ctx) {
        ToyFunction function = (ToyFunction)visit(ctx.lambdaFunction());
        ToyList<ToyValue> arguments = ToyValueConverter.toToyList(visit(ctx.parenthesizedArgumentList()));
        return function.call(arguments, environment);
    }

    //OK
    @Override
    public ToyValue visitLambdaFunction(@NotNull ToyLanguageParser.LambdaFunctionContext ctx) {
        ToyList<ToyString> parameters = ToyValueConverter.toToyList(visit(ctx.lambdaFunctionParameters()));
        return new ToyFunction(parameters, ctx.statements());
    }

    //OK
    @Override
    public ToyValue visitIfStatement(@NotNull ToyLanguageParser.IfStatementContext ctx) {
        ToyBoolean condition = ToyValueConverter.toToyBoolean(visit(ctx.booleanExpression()));
        if (condition.getValue())
            return visit(ctx.statements(0));
        else {
            if (ctx.statements(1) != null)
                return visit(ctx.statements(1));
            return new ToyNull();
        }
    }

    //OK
    @Override
    public ToyValue visitBooleanConstant(@NotNull ToyLanguageParser.BooleanConstantContext ctx) {
        return ToyValueConverter.toToyBoolean(ctx.getText());
    }

    //OK
    @Override
    public ToyValue visitNegateBoolExpr(@NotNull ToyLanguageParser.NegateBoolExprContext ctx) {
        return ToyValueConverter.toToyBoolean(!ToyValueConverter.toBoolean(visit(ctx.booleanExpression())));
    }

    //OK
    @Override
    public ToyValue visitBoolConst(@NotNull ToyLanguageParser.BoolConstContext ctx) {
        return visit(ctx.booleanConstant());
    }

    @Override
    public ToyValue visitBoolAndOrExpr(@NotNull ToyLanguageParser.BoolAndOrExprContext ctx) {
        boolean left = ToyValueConverter.toBoolean(visit(ctx.booleanExpression(0)));
        boolean right = ToyValueConverter.toBoolean(visit(ctx.booleanExpression(1)));
        if (ctx.op.getType() == ToyLanguageParser.AndAnd)
            return ToyValueConverter.toToyBoolean(left && right);
        return ToyValueConverter.toToyBoolean(left || right);
    }


    @Override
    public ToyValue visitBoolEqualExpr(@NotNull ToyLanguageParser.BoolEqualExprContext ctx) {
        double left = ToyValueConverter.toNumber(visit(ctx.expression(0)));
        double right = ToyValueConverter.toNumber(visit(ctx.expression(1)));
        if (ctx.op.getType() == ToyLanguageParser.Equal)
            return ToyValueConverter.toToyBoolean(left == right);
        return ToyValueConverter.toToyBoolean(left != right);
    }

    //OK
    @Override
    public ToyValue visitBoolRelationalExpr(@NotNull ToyLanguageParser.BoolRelationalExprContext ctx) {
        double left = ToyValueConverter.toNumber(visit(ctx.expression(0)));
        double right = ToyValueConverter.toNumber(visit(ctx.expression(1)));
        switch (ctx.op.getType()) {
            case ToyLanguageParser.GreaterEqual:
                return ToyValueConverter.toToyBoolean(left >= right);
            case ToyLanguageParser.LessEqual:
                return ToyValueConverter.toToyBoolean(left <= right);
            case ToyLanguageParser.Greater:
                return ToyValueConverter.toToyBoolean(left > right);
            default:
                return ToyValueConverter.toToyBoolean(left < right);
        }
    }

    //OK
    @Override
    public ToyValue visitBoolExpr(@NotNull ToyLanguageParser.BoolExprContext ctx) {
        return visit(ctx.expression());
    }
}