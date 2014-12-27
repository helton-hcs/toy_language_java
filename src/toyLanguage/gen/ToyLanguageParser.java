// Generated from ToyLanguage.g4 by ANTLR 4.4

package toyLanguage.gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, NumberConstant=7, IdentifierNondigit=8, 
		Digit=9, StringLiteral=10, Whitespace=11, Newline=12, BlockComment=13, 
		LineComment=14, Comma=15, Semi=16, Assign=17, Arrow=18, LeftParen=19, 
		RightParen=20, LeftBrace=21, RightBrace=22, Plus=23, Minus=24, Star=25, 
		Div=26, Mod=27, Caret=28, AndAnd=29, OrOr=30, Not=31, Equal=32, NotEqual=33, 
		Less=34, LessEqual=35, Greater=36, GreaterEqual=37;
	public static final String[] tokenNames = {
		"<INVALID>", "'true'", "'if'", "'false'", "'pass'", "'else'", "'then'", 
		"NumberConstant", "IdentifierNondigit", "Digit", "StringLiteral", "Whitespace", 
		"Newline", "BlockComment", "LineComment", "','", "';'", "'='", "'=>'", 
		"'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", 
		"'&&'", "'||'", "'!'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='"
	};
	public static final int
		RULE_program = 0, RULE_statementSequence = 1, RULE_statement = 2, RULE_statements = 3, 
		RULE_expression = 4, RULE_statementBlock = 5, RULE_passStatement = 6, 
		RULE_ifStatement = 7, RULE_booleanExpression = 8, RULE_booleanConstant = 9, 
		RULE_bind = 10, RULE_lambdaFunction = 11, RULE_lambdaFunctionParameters = 12, 
		RULE_functionCall = 13, RULE_namedFunctionCall = 14, RULE_lambdaFunctionCall = 15, 
		RULE_parenthesizedParameterList = 16, RULE_parenthesizedArgumentList = 17, 
		RULE_parameter = 18, RULE_argument = 19, RULE_parameterList = 20, RULE_argumentList = 21, 
		RULE_constant = 22, RULE_identifier = 23;
	public static final String[] ruleNames = {
		"program", "statementSequence", "statement", "statements", "expression", 
		"statementBlock", "passStatement", "ifStatement", "booleanExpression", 
		"booleanConstant", "bind", "lambdaFunction", "lambdaFunctionParameters", 
		"functionCall", "namedFunctionCall", "lambdaFunctionCall", "parenthesizedParameterList", 
		"parenthesizedArgumentList", "parameter", "argument", "parameterList", 
		"argumentList", "constant", "identifier"
	};

	@Override
	public String getGrammarFileName() { return "ToyLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ToyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementSequenceContext statementSequence() {
			return getRuleContext(StatementSequenceContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); statementSequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementSequenceContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitStatementSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementSequenceContext statementSequence() throws RecognitionException {
		StatementSequenceContext _localctx = new StatementSequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statementSequence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50); statement();
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51); match(Semi);
					setState(52); statement();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(58); match(Semi);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PassStatementContext passStatement() {
			return getRuleContext(PassStatementContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); booleanExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); passStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67); ifStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case T__5:
			case T__4:
			case T__3:
			case T__2:
			case NumberConstant:
			case IdentifierNondigit:
			case StringLiteral:
			case LeftParen:
			case Minus:
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); statement();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); statementBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BindExprContext extends ExpressionContext {
		public BindContext bind() {
			return getRuleContext(BindContext.class,0);
		}
		public BindExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitBindExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExprContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExponExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitExponExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivModExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulDivModExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitMulDivModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExprContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitConstantExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaFunctionExprContext extends ExpressionContext {
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public LambdaFunctionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitLambdaFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitNegateExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75); match(Minus);
				setState(76); expression(10);
				}
				break;
			case 2:
				{
				_localctx = new BindExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77); bind();
				}
				break;
			case 3:
				{
				_localctx = new ConstantExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78); constant();
				}
				break;
			case 4:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79); identifier();
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80); functionCall();
				}
				break;
			case 6:
				{
				_localctx = new LambdaFunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81); lambdaFunction();
				}
				break;
			case 7:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82); match(LeftParen);
				setState(83); expression(0);
				setState(84); match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExponExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(89); ((ExponExprContext)_localctx).op = match(Caret);
						setState(90); expression(9);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(92);
						((MulDivModExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
							((MulDivModExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(93); expression(9);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(95);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(96); expression(8);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementBlockContext extends ParserRuleContext {
		public StatementSequenceContext statementSequence() {
			return getRuleContext(StatementSequenceContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(LeftBrace);
			setState(103); statementSequence();
			setState(104); match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PassStatementContext extends ParserRuleContext {
		public PassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitPassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassStatementContext passStatement() throws RecognitionException {
		PassStatementContext _localctx = new PassStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_passStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(T__4);
			setState(109); booleanExpression(0);
			setState(110); match(T__0);
			setState(111); statements();
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(112); match(T__1);
				setState(113); statements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolExprContext extends BooleanExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolExprContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolEqualExprContext extends BooleanExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BoolEqualExprContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitBoolEqualExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolConstContext extends BooleanExpressionContext {
		public BooleanConstantContext booleanConstant() {
			return getRuleContext(BooleanConstantContext.class,0);
		}
		public BoolConstContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateBoolExprContext extends BooleanExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NegateBoolExprContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitNegateBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolRelationalExprContext extends BooleanExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BoolRelationalExprContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitBoolRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAndOrExprContext extends BooleanExpressionContext {
		public Token op;
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BoolAndOrExprContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitBoolAndOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_booleanExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new NegateBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(117); match(Not);
				setState(118); booleanExpression(6);
				}
				break;
			case 2:
				{
				_localctx = new BoolEqualExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119); expression(0);
				setState(120);
				((BoolEqualExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
					((BoolEqualExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(121); expression(0);
				}
				break;
			case 3:
				{
				_localctx = new BoolRelationalExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123); expression(0);
				setState(124);
				((BoolRelationalExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual))) != 0)) ) {
					((BoolRelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(125); expression(0);
				}
				break;
			case 4:
				{
				_localctx = new BoolConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127); booleanConstant();
				}
				break;
			case 5:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128); expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolAndOrExprContext(new BooleanExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
					setState(131);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(132);
					((BoolAndOrExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AndAnd || _la==OrOr) ) {
						((BoolAndOrExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(133); booleanExpression(6);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BooleanConstantContext extends ParserRuleContext {
		public BooleanConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_booleanConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindContext bind() throws RecognitionException {
		BindContext _localctx = new BindContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); identifier();
			setState(142); match(Assign);
			setState(143); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public LambdaFunctionParametersContext lambdaFunctionParameters() {
			return getRuleContext(LambdaFunctionParametersContext.class,0);
		}
		public LambdaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitLambdaFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionContext lambdaFunction() throws RecognitionException {
		LambdaFunctionContext _localctx = new LambdaFunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lambdaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); lambdaFunctionParameters();
			setState(146); match(Arrow);
			setState(147); statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionParametersContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParenthesizedParameterListContext parenthesizedParameterList() {
			return getRuleContext(ParenthesizedParameterListContext.class,0);
		}
		public LambdaFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitLambdaFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionParametersContext lambdaFunctionParameters() throws RecognitionException {
		LambdaFunctionParametersContext _localctx = new LambdaFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lambdaFunctionParameters);
		try {
			setState(151);
			switch (_input.LA(1)) {
			case IdentifierNondigit:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); parameter();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); parenthesizedParameterList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public NamedFunctionCallContext namedFunctionCall() {
			return getRuleContext(NamedFunctionCallContext.class,0);
		}
		public LambdaFunctionCallContext lambdaFunctionCall() {
			return getRuleContext(LambdaFunctionCallContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCall);
		try {
			setState(155);
			switch (_input.LA(1)) {
			case IdentifierNondigit:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); namedFunctionCall();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); lambdaFunctionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedFunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParenthesizedArgumentListContext parenthesizedArgumentList() {
			return getRuleContext(ParenthesizedArgumentListContext.class,0);
		}
		public NamedFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedFunctionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitNamedFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedFunctionCallContext namedFunctionCall() throws RecognitionException {
		NamedFunctionCallContext _localctx = new NamedFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_namedFunctionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); identifier();
			setState(158); parenthesizedArgumentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaFunctionCallContext extends ParserRuleContext {
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public ParenthesizedArgumentListContext parenthesizedArgumentList() {
			return getRuleContext(ParenthesizedArgumentListContext.class,0);
		}
		public LambdaFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunctionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitLambdaFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionCallContext lambdaFunctionCall() throws RecognitionException {
		LambdaFunctionCallContext _localctx = new LambdaFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lambdaFunctionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(LeftParen);
			setState(161); lambdaFunction();
			setState(162); match(RightParen);
			setState(163); parenthesizedArgumentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedParameterListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParenthesizedParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitParenthesizedParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedParameterListContext parenthesizedParameterList() throws RecognitionException {
		ParenthesizedParameterListContext _localctx = new ParenthesizedParameterListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parenthesizedParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(LeftParen);
			setState(167);
			_la = _input.LA(1);
			if (_la==IdentifierNondigit) {
				{
				setState(166); parameterList();
				}
			}

			setState(169); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedArgumentListContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ParenthesizedArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedArgumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitParenthesizedArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParenthesizedArgumentListContext parenthesizedArgumentList() throws RecognitionException {
		ParenthesizedArgumentListContext _localctx = new ParenthesizedArgumentListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parenthesizedArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); match(LeftParen);
			setState(173);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NumberConstant) | (1L << IdentifierNondigit) | (1L << StringLiteral) | (1L << LeftParen) | (1L << Minus))) != 0)) {
				{
				setState(172); argumentList();
				}
			}

			setState(175); match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); identifier();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(182); match(Comma);
				setState(183); identifier();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); argument();
			setState(192);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(190); match(Comma);
				setState(191); argument();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(ToyLanguageParser.StringLiteral, 0); }
		public TerminalNode NumberConstant() { return getToken(ToyLanguageParser.NumberConstant, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==NumberConstant || _la==StringLiteral) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IdentifierNondigit(int i) {
			return getToken(ToyLanguageParser.IdentifierNondigit, i);
		}
		public TerminalNode Digit(int i) {
			return getToken(ToyLanguageParser.Digit, i);
		}
		public List<TerminalNode> IdentifierNondigit() { return getTokens(ToyLanguageParser.IdentifierNondigit); }
		public List<TerminalNode> Digit() { return getTokens(ToyLanguageParser.Digit); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ToyLanguageVisitor ) return ((ToyLanguageVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(IdentifierNondigit);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					_la = _input.LA(1);
					if ( !(_la==IdentifierNondigit || _la==Digit) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 8: return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 9);
		case 1: return precpred(_ctx, 8);
		case 2: return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\7\3>\n\3\f\3\16\3A\13"+
		"\3\3\4\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6Y\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6d\n\6\f\6\16\6g\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\tu\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0084"+
		"\n\n\3\n\3\n\3\n\7\n\u0089\n\n\f\n\16\n\u008c\13\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u009a\n\16\3\17\3\17\5\17\u009e"+
		"\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00aa\n\22"+
		"\3\22\3\22\3\23\3\23\5\23\u00b0\n\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\7\26\u00bb\n\26\f\26\16\26\u00be\13\26\3\27\3\27\3\27\5\27"+
		"\u00c3\n\27\3\30\3\30\3\31\3\31\7\31\u00c9\n\31\f\31\16\31\u00cc\13\31"+
		"\3\31\2\4\n\22\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\n\3\2\33\35\3\2\31\32\3\2\"#\3\2$\'\3\2\37 \4\2\3\3\5\5\4\2\t\t\f\f\3"+
		"\2\n\13\u00d1\2\62\3\2\2\2\4\64\3\2\2\2\6F\3\2\2\2\bJ\3\2\2\2\nX\3\2\2"+
		"\2\fh\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22\u0083\3\2\2\2\24\u008d\3\2\2"+
		"\2\26\u008f\3\2\2\2\30\u0093\3\2\2\2\32\u0099\3\2\2\2\34\u009d\3\2\2\2"+
		"\36\u009f\3\2\2\2 \u00a2\3\2\2\2\"\u00a7\3\2\2\2$\u00ad\3\2\2\2&\u00b3"+
		"\3\2\2\2(\u00b5\3\2\2\2*\u00b7\3\2\2\2,\u00bf\3\2\2\2.\u00c4\3\2\2\2\60"+
		"\u00c6\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\649\5\6\4\2\65\66\7\22\2\2\66"+
		"8\5\6\4\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:?\3\2\2\2;9\3"+
		"\2\2\2<>\7\22\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2A"+
		"?\3\2\2\2BG\5\n\6\2CG\5\22\n\2DG\5\16\b\2EG\5\20\t\2FB\3\2\2\2FC\3\2\2"+
		"\2FD\3\2\2\2FE\3\2\2\2G\7\3\2\2\2HK\5\6\4\2IK\5\f\7\2JH\3\2\2\2JI\3\2"+
		"\2\2K\t\3\2\2\2LM\b\6\1\2MN\7\32\2\2NY\5\n\6\fOY\5\26\f\2PY\5.\30\2QY"+
		"\5\60\31\2RY\5\34\17\2SY\5\30\r\2TU\7\25\2\2UV\5\n\6\2VW\7\26\2\2WY\3"+
		"\2\2\2XL\3\2\2\2XO\3\2\2\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3"+
		"\2\2\2Ye\3\2\2\2Z[\f\13\2\2[\\\7\36\2\2\\d\5\n\6\13]^\f\n\2\2^_\t\2\2"+
		"\2_d\5\n\6\13`a\f\t\2\2ab\t\3\2\2bd\5\n\6\ncZ\3\2\2\2c]\3\2\2\2c`\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3\2\2\2ge\3\2\2\2hi\7\27\2\2ij"+
		"\5\4\3\2jk\7\30\2\2k\r\3\2\2\2lm\7\6\2\2m\17\3\2\2\2no\7\4\2\2op\5\22"+
		"\n\2pq\7\b\2\2qt\5\b\5\2rs\7\7\2\2su\5\b\5\2tr\3\2\2\2tu\3\2\2\2u\21\3"+
		"\2\2\2vw\b\n\1\2wx\7!\2\2x\u0084\5\22\n\byz\5\n\6\2z{\t\4\2\2{|\5\n\6"+
		"\2|\u0084\3\2\2\2}~\5\n\6\2~\177\t\5\2\2\177\u0080\5\n\6\2\u0080\u0084"+
		"\3\2\2\2\u0081\u0084\5\24\13\2\u0082\u0084\5\n\6\2\u0083v\3\2\2\2\u0083"+
		"y\3\2\2\2\u0083}\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u008a\3\2\2\2\u0085\u0086\f\7\2\2\u0086\u0087\t\6\2\2\u0087\u0089\5\22"+
		"\n\b\u0088\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\23\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\t\7\2"+
		"\2\u008e\25\3\2\2\2\u008f\u0090\5\60\31\2\u0090\u0091\7\23\2\2\u0091\u0092"+
		"\5\n\6\2\u0092\27\3\2\2\2\u0093\u0094\5\32\16\2\u0094\u0095\7\24\2\2\u0095"+
		"\u0096\5\b\5\2\u0096\31\3\2\2\2\u0097\u009a\5&\24\2\u0098\u009a\5\"\22"+
		"\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\33\3\2\2\2\u009b\u009e"+
		"\5\36\20\2\u009c\u009e\5 \21\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2"+
		"\u009e\35\3\2\2\2\u009f\u00a0\5\60\31\2\u00a0\u00a1\5$\23\2\u00a1\37\3"+
		"\2\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5\7\26\2\2"+
		"\u00a5\u00a6\5$\23\2\u00a6!\3\2\2\2\u00a7\u00a9\7\25\2\2\u00a8\u00aa\5"+
		"*\26\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\7\26\2\2\u00ac#\3\2\2\2\u00ad\u00af\7\25\2\2\u00ae\u00b0\5,\27"+
		"\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\7\26\2\2\u00b2%\3\2\2\2\u00b3\u00b4\5\60\31\2\u00b4\'\3\2\2\2\u00b5\u00b6"+
		"\5\n\6\2\u00b6)\3\2\2\2\u00b7\u00bc\5\60\31\2\u00b8\u00b9\7\21\2\2\u00b9"+
		"\u00bb\5\60\31\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd+\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2"+
		"\5(\25\2\u00c0\u00c1\7\21\2\2\u00c1\u00c3\5(\25\2\u00c2\u00c0\3\2\2\2"+
		"\u00c2\u00c3\3\2\2\2\u00c3-\3\2\2\2\u00c4\u00c5\t\b\2\2\u00c5/\3\2\2\2"+
		"\u00c6\u00ca\7\n\2\2\u00c7\u00c9\t\t\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\61\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\239?FJXcet\u0083\u008a\u0099\u009d\u00a9\u00af\u00bc\u00c2"+
		"\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}