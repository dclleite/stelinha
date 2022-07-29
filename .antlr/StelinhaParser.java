// Generated from /home/dclleite/ufla/compiladores/stelinha/Stelinha.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StelinhaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TIPO=1, SE=2, SENAO=3, ENTAO=4, ENQUANTO=5, PARA=6, LER=7, IMPRIMIR=8, 
		RETORNAR=9, FUNCAO=10, ID=11, NUM=12, CARAC=13, VERDADE=14, MENTIRA=15, 
		RECEBE=16, OPARIT=17, OPREL=18, OPBOL=19, OPINCR=20, OPDECR=21, AP=22, 
		FP=23, AC=24, FC=25, FL=26, WS=27, ErrorChar=28;
	public static final int
		RULE_inicio = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio"
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

	@Override
	public String getGrammarFileName() { return "Stelinha.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StelinhaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(StelinhaParser.TIPO, 0); }
		public TerminalNode SE() { return getToken(StelinhaParser.SE, 0); }
		public TerminalNode ENQUANTO() { return getToken(StelinhaParser.ENQUANTO, 0); }
		public TerminalNode PARA() { return getToken(StelinhaParser.PARA, 0); }
		public TerminalNode LER() { return getToken(StelinhaParser.LER, 0); }
		public TerminalNode IMPRIMIR() { return getToken(StelinhaParser.IMPRIMIR, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << SE) | (1L << ENQUANTO) | (1L << PARA) | (1L << LER) | (1L << IMPRIMIR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\7\4\2\t\2\3\2"+
		"\3\2\3\2\2\2\3\2\2\3\4\2\3\4\7\n\2\5\2\4\3\2\2\2\4\5\t\2\2\2\5\3\3\2\2"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}