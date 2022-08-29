// Generated from Stelinha.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StelinhaParser}.
 */
public interface StelinhaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(StelinhaParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(StelinhaParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(StelinhaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(StelinhaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(StelinhaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(StelinhaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#comandoLeitura}.
	 * @param ctx the parse tree
	 */
	void enterComandoLeitura(StelinhaParser.ComandoLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#comandoLeitura}.
	 * @param ctx the parse tree
	 */
	void exitComandoLeitura(StelinhaParser.ComandoLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#comandoEscrita}.
	 * @param ctx the parse tree
	 */
	void enterComandoEscrita(StelinhaParser.ComandoEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#comandoEscrita}.
	 * @param ctx the parse tree
	 */
	void exitComandoEscrita(StelinhaParser.ComandoEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#comandoAtrib}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtrib(StelinhaParser.ComandoAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#comandoAtrib}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtrib(StelinhaParser.ComandoAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#comandoDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterComandoDeclaracao(StelinhaParser.ComandoDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#comandoDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitComandoDeclaracao(StelinhaParser.ComandoDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#comandoEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterComandoEnquanto(StelinhaParser.ComandoEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#comandoEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitComandoEnquanto(StelinhaParser.ComandoEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(StelinhaParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(StelinhaParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#subBloco}.
	 * @param ctx the parse tree
	 */
	void enterSubBloco(StelinhaParser.SubBlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#subBloco}.
	 * @param ctx the parse tree
	 */
	void exitSubBloco(StelinhaParser.SubBlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(StelinhaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(StelinhaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link StelinhaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(StelinhaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StelinhaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(StelinhaParser.TermoContext ctx);
}