// Generated from C:/dev/MeuCompilador/src/main/antlr4/org/example/meucompilador/parser/MeuCompilador.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MeuCompiladorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		SE=18, SENAO=19, ENTAO=20, ENQUANTO=21, PARA=22, ATE=23, PASSO=24, FIMSE=25, 
		FIMPARA=26, FIMENQUANTO=27, ESCREVA=28, LEIA=29, INTEIRO=30, REAL=31, 
		TEXTO=32, COMENTARIO_LINHA=33, COMENTARIO_BLOCO=34, ID=35, NUMERO_INTEIRO=36, 
		NUMERO_REAL=37, VALOR_TEXTO=38, WS=39;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_tipo_var = 2, RULE_declaracao_var = 3, 
		RULE_atribuicao = 4, RULE_bloco = 5, RULE_se_senao_stmt = 6, RULE_enquanto_stmt = 7, 
		RULE_para_stmt = 8, RULE_expressao_booleana = 9, RULE_leia_stmt = 10, 
		RULE_escreva_stmt = 11, RULE_expressao = 12, RULE_atomo = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "tipo_var", "declaracao_var", "atribuicao", "bloco", 
			"se_senao_stmt", "enquanto_stmt", "para_stmt", "expressao_booleana", 
			"leia_stmt", "escreva_stmt", "expressao", "atomo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'('", "')'", "':'", "'faca:'", "'de'", "'<'", "'>'", 
			"'=='", "'!='", "'<='", "'>='", "'*'", "'/'", "'+'", "'-'", "'se'", "'senao'", 
			"'entao'", "'enquanto'", "'para'", "'ate'", "'passo'", "'fimse'", "'fimpara'", 
			"'fimenquanto'", "'escreva'", "'leia'", "'inteiro'", "'real'", "'texto'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "SE", "SENAO", "ENTAO", "ENQUANTO", 
			"PARA", "ATE", "PASSO", "FIMSE", "FIMPARA", "FIMENQUANTO", "ESCREVA", 
			"LEIA", "INTEIRO", "REAL", "TEXTO", "COMENTARIO_LINHA", "COMENTARIO_BLOCO", 
			"ID", "NUMERO_INTEIRO", "NUMERO_REAL", "VALOR_TEXTO", "WS"
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
	public String getGrammarFileName() { return "MeuCompilador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MeuCompiladorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MeuCompiladorParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			bloco();
			setState(29);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public Declaracao_varContext declaracao_var() {
			return getRuleContext(Declaracao_varContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public Se_senao_stmtContext se_senao_stmt() {
			return getRuleContext(Se_senao_stmtContext.class,0);
		}
		public Enquanto_stmtContext enquanto_stmt() {
			return getRuleContext(Enquanto_stmtContext.class,0);
		}
		public Para_stmtContext para_stmt() {
			return getRuleContext(Para_stmtContext.class,0);
		}
		public Leia_stmtContext leia_stmt() {
			return getRuleContext(Leia_stmtContext.class,0);
		}
		public Escreva_stmtContext escreva_stmt() {
			return getRuleContext(Escreva_stmtContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case REAL:
			case TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				declaracao_var();
				setState(32);
				match(T__0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				atribuicao();
				setState(35);
				match(T__0);
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				se_senao_stmt();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				enquanto_stmt();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				para_stmt();
				}
				break;
			case LEIA:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				leia_stmt();
				setState(41);
				match(T__0);
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				escreva_stmt();
				setState(44);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_varContext extends ParserRuleContext {
		public TerminalNode INTEIRO() { return getToken(MeuCompiladorParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(MeuCompiladorParser.REAL, 0); }
		public TerminalNode TEXTO() { return getToken(MeuCompiladorParser.TEXTO, 0); }
		public Tipo_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterTipo_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitTipo_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitTipo_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_varContext tipo_var() throws RecognitionException {
		Tipo_varContext _localctx = new Tipo_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_varContext extends ParserRuleContext {
		public Tipo_varContext tipo_var() {
			return getRuleContext(Tipo_varContext.class,0);
		}
		public TerminalNode ID() { return getToken(MeuCompiladorParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Declaracao_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterDeclaracao_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitDeclaracao_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitDeclaracao_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_varContext declaracao_var() throws RecognitionException {
		Declaracao_varContext _localctx = new Declaracao_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			tipo_var();
			setState(51);
			match(ID);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(52);
				match(T__1);
				setState(53);
				expressao(0);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MeuCompiladorParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
			setState(57);
			match(T__1);
			setState(58);
			expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
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
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42687791104L) != 0)) {
				{
				{
				setState(60);
				comando();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Se_senao_stmtContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(MeuCompiladorParser.SE, 0); }
		public Expressao_booleanaContext expressao_booleana() {
			return getRuleContext(Expressao_booleanaContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(MeuCompiladorParser.ENTAO, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode FIMSE() { return getToken(MeuCompiladorParser.FIMSE, 0); }
		public TerminalNode SENAO() { return getToken(MeuCompiladorParser.SENAO, 0); }
		public Se_senao_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se_senao_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterSe_senao_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitSe_senao_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitSe_senao_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Se_senao_stmtContext se_senao_stmt() throws RecognitionException {
		Se_senao_stmtContext _localctx = new Se_senao_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_se_senao_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(SE);
			setState(67);
			match(T__2);
			setState(68);
			expressao_booleana();
			setState(69);
			match(T__3);
			setState(70);
			match(ENTAO);
			setState(71);
			match(T__4);
			setState(72);
			bloco();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(73);
				match(SENAO);
				setState(74);
				match(T__4);
				setState(75);
				bloco();
				}
			}

			setState(78);
			match(FIMSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Enquanto_stmtContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(MeuCompiladorParser.ENQUANTO, 0); }
		public Expressao_booleanaContext expressao_booleana() {
			return getRuleContext(Expressao_booleanaContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIMENQUANTO() { return getToken(MeuCompiladorParser.FIMENQUANTO, 0); }
		public Enquanto_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterEnquanto_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitEnquanto_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitEnquanto_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enquanto_stmtContext enquanto_stmt() throws RecognitionException {
		Enquanto_stmtContext _localctx = new Enquanto_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enquanto_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ENQUANTO);
			setState(81);
			match(T__2);
			setState(82);
			expressao_booleana();
			setState(83);
			match(T__3);
			setState(84);
			match(T__5);
			setState(85);
			bloco();
			setState(86);
			match(FIMENQUANTO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Para_stmtContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(MeuCompiladorParser.PARA, 0); }
		public TerminalNode ID() { return getToken(MeuCompiladorParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode ATE() { return getToken(MeuCompiladorParser.ATE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIMPARA() { return getToken(MeuCompiladorParser.FIMPARA, 0); }
		public TerminalNode PASSO() { return getToken(MeuCompiladorParser.PASSO, 0); }
		public Para_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterPara_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitPara_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitPara_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_stmtContext para_stmt() throws RecognitionException {
		Para_stmtContext _localctx = new Para_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_para_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(PARA);
			setState(89);
			match(ID);
			setState(90);
			match(T__6);
			setState(91);
			expressao(0);
			setState(92);
			match(ATE);
			setState(93);
			expressao(0);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PASSO) {
				{
				setState(94);
				match(PASSO);
				setState(95);
				expressao(0);
				}
			}

			setState(98);
			match(T__5);
			setState(99);
			bloco();
			setState(100);
			match(FIMPARA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expressao_booleanaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public Expressao_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_booleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterExpressao_booleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitExpressao_booleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitExpressao_booleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_booleanaContext expressao_booleana() throws RecognitionException {
		Expressao_booleanaContext _localctx = new Expressao_booleanaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressao_booleana);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			expressao(0);
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(104);
			expressao(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Leia_stmtContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(MeuCompiladorParser.LEIA, 0); }
		public TerminalNode ID() { return getToken(MeuCompiladorParser.ID, 0); }
		public Leia_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterLeia_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitLeia_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitLeia_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leia_stmtContext leia_stmt() throws RecognitionException {
		Leia_stmtContext _localctx = new Leia_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_leia_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(LEIA);
			setState(107);
			match(T__2);
			setState(108);
			match(ID);
			setState(109);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Escreva_stmtContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(MeuCompiladorParser.ESCREVA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Escreva_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreva_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterEscreva_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitEscreva_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitEscreva_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Escreva_stmtContext escreva_stmt() throws RecognitionException {
		Escreva_stmtContext _localctx = new Escreva_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_escreva_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ESCREVA);
			setState(112);
			match(T__2);
			setState(113);
			expressao(0);
			setState(114);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public AtomoContext atomo() {
			return getRuleContext(AtomoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(117);
				match(T__16);
				setState(118);
				expressao(2);
				}
				break;
			case T__2:
			case ID:
			case NUMERO_INTEIRO:
			case NUMERO_REAL:
			case VALOR_TEXTO:
				{
				setState(119);
				atomo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						expressao(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(125);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(126);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						expressao(4);
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MeuCompiladorParser.ID, 0); }
		public TerminalNode NUMERO_INTEIRO() { return getToken(MeuCompiladorParser.NUMERO_INTEIRO, 0); }
		public TerminalNode NUMERO_REAL() { return getToken(MeuCompiladorParser.NUMERO_REAL, 0); }
		public TerminalNode VALOR_TEXTO() { return getToken(MeuCompiladorParser.VALOR_TEXTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).enterAtomo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MeuCompiladorListener ) ((MeuCompiladorListener)listener).exitAtomo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MeuCompiladorVisitor ) return ((MeuCompiladorVisitor<? extends T>)visitor).visitAtomo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomoContext atomo() throws RecognitionException {
		AtomoContext _localctx = new AtomoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atomo);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(ID);
				}
				break;
			case NUMERO_INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(NUMERO_INTEIRO);
				}
				break;
			case NUMERO_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(NUMERO_REAL);
				}
				break;
			case VALOR_TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(VALOR_TEXTO);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(T__2);
				setState(138);
				expressao(0);
				setState(139);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u0090\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00037\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005\u0005"+
		">\b\u0005\n\u0005\f\u0005A\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006M\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\ba\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\fy\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0081"+
		"\b\f\n\f\f\f\u0084\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u008e\b\r\u0001\r\u0000\u0001\u0018\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0004\u0001\u0000\u001e \u0001\u0000\b\r\u0001\u0000\u000e\u000f\u0001"+
		"\u0000\u0010\u0011\u0092\u0000\u001c\u0001\u0000\u0000\u0000\u0002.\u0001"+
		"\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00062\u0001\u0000\u0000"+
		"\u0000\b8\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\fB\u0001"+
		"\u0000\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010X\u0001\u0000\u0000"+
		"\u0000\u0012f\u0001\u0000\u0000\u0000\u0014j\u0001\u0000\u0000\u0000\u0016"+
		"o\u0001\u0000\u0000\u0000\u0018x\u0001\u0000\u0000\u0000\u001a\u008d\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0003\n\u0005\u0000\u001d\u001e\u0005\u0000"+
		"\u0000\u0001\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0003\u0006\u0003"+
		"\u0000 !\u0005\u0001\u0000\u0000!/\u0001\u0000\u0000\u0000\"#\u0003\b"+
		"\u0004\u0000#$\u0005\u0001\u0000\u0000$/\u0001\u0000\u0000\u0000%/\u0003"+
		"\f\u0006\u0000&/\u0003\u000e\u0007\u0000\'/\u0003\u0010\b\u0000()\u0003"+
		"\u0014\n\u0000)*\u0005\u0001\u0000\u0000*/\u0001\u0000\u0000\u0000+,\u0003"+
		"\u0016\u000b\u0000,-\u0005\u0001\u0000\u0000-/\u0001\u0000\u0000\u0000"+
		".\u001f\u0001\u0000\u0000\u0000.\"\u0001\u0000\u0000\u0000.%\u0001\u0000"+
		"\u0000\u0000.&\u0001\u0000\u0000\u0000.\'\u0001\u0000\u0000\u0000.(\u0001"+
		"\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000"+
		"\u000001\u0007\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u000023\u0003"+
		"\u0004\u0002\u000036\u0005#\u0000\u000045\u0005\u0002\u0000\u000057\u0003"+
		"\u0018\f\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0007"+
		"\u0001\u0000\u0000\u000089\u0005#\u0000\u00009:\u0005\u0002\u0000\u0000"+
		":;\u0003\u0018\f\u0000;\t\u0001\u0000\u0000\u0000<>\u0003\u0002\u0001"+
		"\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@\u000b\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000BC\u0005\u0012\u0000\u0000CD\u0005\u0003\u0000"+
		"\u0000DE\u0003\u0012\t\u0000EF\u0005\u0004\u0000\u0000FG\u0005\u0014\u0000"+
		"\u0000GH\u0005\u0005\u0000\u0000HL\u0003\n\u0005\u0000IJ\u0005\u0013\u0000"+
		"\u0000JK\u0005\u0005\u0000\u0000KM\u0003\n\u0005\u0000LI\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u0019"+
		"\u0000\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005\u0015\u0000\u0000QR\u0005"+
		"\u0003\u0000\u0000RS\u0003\u0012\t\u0000ST\u0005\u0004\u0000\u0000TU\u0005"+
		"\u0006\u0000\u0000UV\u0003\n\u0005\u0000VW\u0005\u001b\u0000\u0000W\u000f"+
		"\u0001\u0000\u0000\u0000XY\u0005\u0016\u0000\u0000YZ\u0005#\u0000\u0000"+
		"Z[\u0005\u0007\u0000\u0000[\\\u0003\u0018\f\u0000\\]\u0005\u0017\u0000"+
		"\u0000]`\u0003\u0018\f\u0000^_\u0005\u0018\u0000\u0000_a\u0003\u0018\f"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0006\u0000\u0000cd\u0003\n\u0005\u0000de\u0005\u001a"+
		"\u0000\u0000e\u0011\u0001\u0000\u0000\u0000fg\u0003\u0018\f\u0000gh\u0007"+
		"\u0001\u0000\u0000hi\u0003\u0018\f\u0000i\u0013\u0001\u0000\u0000\u0000"+
		"jk\u0005\u001d\u0000\u0000kl\u0005\u0003\u0000\u0000lm\u0005#\u0000\u0000"+
		"mn\u0005\u0004\u0000\u0000n\u0015\u0001\u0000\u0000\u0000op\u0005\u001c"+
		"\u0000\u0000pq\u0005\u0003\u0000\u0000qr\u0003\u0018\f\u0000rs\u0005\u0004"+
		"\u0000\u0000s\u0017\u0001\u0000\u0000\u0000tu\u0006\f\uffff\uffff\u0000"+
		"uv\u0005\u0011\u0000\u0000vy\u0003\u0018\f\u0002wy\u0003\u001a\r\u0000"+
		"xt\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u0082\u0001\u0000"+
		"\u0000\u0000z{\n\u0004\u0000\u0000{|\u0007\u0002\u0000\u0000|\u0081\u0003"+
		"\u0018\f\u0005}~\n\u0003\u0000\u0000~\u007f\u0007\u0003\u0000\u0000\u007f"+
		"\u0081\u0003\u0018\f\u0004\u0080z\u0001\u0000\u0000\u0000\u0080}\u0001"+
		"\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0019\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u008e\u0005"+
		"#\u0000\u0000\u0086\u008e\u0005$\u0000\u0000\u0087\u008e\u0005%\u0000"+
		"\u0000\u0088\u008e\u0005&\u0000\u0000\u0089\u008a\u0005\u0003\u0000\u0000"+
		"\u008a\u008b\u0003\u0018\f\u0000\u008b\u008c\u0005\u0004\u0000\u0000\u008c"+
		"\u008e\u0001\u0000\u0000\u0000\u008d\u0085\u0001\u0000\u0000\u0000\u008d"+
		"\u0086\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008d"+
		"\u0088\u0001\u0000\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008e"+
		"\u001b\u0001\u0000\u0000\u0000\t.6?L`x\u0080\u0082\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}