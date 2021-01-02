// Generated from ILPMLgrammar4tme8.g4 by ANTLR 4.4

    package antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ILPMLgrammar4tme8Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__47=1, T__46=2, T__45=3, T__44=4, T__43=5, T__42=6, T__41=7, T__40=8, 
		T__39=9, T__38=10, T__37=11, T__36=12, T__35=13, T__34=14, T__33=15, T__32=16, 
		T__31=17, T__30=18, T__29=19, T__28=20, T__27=21, T__26=22, T__25=23, 
		T__24=24, T__23=25, T__22=26, T__21=27, T__20=28, T__19=29, T__18=30, 
		T__17=31, T__16=32, T__15=33, T__14=34, T__13=35, T__12=36, T__11=37, 
		T__10=38, T__9=39, T__8=40, T__7=41, T__6=42, T__5=43, T__4=44, T__3=45, 
		T__2=46, T__1=47, T__0=48, IDENT=49, INT=50, FLOAT=51, STRING=52, ESC=53, 
		LINE_COMMENT=54, COMMENT=55, SPACE=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'"
	};
	public static final String[] ruleNames = {
		"T__47", "T__46", "T__45", "T__44", "T__43", "T__42", "T__41", "T__40", 
		"T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", 
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "IDENT", 
		"INT", "FLOAT", "STRING", "ESC", "LINE_COMMENT", "COMMENT", "SPACE"
	};


	public ILPMLgrammar4tme8Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ILPMLgrammar4tme8.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u016b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\7\62\u0126\n\62\f\62\16\62\u0129\13\62\3\63\6\63\u012c\n\63"+
		"\r\63\16\63\u012d\3\64\7\64\u0131\n\64\f\64\16\64\u0134\13\64\3\64\3\64"+
		"\7\64\u0138\n\64\f\64\16\64\u013b\13\64\3\65\3\65\3\65\7\65\u0140\n\65"+
		"\f\65\16\65\u0143\13\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\7"+
		"\67\u014e\n\67\f\67\16\67\u0151\13\67\3\67\3\67\38\38\38\38\38\38\78\u015b"+
		"\n8\f8\168\u015e\138\38\38\38\38\38\39\69\u0166\n9\r9\169\u0167\39\39"+
		"\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:\3\2\13\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2$$^^\7\2$$^^ppttvv"+
		"\4\2\f\f\17\17\3\2\61\61\3\2,,\5\2\13\f\17\17\"\"\u0174\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7{\3\2\2\2\t\u0083\3\2\2\2\13\u0088\3"+
		"\2\2\2\r\u008c\3\2\2\2\17\u008f\3\2\2\2\21\u0095\3\2\2\2\23\u009b\3\2"+
		"\2\2\25\u009d\3\2\2\2\27\u009f\3\2\2\2\31\u00a1\3\2\2\2\33\u00a3\3\2\2"+
		"\2\35\u00ab\3\2\2\2\37\u00ae\3\2\2\2!\u00b0\3\2\2\2#\u00b4\3\2\2\2%\u00b7"+
		"\3\2\2\2\'\u00b9\3\2\2\2)\u00bc\3\2\2\2+\u00be\3\2\2\2-\u00c0\3\2\2\2"+
		"/\u00c4\3\2\2\2\61\u00c6\3\2\2\2\63\u00cc\3\2\2\2\65\u00ce\3\2\2\2\67"+
		"\u00d5\3\2\2\29\u00dc\3\2\2\2;\u00e0\3\2\2\2=\u00e3\3\2\2\2?\u00e5\3\2"+
		"\2\2A\u00e7\3\2\2\2C\u00ea\3\2\2\2E\u00ec\3\2\2\2G\u00ee\3\2\2\2I\u00f0"+
		"\3\2\2\2K\u00f2\3\2\2\2M\u00f6\3\2\2\2O\u00f8\3\2\2\2Q\u00fd\3\2\2\2S"+
		"\u0100\3\2\2\2U\u0109\3\2\2\2W\u010f\3\2\2\2Y\u0114\3\2\2\2[\u0116\3\2"+
		"\2\2]\u011a\3\2\2\2_\u011f\3\2\2\2a\u0121\3\2\2\2c\u0123\3\2\2\2e\u012b"+
		"\3\2\2\2g\u0132\3\2\2\2i\u013c\3\2\2\2k\u0146\3\2\2\2m\u0149\3\2\2\2o"+
		"\u0154\3\2\2\2q\u0165\3\2\2\2st\7\61\2\2t\4\3\2\2\2uv\7e\2\2vw\7c\2\2"+
		"wx\7v\2\2xy\7e\2\2yz\7j\2\2z\6\3\2\2\2{|\7h\2\2|}\7k\2\2}~\7p\2\2~\177"+
		"\7c\2\2\177\u0080\7n\2\2\u0080\u0081\7n\2\2\u0081\u0082\7{\2\2\u0082\b"+
		"\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7w\2\2\u0086"+
		"\u0087\7g\2\2\u0087\n\3\2\2\2\u0088\u0089\7p\2\2\u0089\u008a\7g\2\2\u008a"+
		"\u008b\7y\2\2\u008b\f\3\2\2\2\u008c\u008d\7#\2\2\u008d\u008e\7?\2\2\u008e"+
		"\16\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7n\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7u\2\2\u0093\u0094\7u\2\2\u0094\20\3\2\2\2\u0095\u0096\7y\2\2\u0096"+
		"\u0097\7j\2\2\u0097\u0098\7k\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2"+
		"\u009a\22\3\2\2\2\u009b\u009c\7}\2\2\u009c\24\3\2\2\2\u009d\u009e\7=\2"+
		"\2\u009e\26\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7"+
		"\177\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7z\2\2\u00a5"+
		"\u00a6\7v\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7f\2\2"+
		"\u00a9\u00aa\7u\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7"+
		"h\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7`\2\2\u00af \3\2\2\2\u00b0\u00b1\7"+
		"v\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7{\2\2\u00b3\"\3\2\2\2\u00b4\u00b5"+
		"\7>\2\2\u00b5\u00b6\7?\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7(\2\2\u00b8&\3"+
		"\2\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7q\2\2\u00bb(\3\2\2\2\u00bc\u00bd"+
		"\7*\2\2\u00bd*\3\2\2\2\u00be\u00bf\7,\2\2\u00bf,\3\2\2\2\u00c0\u00c1\7"+
		"j\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7u\2\2\u00c3.\3\2\2\2\u00c4\u00c5"+
		"\7.\2\2\u00c5\60\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9"+
		"\7n\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7g\2\2\u00cb\62\3\2\2\2\u00cc\u00cd"+
		"\7\60\2\2\u00cd\64\3\2\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7f\2\2"+
		"\u00d4\66\3\2\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7"+
		"o\2\2\u00d8\u00d9\7d\2\2\u00d9\u00da\7f\2\2\u00da\u00db\7c\2\2\u00db8"+
		"\3\2\2\2\u00dc\u00dd\7x\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7t\2\2\u00df"+
		":\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1\u00e2\7?\2\2\u00e2<\3\2\2\2\u00e3\u00e4"+
		"\7]\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7~\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7"+
		"?\2\2\u00e8\u00e9\7?\2\2\u00e9B\3\2\2\2\u00ea\u00eb\7>\2\2\u00ebD\3\2"+
		"\2\2\u00ec\u00ed\7_\2\2\u00edF\3\2\2\2\u00ee\u00ef\7@\2\2\u00efH\3\2\2"+
		"\2\u00f0\u00f1\7#\2\2\u00f1J\3\2\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7"+
		"g\2\2\u00f4\u00f5\7v\2\2\u00f5L\3\2\2\2\u00f6\u00f7\7\'\2\2\u00f7N\3\2"+
		"\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc"+
		"\7g\2\2\u00fcP\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7p\2\2\u00ffR\3"+
		"\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7w\2\2\u0102\u0103\7p\2\2\u0103"+
		"\u0104\7e\2\2\u0104\u0105\7v\2\2\u0105\u0106\7k\2\2\u0106\u0107\7q\2\2"+
		"\u0107\u0108\7p\2\2\u0108T\3\2\2\2\u0109\u010a\7u\2\2\u010a\u010b\7w\2"+
		"\2\u010b\u010c\7r\2\2\u010c\u010d\7g\2\2\u010d\u010e\7t\2\2\u010eV\3\2"+
		"\2\2\u010f\u0110\7u\2\2\u0110\u0111\7g\2\2\u0111\u0112\7n\2\2\u0112\u0113"+
		"\7h\2\2\u0113X\3\2\2\2\u0114\u0115\7+\2\2\u0115Z\3\2\2\2\u0116\u0117\7"+
		"c\2\2\u0117\u0118\7p\2\2\u0118\u0119\7f\2\2\u0119\\\3\2\2\2\u011a\u011b"+
		"\7v\2\2\u011b\u011c\7j\2\2\u011c\u011d\7g\2\2\u011d\u011e\7p\2\2\u011e"+
		"^\3\2\2\2\u011f\u0120\7-\2\2\u0120`\3\2\2\2\u0121\u0122\7/\2\2\u0122b"+
		"\3\2\2\2\u0123\u0127\t\2\2\2\u0124\u0126\t\3\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128d\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u012a\u012c\t\4\2\2\u012b\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012ef\3\2\2\2\u012f"+
		"\u0131\t\4\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0139\7\60\2\2\u0136\u0138\t\4\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3"+
		"\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013ah\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013c\u0141\7$\2\2\u013d\u0140\5k\66\2\u013e\u0140\n\5\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u0145\7$\2\2\u0145j\3\2\2\2\u0146\u0147\7^\2\2\u0147\u0148\t\6\2\2\u0148"+
		"l\3\2\2\2\u0149\u014a\7\61\2\2\u014a\u014b\7\61\2\2\u014b\u014f\3\2\2"+
		"\2\u014c\u014e\n\7\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0153\b\67\2\2\u0153n\3\2\2\2\u0154\u0155\7\61\2\2\u0155\u0156\7,\2\2"+
		"\u0156\u015c\3\2\2\2\u0157\u0158\7,\2\2\u0158\u015b\n\b\2\2\u0159\u015b"+
		"\n\t\2\2\u015a\u0157\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015f\u0160\7,\2\2\u0160\u0161\7\61\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\b8\2\2\u0163p\3\2\2\2\u0164\u0166\t\n\2\2\u0165\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\b9\2\2\u016ar\3\2\2\2\r\2\u0127\u012d\u0132\u0139\u013f"+
		"\u0141\u014f\u015a\u015c\u0167\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}