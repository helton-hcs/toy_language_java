// Generated from ToyLanguage.g4 by ANTLR 4.4

package toyLanguage.gen;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ToyLanguageLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NumberConstant", "IdentifierNondigit", 
		"Digit", "IntegerConstant", "DecimalConstant", "NonzeroDigit", "FloatingConstant", 
		"DecimalFloatingConstant", "FractionalConstant", "ExponentPart", "Sign", 
		"DigitSequence", "EscapeSequence", "SimpleEscapeSequence", "StringLiteral", 
		"SCharSequence", "SChar", "Whitespace", "Newline", "BlockComment", "LineComment", 
		"Comma", "Semi", "Assign", "Arrow", "LeftParen", "RightParen", "LeftBrace", 
		"RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", "AndAnd", 
		"OrOr", "Not", "Equal", "NotEqual", "Less", "LessEqual", "Greater", "GreaterEqual"
	};


	public ToyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ToyLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u0131\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u0087\n\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\7\f\u0091\n\f\f\f\16\f\u0094\13\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\5\17\u009c\n\17\3\17\3\17\3\17\5\17\u00a1\n\17\3\20\5"+
		"\20\u00a4\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ab\n\20\3\21\3\21\5\21"+
		"\u00af\n\21\3\21\3\21\3\21\5\21\u00b4\n\21\3\21\5\21\u00b7\n\21\3\22\3"+
		"\22\3\23\6\23\u00bc\n\23\r\23\16\23\u00bd\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\5\26\u00c7\n\26\3\26\3\26\3\27\6\27\u00cc\n\27\r\27\16\27\u00cd"+
		"\3\30\3\30\5\30\u00d2\n\30\3\31\6\31\u00d5\n\31\r\31\16\31\u00d6\3\31"+
		"\3\31\3\32\3\32\5\32\u00dd\n\32\3\32\5\32\u00e0\n\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\7\33\u00e8\n\33\f\33\16\33\u00eb\13\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\7\34\u00f6\n\34\f\34\16\34\u00f9\13\34\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3."+
		"\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\u00e9"+
		"\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33\2\35"+
		"\2\37\2!\2#\2%\2\'\2)\2+\f-\2/\2\61\r\63\16\65\17\67\209\21;\22=\23?\24"+
		"A\25C\26E\27G\30I\31K\32M\33O\34Q\35S\36U\37W Y![\"]#_$a%c&e\'\3\2\n\5"+
		"\2C\\aac|\3\2\62;\3\2\63;\4\2--//\f\2$$))AA^^cdhhppttvvxx\6\2\f\f\17\17"+
		"$$^^\4\2\13\13\"\"\4\2\f\f\17\17\u0135\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2+\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5l\3\2\2\2"+
		"\7o\3\2\2\2\tu\3\2\2\2\13z\3\2\2\2\r\177\3\2\2\2\17\u0086\3\2\2\2\21\u0088"+
		"\3\2\2\2\23\u008a\3\2\2\2\25\u008c\3\2\2\2\27\u008e\3\2\2\2\31\u0095\3"+
		"\2\2\2\33\u0097\3\2\2\2\35\u00a0\3\2\2\2\37\u00aa\3\2\2\2!\u00b6\3\2\2"+
		"\2#\u00b8\3\2\2\2%\u00bb\3\2\2\2\'\u00bf\3\2\2\2)\u00c1\3\2\2\2+\u00c4"+
		"\3\2\2\2-\u00cb\3\2\2\2/\u00d1\3\2\2\2\61\u00d4\3\2\2\2\63\u00df\3\2\2"+
		"\2\65\u00e3\3\2\2\2\67\u00f1\3\2\2\29\u00fc\3\2\2\2;\u00fe\3\2\2\2=\u0100"+
		"\3\2\2\2?\u0102\3\2\2\2A\u0105\3\2\2\2C\u0107\3\2\2\2E\u0109\3\2\2\2G"+
		"\u010b\3\2\2\2I\u010d\3\2\2\2K\u010f\3\2\2\2M\u0111\3\2\2\2O\u0113\3\2"+
		"\2\2Q\u0115\3\2\2\2S\u0117\3\2\2\2U\u0119\3\2\2\2W\u011c\3\2\2\2Y\u011f"+
		"\3\2\2\2[\u0121\3\2\2\2]\u0124\3\2\2\2_\u0127\3\2\2\2a\u0129\3\2\2\2c"+
		"\u012c\3\2\2\2e\u012e\3\2\2\2gh\7v\2\2hi\7t\2\2ij\7w\2\2jk\7g\2\2k\4\3"+
		"\2\2\2lm\7k\2\2mn\7h\2\2n\6\3\2\2\2op\7h\2\2pq\7c\2\2qr\7n\2\2rs\7u\2"+
		"\2st\7g\2\2t\b\3\2\2\2uv\7r\2\2vw\7c\2\2wx\7u\2\2xy\7u\2\2y\n\3\2\2\2"+
		"z{\7g\2\2{|\7n\2\2|}\7u\2\2}~\7g\2\2~\f\3\2\2\2\177\u0080\7v\2\2\u0080"+
		"\u0081\7j\2\2\u0081\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083\16\3\2\2\2\u0084"+
		"\u0087\5\25\13\2\u0085\u0087\5\33\16\2\u0086\u0084\3\2\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\20\3\2\2\2\u0088\u0089\t\2\2\2\u0089\22\3\2\2\2\u008a\u008b"+
		"\t\3\2\2\u008b\24\3\2\2\2\u008c\u008d\5\27\f\2\u008d\26\3\2\2\2\u008e"+
		"\u0092\5\31\r\2\u008f\u0091\5\23\n\2\u0090\u008f\3\2\2\2\u0091\u0094\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\30\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\t\4\2\2\u0096\32\3\2\2\2\u0097\u0098\5\35\17"+
		"\2\u0098\34\3\2\2\2\u0099\u009b\5\37\20\2\u009a\u009c\5!\21\2\u009b\u009a"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a1\3\2\2\2\u009d\u009e\5%\23\2\u009e"+
		"\u009f\5!\21\2\u009f\u00a1\3\2\2\2\u00a0\u0099\3\2\2\2\u00a0\u009d\3\2"+
		"\2\2\u00a1\36\3\2\2\2\u00a2\u00a4\5%\23\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\60\2\2\u00a6\u00ab\5%\23\2"+
		"\u00a7\u00a8\5%\23\2\u00a8\u00a9\7\60\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a3"+
		"\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab \3\2\2\2\u00ac\u00ae\7g\2\2\u00ad\u00af"+
		"\5#\22\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b7\5%\23\2\u00b1\u00b3\7G\2\2\u00b2\u00b4\5#\22\2\u00b3\u00b2\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\5%\23\2\u00b6"+
		"\u00ac\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\t\5\2\2"+
		"\u00b9$\3\2\2\2\u00ba\u00bc\5\23\n\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be&\3\2\2\2\u00bf\u00c0"+
		"\5)\25\2\u00c0(\3\2\2\2\u00c1\u00c2\7^\2\2\u00c2\u00c3\t\6\2\2\u00c3*"+
		"\3\2\2\2\u00c4\u00c6\7$\2\2\u00c5\u00c7\5-\27\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7$\2\2\u00c9,\3\2\2\2\u00ca"+
		"\u00cc\5/\30\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce.\3\2\2\2\u00cf\u00d2\n\7\2\2\u00d0\u00d2"+
		"\5\'\24\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\60\3\2\2\2\u00d3"+
		"\u00d5\t\b\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\31\2\2\u00d9"+
		"\62\3\2\2\2\u00da\u00dc\7\17\2\2\u00db\u00dd\7\f\2\2\u00dc\u00db\3\2\2"+
		"\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00e0\7\f\2\2\u00df\u00da"+
		"\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\32\2\2"+
		"\u00e2\64\3\2\2\2\u00e3\u00e4\7\61\2\2\u00e4\u00e5\7,\2\2\u00e5\u00e9"+
		"\3\2\2\2\u00e6\u00e8\13\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2"+
		"\u00e9\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\7\61\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\b\33\2\2\u00f0\66\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\7\61"+
		"\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\n\t\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\b\34\2\2\u00fb8\3\2\2\2\u00fc\u00fd"+
		"\7.\2\2\u00fd:\3\2\2\2\u00fe\u00ff\7=\2\2\u00ff<\3\2\2\2\u0100\u0101\7"+
		"?\2\2\u0101>\3\2\2\2\u0102\u0103\7?\2\2\u0103\u0104\7@\2\2\u0104@\3\2"+
		"\2\2\u0105\u0106\7*\2\2\u0106B\3\2\2\2\u0107\u0108\7+\2\2\u0108D\3\2\2"+
		"\2\u0109\u010a\7}\2\2\u010aF\3\2\2\2\u010b\u010c\7\177\2\2\u010cH\3\2"+
		"\2\2\u010d\u010e\7-\2\2\u010eJ\3\2\2\2\u010f\u0110\7/\2\2\u0110L\3\2\2"+
		"\2\u0111\u0112\7,\2\2\u0112N\3\2\2\2\u0113\u0114\7\61\2\2\u0114P\3\2\2"+
		"\2\u0115\u0116\7\'\2\2\u0116R\3\2\2\2\u0117\u0118\7`\2\2\u0118T\3\2\2"+
		"\2\u0119\u011a\7(\2\2\u011a\u011b\7(\2\2\u011bV\3\2\2\2\u011c\u011d\7"+
		"~\2\2\u011d\u011e\7~\2\2\u011eX\3\2\2\2\u011f\u0120\7#\2\2\u0120Z\3\2"+
		"\2\2\u0121\u0122\7?\2\2\u0122\u0123\7?\2\2\u0123\\\3\2\2\2\u0124\u0125"+
		"\7#\2\2\u0125\u0126\7?\2\2\u0126^\3\2\2\2\u0127\u0128\7>\2\2\u0128`\3"+
		"\2\2\2\u0129\u012a\7>\2\2\u012a\u012b\7?\2\2\u012bb\3\2\2\2\u012c\u012d"+
		"\7@\2\2\u012dd\3\2\2\2\u012e\u012f\7@\2\2\u012f\u0130\7?\2\2\u0130f\3"+
		"\2\2\2\25\2\u0086\u0092\u009b\u00a0\u00a3\u00aa\u00ae\u00b3\u00b6\u00bd"+
		"\u00c6\u00cd\u00d1\u00d6\u00dc\u00df\u00e9\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}