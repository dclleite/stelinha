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
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				comando();
				}
				}
				setState(31); 
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
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				comandoLeitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				comandoEscrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				comandoAtrib();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				comandoDeclaracao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				comandoCondicao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				comandoEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(39);
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
	}

	public final ComandoLeituraContext comandoLeitura() throws RecognitionException {
		ComandoLeituraContext _localctx = new ComandoLeituraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comandoLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(LER);
			setState(43);
			match(ID);
			setState(44);
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
	}

	public final ComandoEscritaContext comandoEscrita() throws RecognitionException {
		ComandoEscritaContext _localctx = new ComandoEscritaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandoEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(IMPRIMIR);
			setState(47);
			expressao();
			setState(48);
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
	}

	public final ComandoAtribContext comandoAtrib() throws RecognitionException {
		ComandoAtribContext _localctx = new ComandoAtribContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandoAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
			setState(51);
			match(RECEBE);
			setState(52);
			expressao();
			setState(53);
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
	}

	public final ComandoDeclaracaoContext comandoDeclaracao() throws RecognitionException {
		ComandoDeclaracaoContext _localctx = new ComandoDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comandoDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(TIPO);
			setState(56);
			match(ID);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RECEBE) {
				{
				{
				setState(57);
				match(RECEBE);
				setState(58);
				expressao();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
	}

	public final ComandoEnquantoContext comandoEnquanto() throws RecognitionException {
		ComandoEnquantoContext _localctx = new ComandoEnquantoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comandoEnquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ENQUANTO);
			setState(67);
			expressao();
			setState(68);
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
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandoCondicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				{
				{
				setState(70);
				match(SE);
				setState(71);
				match(AP);
				setState(72);
				expressao();
				setState(73);
				match(FP);
				}
				}
				break;
			case SENAO:
				{
				setState(75);
				match(SENAO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
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
	}

	public final SubBlocoContext subBloco() throws RecognitionException {
		SubBlocoContext _localctx = new SubBlocoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subBloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(AC);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				comando();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIPO) | (1L << SE) | (1L << SENAO) | (1L << ENQUANTO) | (1L << LER) | (1L << IMPRIMIR) | (1L << ID))) != 0) );
			setState(86);
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
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressao);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AP) {
				{
				{
				setState(88);
				match(AP);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(94);
				match(T__0);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			termo();
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					match(FP);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPARIT) | (1L << OPREL) | (1L << OPBOL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(108);
					expressao();
					}
					} 
				}
				setState(113);
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
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 w\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\6\3 \n\3\r\3\16\3!\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\7\b>\n\b\f\b\16\bA\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\nO\n\n\3\n\3\n\3\13\3\13\6\13U\n\13\r\13\16\13"+
		"V\3\13\3\13\3\f\7\f\\\n\f\f\f\16\f_\13\f\3\f\7\fb\n\f\f\f\16\fe\13\f\3"+
		"\f\3\f\7\fi\n\f\f\f\16\fl\13\f\3\f\3\f\7\fp\n\f\f\f\16\fs\13\f\3\r\3\r"+
		"\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\25\27\3\2\17\23\2x\2"+
		"\32\3\2\2\2\4\37\3\2\2\2\6*\3\2\2\2\b,\3\2\2\2\n\60\3\2\2\2\f\64\3\2\2"+
		"\2\169\3\2\2\2\20D\3\2\2\2\22N\3\2\2\2\24R\3\2\2\2\26]\3\2\2\2\30t\3\2"+
		"\2\2\32\33\7\4\2\2\33\34\5\4\3\2\34\35\7\5\2\2\35\3\3\2\2\2\36 \5\6\4"+
		"\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#+\5\b\5"+
		"\2$+\5\n\6\2%+\5\f\7\2&+\5\16\b\2\'+\5\22\n\2(+\5\20\t\2)+\5\22\n\2*#"+
		"\3\2\2\2*$\3\2\2\2*%\3\2\2\2*&\3\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2"+
		"+\7\3\2\2\2,-\7\13\2\2-.\7\17\2\2./\7\36\2\2/\t\3\2\2\2\60\61\7\f\2\2"+
		"\61\62\5\26\f\2\62\63\7\36\2\2\63\13\3\2\2\2\64\65\7\17\2\2\65\66\7\24"+
		"\2\2\66\67\5\26\f\2\678\7\36\2\28\r\3\2\2\29:\7\6\2\2:?\7\17\2\2;<\7\24"+
		"\2\2<>\5\26\f\2=;\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3"+
		"\2\2\2BC\7\36\2\2C\17\3\2\2\2DE\7\t\2\2EF\5\26\f\2FG\5\24\13\2G\21\3\2"+
		"\2\2HI\7\7\2\2IJ\7\32\2\2JK\5\26\f\2KL\7\33\2\2LO\3\2\2\2MO\7\b\2\2NH"+
		"\3\2\2\2NM\3\2\2\2OP\3\2\2\2PQ\5\24\13\2Q\23\3\2\2\2RT\7\34\2\2SU\5\6"+
		"\4\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\35\2\2Y\25"+
		"\3\2\2\2Z\\\7\32\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^c\3\2\2"+
		"\2_]\3\2\2\2`b\7\3\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2"+
		"\2ec\3\2\2\2fj\5\30\r\2gi\7\33\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2"+
		"\2\2kq\3\2\2\2lj\3\2\2\2mn\t\2\2\2np\5\26\f\2om\3\2\2\2ps\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2r\27\3\2\2\2sq\3\2\2\2tu\t\3\2\2u\31\3\2\2\2\13!*?NV]"+
		"cjq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}