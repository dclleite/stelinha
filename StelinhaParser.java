// Generated from Stelinha.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PROGRAMA=2, FIM=3, TIPO=4, SE=5, SENAO=6, ENQUANTO=7, PARA=8, 
		LER=9, IMPRIMIR=10, RETORNAR=11, FUNCAO=12, ID=13, NUM=14, CARAC=15, VERDADE=16, 
		MENTIRA=17, RECEBE=18, OPARIT=19, OPREL=20, OPBOL=21, OPINCR=22, OPDECR=23, 
		AP=24, FP=25, AC=26, FC=27, FL=28, WS=29, ErrorChar=30;
	public static final int
		RULE_inicio = 0, RULE_bloco = 1, RULE_comando = 2, RULE_comandoLeitura = 3, 
		RULE_comandoEscrita = 4, RULE_comandoAtrib = 5, RULE_comandoDeclaracao = 6, 
		RULE_comandoEnquanto = 7, RULE_comandoCondicao = 8, RULE_subBloco = 9, 
		RULE_expressao = 10, RULE_termo = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "bloco", "comando", "comandoLeitura", "comandoEscrita", "comandoAtrib", 
			"comandoDeclaracao", "comandoEnquanto", "comandoCondicao", "subBloco", 
			"expressao", "termo"
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
		public TerminalNode PROGRAMA() { return getToken(StelinhaParser.PROGRAMA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(StelinhaParser.FIM, 0); }
		public TerminalNode EOF() { return getToken(StelinhaParser.EOF, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(PROGRAMA);
			setState(25);
			bloco();
			setState(26);
			match(FIM);
			setState(27);
			match(EOF);
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

	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				comando();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << SE) | (1L << SENAO) | (1L << ENQUANTO) | (1L << LER) | (1L << IMPRIMIR) | (1L << ID))) != 0) );
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoLeituraContext comandoLeitura() {
			return getRuleContext(ComandoLeituraContext.class,0);
		}
		public ComandoEscritaContext comandoEscrita() {
			return getRuleContext(ComandoEscritaContext.class,0);
		}
		public ComandoAtribContext comandoAtrib() {
			return getRuleContext(ComandoAtribContext.class,0);
		}
		public ComandoDeclaracaoContext comandoDeclaracao() {
			return getRuleContext(ComandoDeclaracaoContext.class,0);
		}
		public ComandoCondicaoContext comandoCondicao() {
			return getRuleContext(ComandoCondicaoContext.class,0);
		}
		public ComandoEnquantoContext comandoEnquanto() {
			return getRuleContext(ComandoEnquantoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				comandoLeitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				comandoEscrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				comandoAtrib();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				comandoDeclaracao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				comandoCondicao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				comandoEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				comandoCondicao();
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

	public static class ComandoLeituraContext extends ParserRuleContext {
		public TerminalNode LER() { return getToken(StelinhaParser.LER, 0); }
		public TerminalNode ID() { return getToken(StelinhaParser.ID, 0); }
		public TerminalNode FL() { return getToken(StelinhaParser.FL, 0); }
		public ComandoLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterComandoLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitComandoLeitura(this);
		}
	}

	public final ComandoLeituraContext comandoLeitura() throws RecognitionException {
		ComandoLeituraContext _localctx = new ComandoLeituraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comandoLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(LER);
			setState(44);
			match(ID);
			setState(45);
			match(FL);
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

	public static class ComandoEscritaContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(StelinhaParser.IMPRIMIR, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FL() { return getToken(StelinhaParser.FL, 0); }
		public ComandoEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterComandoEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitComandoEscrita(this);
		}
	}

	public final ComandoEscritaContext comandoEscrita() throws RecognitionException {
		ComandoEscritaContext _localctx = new ComandoEscritaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandoEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IMPRIMIR);
			setState(48);
			expressao();
			setState(49);
			match(FL);
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

	public static class ComandoAtribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StelinhaParser.ID, 0); }
		public TerminalNode RECEBE() { return getToken(StelinhaParser.RECEBE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FL() { return getToken(StelinhaParser.FL, 0); }
		public ComandoAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterComandoAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitComandoAtrib(this);
		}
	}

	public final ComandoAtribContext comandoAtrib() throws RecognitionException {
		ComandoAtribContext _localctx = new ComandoAtribContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandoAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			setState(52);
			match(RECEBE);
			setState(53);
			expressao();
			setState(54);
			match(FL);
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

	public static class ComandoDeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(StelinhaParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(StelinhaParser.ID, 0); }
		public TerminalNode FL() { return getToken(StelinhaParser.FL, 0); }
		public List<TerminalNode> RECEBE() { return getTokens(StelinhaParser.RECEBE); }
		public TerminalNode RECEBE(int i) {
			return getToken(StelinhaParser.RECEBE, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ComandoDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterComandoDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitComandoDeclaracao(this);
		}
	}

	public final ComandoDeclaracaoContext comandoDeclaracao() throws RecognitionException {
		ComandoDeclaracaoContext _localctx = new ComandoDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comandoDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(TIPO);
			setState(57);
			match(ID);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECEBE) {
				{
				{
				setState(58);
				match(RECEBE);
				setState(59);
				expressao();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(FL);
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

	public static class ComandoEnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(StelinhaParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public SubBlocoContext subBloco() {
			return getRuleContext(SubBlocoContext.class,0);
		}
		public ComandoEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterComandoEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitComandoEnquanto(this);
		}
	}

	public final ComandoEnquantoContext comandoEnquanto() throws RecognitionException {
		ComandoEnquantoContext _localctx = new ComandoEnquantoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comandoEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ENQUANTO);
			setState(68);
			expressao();
			setState(69);
			subBloco();
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

	public static class ComandoCondicaoContext extends ParserRuleContext {
		public SubBlocoContext subBloco() {
			return getRuleContext(SubBlocoContext.class,0);
		}
		public TerminalNode SENAO() { return getToken(StelinhaParser.SENAO, 0); }
		public TerminalNode SE() { return getToken(StelinhaParser.SE, 0); }
		public TerminalNode AP() { return getToken(StelinhaParser.AP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(StelinhaParser.FP, 0); }
		public ComandoCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterComandoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitComandoCondicao(this);
		}
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandoCondicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				{
				{
				setState(71);
				match(SE);
				setState(72);
				match(AP);
				setState(73);
				expressao();
				setState(74);
				match(FP);
				}
				}
				break;
			case SENAO:
				{
				setState(76);
				match(SENAO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(79);
			subBloco();
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

	public static class SubBlocoContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(StelinhaParser.AC, 0); }
		public TerminalNode FC() { return getToken(StelinhaParser.FC, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SubBlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subBloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterSubBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitSubBloco(this);
		}
	}

	public final SubBlocoContext subBloco() throws RecognitionException {
		SubBlocoContext _localctx = new SubBlocoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subBloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(AC);
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				comando();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << SE) | (1L << SENAO) | (1L << ENQUANTO) | (1L << LER) | (1L << IMPRIMIR) | (1L << ID))) != 0) );
			setState(87);
			match(FC);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<TerminalNode> AP() { return getTokens(StelinhaParser.AP); }
		public TerminalNode AP(int i) {
			return getToken(StelinhaParser.AP, i);
		}
		public List<TerminalNode> FP() { return getTokens(StelinhaParser.FP); }
		public TerminalNode FP(int i) {
			return getToken(StelinhaParser.FP, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> OPBOL() { return getTokens(StelinhaParser.OPBOL); }
		public TerminalNode OPBOL(int i) {
			return getToken(StelinhaParser.OPBOL, i);
		}
		public List<TerminalNode> OPREL() { return getTokens(StelinhaParser.OPREL); }
		public TerminalNode OPREL(int i) {
			return getToken(StelinhaParser.OPREL, i);
		}
		public List<TerminalNode> OPARIT() { return getTokens(StelinhaParser.OPARIT); }
		public TerminalNode OPARIT(int i) {
			return getToken(StelinhaParser.OPARIT, i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AP) {
				{
				{
				setState(89);
				match(AP);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(95);
				match(T__0);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			termo();
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(FP);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPARIT) | (1L << OPREL) | (1L << OPBOL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(109);
					expressao();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StelinhaParser.ID, 0); }
		public TerminalNode NUM() { return getToken(StelinhaParser.NUM, 0); }
		public TerminalNode CARAC() { return getToken(StelinhaParser.CARAC, 0); }
		public TerminalNode VERDADE() { return getToken(StelinhaParser.VERDADE, 0); }
		public TerminalNode MENTIRA() { return getToken(StelinhaParser.MENTIRA, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StelinhaListener ) ((StelinhaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << CARAC) | (1L << VERDADE) | (1L << MENTIRA))) != 0)) ) {
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
		"\u0004\u0001\u001ev\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004"+
		"\u0001\u001f\b\u0001\u000b\u0001\f\u0001 \u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002*\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006=\b\u0006\n\u0006\f\u0006@\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bN\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004"+
		"\tT\b\t\u000b\t\f\tU\u0001\t\u0001\t\u0001\n\u0005\n[\b\n\n\n\f\n^\t\n"+
		"\u0001\n\u0005\na\b\n\n\n\f\nd\t\n\u0001\n\u0001\n\u0005\nh\b\n\n\n\f"+
		"\nk\t\n\u0001\n\u0001\n\u0005\no\b\n\n\n\f\nr\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0000\u0002\u0001\u0000\u0013\u0015\u0001\u0000\r\u0011w"+
		"\u0000\u0018\u0001\u0000\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000"+
		"\u0004)\u0001\u0000\u0000\u0000\u0006+\u0001\u0000\u0000\u0000\b/\u0001"+
		"\u0000\u0000\u0000\n3\u0001\u0000\u0000\u0000\f8\u0001\u0000\u0000\u0000"+
		"\u000eC\u0001\u0000\u0000\u0000\u0010M\u0001\u0000\u0000\u0000\u0012Q"+
		"\u0001\u0000\u0000\u0000\u0014\\\u0001\u0000\u0000\u0000\u0016s\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005\u0002\u0000\u0000\u0019\u001a\u0003"+
		"\u0002\u0001\u0000\u001a\u001b\u0005\u0003\u0000\u0000\u001b\u001c\u0005"+
		"\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001f\u0003"+
		"\u0004\u0002\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000"+
		"!\u0003\u0001\u0000\u0000\u0000\"*\u0003\u0006\u0003\u0000#*\u0003\b\u0004"+
		"\u0000$*\u0003\n\u0005\u0000%*\u0003\f\u0006\u0000&*\u0003\u0010\b\u0000"+
		"\'*\u0003\u000e\u0007\u0000(*\u0003\u0010\b\u0000)\"\u0001\u0000\u0000"+
		"\u0000)#\u0001\u0000\u0000\u0000)$\u0001\u0000\u0000\u0000)%\u0001\u0000"+
		"\u0000\u0000)&\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001"+
		"\u0000\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+,\u0005\t\u0000\u0000"+
		",-\u0005\r\u0000\u0000-.\u0005\u001c\u0000\u0000.\u0007\u0001\u0000\u0000"+
		"\u0000/0\u0005\n\u0000\u000001\u0003\u0014\n\u000012\u0005\u001c\u0000"+
		"\u00002\t\u0001\u0000\u0000\u000034\u0005\r\u0000\u000045\u0005\u0012"+
		"\u0000\u000056\u0003\u0014\n\u000067\u0005\u001c\u0000\u00007\u000b\u0001"+
		"\u0000\u0000\u000089\u0005\u0004\u0000\u00009>\u0005\r\u0000\u0000:;\u0005"+
		"\u0012\u0000\u0000;=\u0003\u0014\n\u0000<:\u0001\u0000\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u001c\u0000"+
		"\u0000B\r\u0001\u0000\u0000\u0000CD\u0005\u0007\u0000\u0000DE\u0003\u0014"+
		"\n\u0000EF\u0003\u0012\t\u0000F\u000f\u0001\u0000\u0000\u0000GH\u0005"+
		"\u0005\u0000\u0000HI\u0005\u0018\u0000\u0000IJ\u0003\u0014\n\u0000JK\u0005"+
		"\u0019\u0000\u0000KN\u0001\u0000\u0000\u0000LN\u0005\u0006\u0000\u0000"+
		"MG\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OP\u0003\u0012\t\u0000P\u0011\u0001\u0000\u0000\u0000QS\u0005\u001a"+
		"\u0000\u0000RT\u0003\u0004\u0002\u0000SR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WX\u0005\u001b\u0000\u0000X\u0013\u0001\u0000"+
		"\u0000\u0000Y[\u0005\u0018\u0000\u0000ZY\u0001\u0000\u0000\u0000[^\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]b\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_a\u0005\u0001\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000ei\u0003\u0016\u000b\u0000fh\u0005\u0019\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jp\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000lm\u0007\u0000\u0000\u0000mo\u0003\u0014\n\u0000nl\u0001\u0000"+
		"\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q\u0015\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000st\u0007\u0001\u0000\u0000t\u0017\u0001\u0000\u0000\u0000\t )>M"+
		"U\\bip";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}