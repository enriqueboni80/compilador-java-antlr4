// Generated from C:/dev/MeuCompilador/src/main/antlr4/org/example/meucompilador/parser/MeuCompilador.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MeuCompiladorParser}.
 */
public interface MeuCompiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MeuCompiladorParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MeuCompiladorParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(MeuCompiladorParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(MeuCompiladorParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(MeuCompiladorParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(MeuCompiladorParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#declaracao_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_var(MeuCompiladorParser.Declaracao_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#declaracao_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_var(MeuCompiladorParser.Declaracao_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(MeuCompiladorParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(MeuCompiladorParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(MeuCompiladorParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(MeuCompiladorParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#se_senao_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSe_senao_stmt(MeuCompiladorParser.Se_senao_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#se_senao_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSe_senao_stmt(MeuCompiladorParser.Se_senao_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#enquanto_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto_stmt(MeuCompiladorParser.Enquanto_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#enquanto_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto_stmt(MeuCompiladorParser.Enquanto_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#para_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPara_stmt(MeuCompiladorParser.Para_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#para_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPara_stmt(MeuCompiladorParser.Para_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#expressao_booleana}.
	 * @param ctx the parse tree
	 */
	void enterExpressao_booleana(MeuCompiladorParser.Expressao_booleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#expressao_booleana}.
	 * @param ctx the parse tree
	 */
	void exitExpressao_booleana(MeuCompiladorParser.Expressao_booleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#leia_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLeia_stmt(MeuCompiladorParser.Leia_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#leia_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLeia_stmt(MeuCompiladorParser.Leia_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#escreva_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEscreva_stmt(MeuCompiladorParser.Escreva_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#escreva_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEscreva_stmt(MeuCompiladorParser.Escreva_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(MeuCompiladorParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(MeuCompiladorParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MeuCompiladorParser#atomo}.
	 * @param ctx the parse tree
	 */
	void enterAtomo(MeuCompiladorParser.AtomoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MeuCompiladorParser#atomo}.
	 * @param ctx the parse tree
	 */
	void exitAtomo(MeuCompiladorParser.AtomoContext ctx);
}