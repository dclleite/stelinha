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
		public TerminalNode EOF() { return getToken(StelinhaParser.EOF, 0); }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 x\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\3\6\3!\n\3\r\3\16\3\"\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\7\b?\n\b\f\b\16\bB\13\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\nP\n\n\3\n\3\n\3\13\3\13\6\13V\n\13\r\13\16"+
		"\13W\3\13\3\13\3\f\7\f]\n\f\f\f\16\f`\13\f\3\f\7\fc\n\f\f\f\16\ff\13\f"+
		"\3\f\3\f\7\fj\n\f\f\f\16\fm\13\f\3\f\3\f\7\fq\n\f\f\f\16\ft\13\f\3\r\3"+
		"\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\25\27\3\2\17\23\2"+
		"y\2\32\3\2\2\2\4 \3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n\61\3\2\2\2\f\65\3\2"+
		"\2\2\16:\3\2\2\2\20E\3\2\2\2\22O\3\2\2\2\24S\3\2\2\2\26^\3\2\2\2\30u\3"+
		"\2\2\2\32\33\7\4\2\2\33\34\5\4\3\2\34\35\7\5\2\2\35\36\7\2\2\3\36\3\3"+
		"\2\2\2\37!\5\6\4\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\5\3\2"+
		"\2\2$,\5\b\5\2%,\5\n\6\2&,\5\f\7\2\',\5\16\b\2(,\5\22\n\2),\5\20\t\2*"+
		",\5\22\n\2+$\3\2\2\2+%\3\2\2\2+&\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2"+
		"\2+*\3\2\2\2,\7\3\2\2\2-.\7\13\2\2./\7\17\2\2/\60\7\36\2\2\60\t\3\2\2"+
		"\2\61\62\7\f\2\2\62\63\5\26\f\2\63\64\7\36\2\2\64\13\3\2\2\2\65\66\7\17"+
		"\2\2\66\67\7\24\2\2\678\5\26\f\289\7\36\2\29\r\3\2\2\2:;\7\6\2\2;@\7\17"+
		"\2\2<=\7\24\2\2=?\5\26\f\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3"+
		"\2\2\2B@\3\2\2\2CD\7\36\2\2D\17\3\2\2\2EF\7\t\2\2FG\5\26\f\2GH\5\24\13"+
		"\2H\21\3\2\2\2IJ\7\7\2\2JK\7\32\2\2KL\5\26\f\2LM\7\33\2\2MP\3\2\2\2NP"+
		"\7\b\2\2OI\3\2\2\2ON\3\2\2\2PQ\3\2\2\2QR\5\24\13\2R\23\3\2\2\2SU\7\34"+
		"\2\2TV\5\6\4\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\35"+
		"\2\2Z\25\3\2\2\2[]\7\32\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2"+
		"_d\3\2\2\2`^\3\2\2\2ac\7\3\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2"+
		"eg\3\2\2\2fd\3\2\2\2gk\5\30\r\2hj\7\33\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2"+
		"\2kl\3\2\2\2lr\3\2\2\2mk\3\2\2\2no\t\2\2\2oq\5\26\f\2pn\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2s\27\3\2\2\2tr\3\2\2\2uv\t\3\2\2v\31\3\2\2\2\13"+
		"\"+@OW^dkr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}