// Generated from /home/dclleite/ufla/compiladores/stelinha/Stelinha.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StelinhaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, SE=2, SENAO=3, ENTAO=4, ENQUANTO=5, PARA=6, LER=7, IMPRIMIR=8, 
		RETORNAR=9, FUNCAO=10, ID=11, NUM=12, CARAC=13, VERDADE=14, MENTIRA=15, 
		RECEBE=16, OPARIT=17, OPREL=18, OPBOL=19, OPINCR=20, OPDECR=21, AP=22, 
		FP=23, AC=24, FC=25, FL=26, WS=27, ErrorChar=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TIPO", "SE", "SENAO", "ENTAO", "ENQUANTO", "PARA", "LER", "IMPRIMIR", 
			"RETORNAR", "FUNCAO", "ID", "NUM", "CARAC", "VERDADE", "MENTIRA", "RECEBE", 
			"OPARIT", "OPREL", "OPBOL", "OPINCR", "OPDECR", "AP", "FP", "AC", "FC", 
			"FL", "WS", "ErrorChar", "DIGITO", "LETRA", "LETRAMINUSCULA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'SE'", "'SENAO'", "'ENTAO'", "'ENQUANTO'", "'PARA'", "'LER'", 
			"'IMPRIMIR'", "'RETORNAR'", "'FUNCAO'", null, null, null, "'VERDADE'", 
			"'MENTIRA'", "'='", null, null, null, "'++'", "'--'", "'('", "')'", "'{'", 
			"'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TIPO", "SE", "SENAO", "ENTAO", "ENQUANTO", "PARA", "LER", "IMPRIMIR", 
			"RETORNAR", "FUNCAO", "ID", "NUM", "CARAC", "VERDADE", "MENTIRA", "RECEBE", 
			"OPARIT", "OPREL", "OPBOL", "OPINCR", "OPDECR", "AP", "FP", "AC", "FC", 
			"FL", "WS", "ErrorChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public StelinhaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stelinha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0103\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2b\n\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u009f\n\f\r\f\16\f\u00a0\3\f\3"+
		"\f\7\f\u00a5\n\f\f\f\16\f\u00a8\13\f\3\r\6\r\u00ab\n\r\r\r\16\r\u00ac"+
		"\3\r\3\r\6\r\u00b1\n\r\r\r\16\r\u00b2\5\r\u00b5\n\r\3\16\3\16\7\16\u00b9"+
		"\n\16\f\16\16\16\u00bc\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00dd\n\23\3\24\3\24"+
		"\3\24\3\24\5\24\u00e3\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00f6\n\34\r\34\16\34\u00f7"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \2\2!\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2?\2\3\2\t\4\2\f\f"+
		"\17\17\6\2\'\',-//\61\61\4\2>>@@\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\c|\3"+
		"\2c|\2\u0110\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7f\3\2\2\2\tl\3\2\2\2\13r\3\2\2\2\r{\3\2"+
		"\2\2\17\u0080\3\2\2\2\21\u0084\3\2\2\2\23\u008d\3\2\2\2\25\u0096\3\2\2"+
		"\2\27\u009e\3\2\2\2\31\u00aa\3\2\2\2\33\u00b6\3\2\2\2\35\u00bf\3\2\2\2"+
		"\37\u00c7\3\2\2\2!\u00cf\3\2\2\2#\u00d1\3\2\2\2%\u00dc\3\2\2\2\'\u00e2"+
		"\3\2\2\2)\u00e4\3\2\2\2+\u00e7\3\2\2\2-\u00ea\3\2\2\2/\u00ec\3\2\2\2\61"+
		"\u00ee\3\2\2\2\63\u00f0\3\2\2\2\65\u00f2\3\2\2\2\67\u00f5\3\2\2\29\u00fb"+
		"\3\2\2\2;\u00fd\3\2\2\2=\u00ff\3\2\2\2?\u0101\3\2\2\2AB\7K\2\2BC\7P\2"+
		"\2CD\7V\2\2DE\7G\2\2EF\7K\2\2FG\7T\2\2Gb\7Q\2\2HI\7H\2\2IJ\7N\2\2JK\7"+
		"W\2\2KL\7V\2\2LM\7W\2\2MN\7C\2\2NO\7P\2\2OP\7V\2\2Pb\7G\2\2QR\7E\2\2R"+
		"S\7C\2\2ST\7T\2\2TU\7C\2\2UV\7E\2\2VW\7V\2\2WX\7G\2\2Xb\7T\2\2YZ\7D\2"+
		"\2Z[\7Q\2\2[\\\7Q\2\2\\]\7N\2\2]^\7G\2\2^_\7C\2\2_`\7P\2\2`b\7Q\2\2aA"+
		"\3\2\2\2aH\3\2\2\2aQ\3\2\2\2aY\3\2\2\2b\4\3\2\2\2cd\7U\2\2de\7G\2\2e\6"+
		"\3\2\2\2fg\7U\2\2gh\7G\2\2hi\7P\2\2ij\7C\2\2jk\7Q\2\2k\b\3\2\2\2lm\7G"+
		"\2\2mn\7P\2\2no\7V\2\2op\7C\2\2pq\7Q\2\2q\n\3\2\2\2rs\7G\2\2st\7P\2\2"+
		"tu\7S\2\2uv\7W\2\2vw\7C\2\2wx\7P\2\2xy\7V\2\2yz\7Q\2\2z\f\3\2\2\2{|\7"+
		"R\2\2|}\7C\2\2}~\7T\2\2~\177\7C\2\2\177\16\3\2\2\2\u0080\u0081\7N\2\2"+
		"\u0081\u0082\7G\2\2\u0082\u0083\7T\2\2\u0083\20\3\2\2\2\u0084\u0085\7"+
		"K\2\2\u0085\u0086\7O\2\2\u0086\u0087\7R\2\2\u0087\u0088\7T\2\2\u0088\u0089"+
		"\7K\2\2\u0089\u008a\7O\2\2\u008a\u008b\7K\2\2\u008b\u008c\7T\2\2\u008c"+
		"\22\3\2\2\2\u008d\u008e\7T\2\2\u008e\u008f\7G\2\2\u008f\u0090\7V\2\2\u0090"+
		"\u0091\7Q\2\2\u0091\u0092\7T\2\2\u0092\u0093\7P\2\2\u0093\u0094\7C\2\2"+
		"\u0094\u0095\7T\2\2\u0095\24\3\2\2\2\u0096\u0097\7H\2\2\u0097\u0098\7"+
		"W\2\2\u0098\u0099\7P\2\2\u0099\u009a\7E\2\2\u009a\u009b\7C\2\2\u009b\u009c"+
		"\7Q\2\2\u009c\26\3\2\2\2\u009d\u009f\5? \2\u009e\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a6\3\2\2\2\u00a2"+
		"\u00a5\5;\36\2\u00a3\u00a5\5=\37\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\30\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\5;\36\2\u00aa\u00a9\3\2\2"+
		"\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4"+
		"\3\2\2\2\u00ae\u00b0\7\60\2\2\u00af\u00b1\5;\36\2\u00b0\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\32\3\2\2\2\u00b6"+
		"\u00ba\7$\2\2\u00b7\u00b9\n\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\7$\2\2\u00be\34\3\2\2\2\u00bf\u00c0\7X\2\2"+
		"\u00c0\u00c1\7G\2\2\u00c1\u00c2\7T\2\2\u00c2\u00c3\7F\2\2\u00c3\u00c4"+
		"\7C\2\2\u00c4\u00c5\7F\2\2\u00c5\u00c6\7G\2\2\u00c6\36\3\2\2\2\u00c7\u00c8"+
		"\7O\2\2\u00c8\u00c9\7G\2\2\u00c9\u00ca\7P\2\2\u00ca\u00cb\7V\2\2\u00cb"+
		"\u00cc\7K\2\2\u00cc\u00cd\7T\2\2\u00cd\u00ce\7C\2\2\u00ce \3\2\2\2\u00cf"+
		"\u00d0\7?\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\t\3\2\2\u00d2$\3\2\2\2\u00d3"+
		"\u00d4\7?\2\2\u00d4\u00dd\7?\2\2\u00d5\u00d6\7>\2\2\u00d6\u00dd\7?\2\2"+
		"\u00d7\u00d8\7@\2\2\u00d8\u00dd\7?\2\2\u00d9\u00dd\t\4\2\2\u00da\u00db"+
		"\7#\2\2\u00db\u00dd\7?\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dc"+
		"\u00d7\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd&\3\2\2\2"+
		"\u00de\u00e3\7G\2\2\u00df\u00e0\7Q\2\2\u00e0\u00e3\7W\2\2\u00e1\u00e3"+
		"\7#\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"(\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5\u00e6\7-\2\2\u00e6*\3\2\2\2\u00e7\u00e8"+
		"\7/\2\2\u00e8\u00e9\7/\2\2\u00e9,\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb.\3"+
		"\2\2\2\u00ec\u00ed\7+\2\2\u00ed\60\3\2\2\2\u00ee\u00ef\7}\2\2\u00ef\62"+
		"\3\2\2\2\u00f0\u00f1\7\177\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7=\2\2\u00f3"+
		"\66\3\2\2\2\u00f4\u00f6\t\5\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2"+
		"\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\b\34\2\2\u00fa8\3\2\2\2\u00fb\u00fc\13\2\2\2\u00fc:\3\2\2\2\u00fd\u00fe"+
		"\t\6\2\2\u00fe<\3\2\2\2\u00ff\u0100\t\7\2\2\u0100>\3\2\2\2\u0101\u0102"+
		"\t\b\2\2\u0102@\3\2\2\2\16\2a\u00a0\u00a4\u00a6\u00ac\u00b2\u00b4\u00ba"+
		"\u00dc\u00e2\u00f7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}