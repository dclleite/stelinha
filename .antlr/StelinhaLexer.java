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
		T__0=1, PROGRAMA=2, FIM=3, TIPO=4, SE=5, SENAO=6, ENQUANTO=7, PARA=8, 
		LER=9, IMPRIMIR=10, RETORNAR=11, FUNCAO=12, ID=13, NUM=14, CARAC=15, VERDADE=16, 
		MENTIRA=17, RECEBE=18, OPARIT=19, OPREL=20, OPBOL=21, OPINCR=22, OPDECR=23, 
		AP=24, FP=25, AC=26, FC=27, FL=28, WS=29, ErrorChar=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PROGRAMA", "FIM", "TIPO", "SE", "SENAO", "ENQUANTO", "PARA", 
			"LER", "IMPRIMIR", "RETORNAR", "FUNCAO", "ID", "NUM", "CARAC", "VERDADE", 
			"MENTIRA", "RECEBE", "OPARIT", "OPREL", "OPBOL", "OPINCR", "OPDECR", 
			"AP", "FP", "AC", "FC", "FL", "WS", "ErrorChar", "DIGITO", "LETRA", "LETRAMINUSCULA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'programa'", "'fim'", null, "'SE'", "'SENAO'", "'ENQUANTO'", 
			"'PARA'", "'LER'", "'IMPRIMIR'", "'RETORNAR'", "'FUNCAO'", null, null, 
			null, "'VERDADE'", "'MENTIRA'", "'='", null, null, null, "'++'", "'--'", 
			"'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PROGRAMA", "FIM", "TIPO", "SE", "SENAO", "ENQUANTO", "PARA", 
			"LER", "IMPRIMIR", "RETORNAR", "FUNCAO", "ID", "NUM", "CARAC", "VERDADE", 
			"MENTIRA", "RECEBE", "OPARIT", "OPREL", "OPBOL", "OPINCR", "OPDECR", 
			"AP", "FP", "AC", "FC", "FL", "WS", "ErrorChar"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u0110\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5u\n\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\6\16\u00ac\n\16\r\16\16\16\u00ad\3\16\3\16\7\16\u00b2\n"+
		"\16\f\16\16\16\u00b5\13\16\3\17\6\17\u00b8\n\17\r\17\16\17\u00b9\3\17"+
		"\3\17\6\17\u00be\n\17\r\17\16\17\u00bf\5\17\u00c2\n\17\3\20\3\20\7\20"+
		"\u00c6\n\20\f\20\16\20\u00c9\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ea\n\25\3\26"+
		"\3\26\3\26\3\26\5\26\u00f0\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\6\36\u0103\n\36\r\36\16"+
		"\36\u0104\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\2\2#\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2A\2C\2\3\2\t"+
		"\4\2\f\f\17\17\6\2\'\',-//\61\61\4\2>>@@\5\2\13\f\17\17\"\"\3\2\62;\4"+
		"\2C\\c|\3\2c|\2\u011d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7P\3\2\2"+
		"\2\tt\3\2\2\2\13v\3\2\2\2\ry\3\2\2\2\17\177\3\2\2\2\21\u0088\3\2\2\2\23"+
		"\u008d\3\2\2\2\25\u0091\3\2\2\2\27\u009a\3\2\2\2\31\u00a3\3\2\2\2\33\u00ab"+
		"\3\2\2\2\35\u00b7\3\2\2\2\37\u00c3\3\2\2\2!\u00cc\3\2\2\2#\u00d4\3\2\2"+
		"\2%\u00dc\3\2\2\2\'\u00de\3\2\2\2)\u00e9\3\2\2\2+\u00ef\3\2\2\2-\u00f1"+
		"\3\2\2\2/\u00f4\3\2\2\2\61\u00f7\3\2\2\2\63\u00f9\3\2\2\2\65\u00fb\3\2"+
		"\2\2\67\u00fd\3\2\2\29\u00ff\3\2\2\2;\u0102\3\2\2\2=\u0108\3\2\2\2?\u010a"+
		"\3\2\2\2A\u010c\3\2\2\2C\u010e\3\2\2\2EF\7#\2\2F\4\3\2\2\2GH\7r\2\2HI"+
		"\7t\2\2IJ\7q\2\2JK\7i\2\2KL\7t\2\2LM\7c\2\2MN\7o\2\2NO\7c\2\2O\6\3\2\2"+
		"\2PQ\7h\2\2QR\7k\2\2RS\7o\2\2S\b\3\2\2\2TU\7K\2\2UV\7P\2\2VW\7V\2\2WX"+
		"\7G\2\2XY\7K\2\2YZ\7T\2\2Zu\7Q\2\2[\\\7H\2\2\\]\7N\2\2]^\7W\2\2^_\7V\2"+
		"\2_`\7W\2\2`a\7C\2\2ab\7P\2\2bc\7V\2\2cu\7G\2\2de\7E\2\2ef\7C\2\2fg\7"+
		"T\2\2gh\7C\2\2hi\7E\2\2ij\7V\2\2jk\7G\2\2ku\7T\2\2lm\7D\2\2mn\7Q\2\2n"+
		"o\7Q\2\2op\7N\2\2pq\7G\2\2qr\7C\2\2rs\7P\2\2su\7Q\2\2tT\3\2\2\2t[\3\2"+
		"\2\2td\3\2\2\2tl\3\2\2\2u\n\3\2\2\2vw\7U\2\2wx\7G\2\2x\f\3\2\2\2yz\7U"+
		"\2\2z{\7G\2\2{|\7P\2\2|}\7C\2\2}~\7Q\2\2~\16\3\2\2\2\177\u0080\7G\2\2"+
		"\u0080\u0081\7P\2\2\u0081\u0082\7S\2\2\u0082\u0083\7W\2\2\u0083\u0084"+
		"\7C\2\2\u0084\u0085\7P\2\2\u0085\u0086\7V\2\2\u0086\u0087\7Q\2\2\u0087"+
		"\20\3\2\2\2\u0088\u0089\7R\2\2\u0089\u008a\7C\2\2\u008a\u008b\7T\2\2\u008b"+
		"\u008c\7C\2\2\u008c\22\3\2\2\2\u008d\u008e\7N\2\2\u008e\u008f\7G\2\2\u008f"+
		"\u0090\7T\2\2\u0090\24\3\2\2\2\u0091\u0092\7K\2\2\u0092\u0093\7O\2\2\u0093"+
		"\u0094\7R\2\2\u0094\u0095\7T\2\2\u0095\u0096\7K\2\2\u0096\u0097\7O\2\2"+
		"\u0097\u0098\7K\2\2\u0098\u0099\7T\2\2\u0099\26\3\2\2\2\u009a\u009b\7"+
		"T\2\2\u009b\u009c\7G\2\2\u009c\u009d\7V\2\2\u009d\u009e\7Q\2\2\u009e\u009f"+
		"\7T\2\2\u009f\u00a0\7P\2\2\u00a0\u00a1\7C\2\2\u00a1\u00a2\7T\2\2\u00a2"+
		"\30\3\2\2\2\u00a3\u00a4\7H\2\2\u00a4\u00a5\7W\2\2\u00a5\u00a6\7P\2\2\u00a6"+
		"\u00a7\7E\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9\7Q\2\2\u00a9\32\3\2\2\2\u00aa"+
		"\u00ac\5C\"\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af\u00b2\5? \2\u00b0\u00b2"+
		"\5A!\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\34\3\2\2\2\u00b5\u00b3\3\2\2"+
		"\2\u00b6\u00b8\5? \2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c1\3\2\2\2\u00bb\u00bd\7\60\2\2"+
		"\u00bc\u00be\5? \2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\36\3\2\2\2\u00c3\u00c7\7$\2\2\u00c4\u00c6\n\2\2\2"+
		"\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7$\2\2\u00cb"+
		" \3\2\2\2\u00cc\u00cd\7X\2\2\u00cd\u00ce\7G\2\2\u00ce\u00cf\7T\2\2\u00cf"+
		"\u00d0\7F\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2\7F\2\2\u00d2\u00d3\7G\2\2"+
		"\u00d3\"\3\2\2\2\u00d4\u00d5\7O\2\2\u00d5\u00d6\7G\2\2\u00d6\u00d7\7P"+
		"\2\2\u00d7\u00d8\7V\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da\7T\2\2\u00da\u00db"+
		"\7C\2\2\u00db$\3\2\2\2\u00dc\u00dd\7?\2\2\u00dd&\3\2\2\2\u00de\u00df\t"+
		"\3\2\2\u00df(\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1\u00ea\7?\2\2\u00e2\u00e3"+
		"\7>\2\2\u00e3\u00ea\7?\2\2\u00e4\u00e5\7@\2\2\u00e5\u00ea\7?\2\2\u00e6"+
		"\u00ea\t\4\2\2\u00e7\u00e8\7#\2\2\u00e8\u00ea\7?\2\2\u00e9\u00e0\3\2\2"+
		"\2\u00e9\u00e2\3\2\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea*\3\2\2\2\u00eb\u00f0\7G\2\2\u00ec\u00ed\7Q\2\2\u00ed\u00f0"+
		"\7W\2\2\u00ee\u00f0\7#\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0,\3\2\2\2\u00f1\u00f2\7-\2\2\u00f2\u00f3\7-\2\2\u00f3"+
		".\3\2\2\2\u00f4\u00f5\7/\2\2\u00f5\u00f6\7/\2\2\u00f6\60\3\2\2\2\u00f7"+
		"\u00f8\7*\2\2\u00f8\62\3\2\2\2\u00f9\u00fa\7+\2\2\u00fa\64\3\2\2\2\u00fb"+
		"\u00fc\7}\2\2\u00fc\66\3\2\2\2\u00fd\u00fe\7\177\2\2\u00fe8\3\2\2\2\u00ff"+
		"\u0100\7=\2\2\u0100:\3\2\2\2\u0101\u0103\t\5\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\b\36\2\2\u0107<\3\2\2\2\u0108\u0109\13\2\2\2\u0109>\3"+
		"\2\2\2\u010a\u010b\t\6\2\2\u010b@\3\2\2\2\u010c\u010d\t\7\2\2\u010dB\3"+
		"\2\2\2\u010e\u010f\t\b\2\2\u010fD\3\2\2\2\16\2t\u00ad\u00b1\u00b3\u00b9"+
		"\u00bf\u00c1\u00c7\u00e9\u00ef\u0104\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}