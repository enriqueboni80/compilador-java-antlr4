// Generated from C:/dev/MeuCompilador/src/main/antlr4/org/example/meucompilador/parser/MeuCompilador.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MeuCompiladorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MeuCompiladorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(MeuCompiladorParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(MeuCompiladorParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#tipo_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_var(MeuCompiladorParser.Tipo_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#declaracao_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_var(MeuCompiladorParser.Declaracao_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(MeuCompiladorParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(MeuCompiladorParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#se_senao_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSe_senao_stmt(MeuCompiladorParser.Se_senao_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#enquanto_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto_stmt(MeuCompiladorParser.Enquanto_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#para_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_stmt(MeuCompiladorParser.Para_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#expressao_booleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao_booleana(MeuCompiladorParser.Expressao_booleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#leia_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeia_stmt(MeuCompiladorParser.Leia_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#escreva_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscreva_stmt(MeuCompiladorParser.Escreva_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(MeuCompiladorParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MeuCompiladorParser#atomo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomo(MeuCompiladorParser.AtomoContext ctx);
}