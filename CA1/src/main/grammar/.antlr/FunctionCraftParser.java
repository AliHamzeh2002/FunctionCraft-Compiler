// Generated from c:/Users/ALI/OneDrive/Desktop/university/Project/Compiler/FunctionCraft-Compiler/CA1/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		END=1, DEF=2, IF=3, ELSE=4, ELSEIF=5, TRUE=6, FALSE=7, CHOP=8, CHOMP=9, 
		PUSH=10, MAIN=11, RETURN=12, PUTS=13, METHOD=14, LEN=15, PATTERN=16, MATCH=17, 
		NEXT=18, BREAK=19, LOOP=20, DO=21, FOR=22, IN=23, INT_VAL=24, FLOAT_VAL=25, 
		STRING_VAL=26, LPAR=27, RPAR=28, LBRACKET=29, RBRACKET=30, PLUS=31, MINUS=32, 
		MULT=33, DIV=34, MOD=35, INC=36, DEC=37, GEQ=38, LEQ=39, GTR=40, LES=41, 
		EQL=42, NEQ=43, AND=44, OR=45, NOT=46, ASSIGN=47, ADD_ASSIGN=48, SUB_ASSIGN=49, 
		MUL_ASSIGN=50, DIV_ASSIGN=51, MOD_ASSIGN=52, APPEND=53, LBRACE=54, RBRACE=55, 
		COMMA=56, DOT=57, DOUBLEDOT=58, COLON=59, SEMICOLON=60, QUESTION=61, IDENTIFIER=62, 
		ARROW=63, PATTERN_TOKEN=64, SINGLE_LINE_COMMENT=65, MULTI_LINE_COMMENT=66, 
		WS=67;
	public static final int
		RULE_function_craft = 0, RULE_comment = 1, RULE_main = 2, RULE_pattern = 3, 
		RULE_function_scope = 4, RULE_return_statement = 5, RULE_statement = 6, 
		RULE_function = 7, RULE_function_args = 8, RULE_lambda_function = 9, RULE_primitive_value = 10, 
		RULE_list = 11, RULE_range = 12, RULE_if_structure = 13, RULE_if_structure_loop = 14, 
		RULE_condition = 15, RULE_loop = 16, RULE_for_loop = 17, RULE_list_element = 18, 
		RULE_assignment = 19, RULE_loop_scope = 20, RULE_break_statement = 21, 
		RULE_next_statement = 22, RULE_next_if_statement = 23, RULE_break_if_statement = 24, 
		RULE_function_ptr = 25, RULE_expr = 26, RULE_expr_append = 27, RULE_expr_append_ = 28, 
		RULE_expr_or = 29, RULE_expr_or_ = 30, RULE_expr_and = 31, RULE_expr_and_ = 32, 
		RULE_expr_eq = 33, RULE_expr_eq_ = 34, RULE_expr_cmp = 35, RULE_expr_cmp_ = 36, 
		RULE_expr_add_sub = 37, RULE_expr_add_sub_ = 38, RULE_expr_mul_div = 39, 
		RULE_expr_mul_div_ = 40, RULE_expr_unary = 41, RULE_expr_other = 42, RULE_function_call = 43, 
		RULE_primitive_function_call = 44, RULE_matching = 45, RULE_puts = 46, 
		RULE_push = 47, RULE_len = 48, RULE_chop = 49, RULE_chomp = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"function_craft", "comment", "main", "pattern", "function_scope", "return_statement", 
			"statement", "function", "function_args", "lambda_function", "primitive_value", 
			"list", "range", "if_structure", "if_structure_loop", "condition", "loop", 
			"for_loop", "list_element", "assignment", "loop_scope", "break_statement", 
			"next_statement", "next_if_statement", "break_if_statement", "function_ptr", 
			"expr", "expr_append", "expr_append_", "expr_or", "expr_or_", "expr_and", 
			"expr_and_", "expr_eq", "expr_eq_", "expr_cmp", "expr_cmp_", "expr_add_sub", 
			"expr_add_sub_", "expr_mul_div", "expr_mul_div_", "expr_unary", "expr_other", 
			"function_call", "primitive_function_call", "matching", "puts", "push", 
			"len", "chop", "chomp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'end'", "'def'", "'if'", "'else'", "'elseif'", "'true'", "'false'", 
			"'chop'", "'chomp'", "'push'", "'main'", "'return'", "'puts'", "'method'", 
			"'len'", "'pattern'", "'match'", "'next'", "'break'", "'loop'", "'do'", 
			"'for'", "'in'", null, null, null, "'('", "')'", "'['", "']'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'>='", "'<='", "'>'", "'<'", 
			"'=='", "'!='", "'&&'", "'||'", "'!'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'<<'", "'{'", "'}'", "','", "'.'", "'..'", "':'", "';'", 
			"'?'", null, "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "END", "DEF", "IF", "ELSE", "ELSEIF", "TRUE", "FALSE", "CHOP", 
			"CHOMP", "PUSH", "MAIN", "RETURN", "PUTS", "METHOD", "LEN", "PATTERN", 
			"MATCH", "NEXT", "BREAK", "LOOP", "DO", "FOR", "IN", "INT_VAL", "FLOAT_VAL", 
			"STRING_VAL", "LPAR", "RPAR", "LBRACKET", "RBRACKET", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "INC", "DEC", "GEQ", "LEQ", "GTR", "LES", "EQL", 
			"NEQ", "AND", "OR", "NOT", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "MOD_ASSIGN", "APPEND", "LBRACE", "RBRACE", "COMMA", "DOT", 
			"DOUBLEDOT", "COLON", "SEMICOLON", "QUESTION", "IDENTIFIER", "ARROW", 
			"PATTERN_TOKEN", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_craftContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public Function_craftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_craft; }
	}

	public final Function_craftContext function_craft() throws RecognitionException {
		Function_craftContext _localctx = new Function_craftContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_function_craft);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(105);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(102);
						function();
						}
						break;
					case SINGLE_LINE_COMMENT:
					case MULTI_LINE_COMMENT:
						{
						setState(103);
						comment();
						}
						break;
					case PATTERN:
						{
						setState(104);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(110);
			main();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) {
				{
				{
				setState(111);
				comment();
				}
				}
				setState(116);
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(FunctionCraftParser.SINGLE_LINE_COMMENT, 0); }
		public TerminalNode MULTI_LINE_COMMENT() { return getToken(FunctionCraftParser.MULTI_LINE_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) ) {
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
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Function_scopeContext function_scope() {
			return getRuleContext(Function_scopeContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(DEF);
			setState(120);
			match(MAIN);
			setState(121);
			match(LPAR);
			setState(122);
			match(RPAR);
			setState(123);
			function_scope();
			setState(124);
			match(END);
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
	public static class PatternContext extends ParserRuleContext {
		public TerminalNode PATTERN() { return getToken(FunctionCraftParser.PATTERN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public List<TerminalNode> PATTERN_TOKEN() { return getTokens(FunctionCraftParser.PATTERN_TOKEN); }
		public TerminalNode PATTERN_TOKEN(int i) {
			return getToken(FunctionCraftParser.PATTERN_TOKEN, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(PATTERN);
			setState(127);
			match(IDENTIFIER);
			setState(128);
			match(LPAR);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(129);
				match(IDENTIFIER);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(130);
					match(COMMA);
					setState(131);
					match(IDENTIFIER);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(139);
			match(RPAR);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATTERN_TOKEN) {
				{
				{
				setState(140);
				match(PATTERN_TOKEN);
				setState(141);
				condition();
				setState(142);
				match(ASSIGN);
				setState(143);
				expr();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(SEMICOLON);
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
	public static class Function_scopeContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<If_structureContext> if_structure() {
			return getRuleContexts(If_structureContext.class);
		}
		public If_structureContext if_structure(int i) {
			return getRuleContext(If_structureContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Function_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_scope; }
	}

	public final Function_scopeContext function_scope() throws RecognitionException {
		Function_scopeContext _localctx = new Function_scopeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -2882294964787995399L) != 0)) {
				{
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case PUTS:
				case METHOD:
				case LEN:
				case LOOP:
				case FOR:
				case INT_VAL:
				case FLOAT_VAL:
				case STRING_VAL:
				case LPAR:
				case LBRACKET:
				case MINUS:
				case NOT:
				case IDENTIFIER:
				case ARROW:
					{
					setState(152);
					statement();
					}
					break;
				case IF:
					{
					setState(153);
					if_structure();
					}
					break;
				case SINGLE_LINE_COMMENT:
				case MULTI_LINE_COMMENT:
					{
					setState(154);
					comment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(160);
				return_statement();
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
	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(RETURN);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611615644599654464L) != 0)) {
				{
				setState(164);
				expr();
				}
			}

			setState(167);
			match(SEMICOLON);
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
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(169);
					expr();
					}
					break;
				case 2:
					{
					setState(170);
					assignment();
					}
					break;
				}
				setState(173);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				loop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FunctionCraftParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Function_scopeContext function_scope() {
			return getRuleContext(Function_scopeContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(DEF);
			setState(180);
			match(IDENTIFIER);
			setState(181);
			match(LPAR);
			setState(182);
			function_args();
			setState(183);
			match(RPAR);
			setState(184);
			function_scope();
			setState(185);
			match(END);
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
	public static class Function_argsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(FunctionCraftParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(FunctionCraftParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(FunctionCraftParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FunctionCraftParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_args);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					match(IDENTIFIER);
					setState(188);
					match(COMMA);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAR:
			case LBRACKET:
				{
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(194);
					match(LBRACKET);
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(195);
							match(IDENTIFIER);
							setState(196);
							match(ASSIGN);
							setState(197);
							expr();
							setState(198);
							match(COMMA);
							}
							} 
						}
						setState(204);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					{
					setState(205);
					match(IDENTIFIER);
					setState(206);
					match(ASSIGN);
					setState(207);
					expr();
					}
					setState(209);
					match(RBRACKET);
					}
				}

				}
				break;
			case IDENTIFIER:
				{
				{
				setState(213);
				match(IDENTIFIER);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Lambda_functionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(FunctionCraftParser.ARROW, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public Function_scopeContext function_scope() {
			return getRuleContext(Function_scopeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public Lambda_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_function; }
	}

	public final Lambda_functionContext lambda_function() throws RecognitionException {
		Lambda_functionContext _localctx = new Lambda_functionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lambda_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ARROW);
			setState(217);
			match(LPAR);
			setState(218);
			function_args();
			setState(219);
			match(RPAR);
			setState(220);
			match(LBRACE);
			setState(221);
			function_scope();
			setState(222);
			match(RBRACE);
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
	public static class Primitive_valueContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(FunctionCraftParser.FLOAT_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public TerminalNode TRUE() { return getToken(FunctionCraftParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public Lambda_functionContext lambda_function() {
			return getRuleContext(Lambda_functionContext.class,0);
		}
		public Primitive_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_value; }
	}

	public final Primitive_valueContext primitive_value() throws RecognitionException {
		Primitive_valueContext _localctx = new Primitive_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primitive_value);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(INT_VAL);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(FLOAT_VAL);
				}
				break;
			case STRING_VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(STRING_VAL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(FALSE);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 6);
				{
				setState(229);
				lambda_function();
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(LBRACKET);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611615644599654464L) != 0)) {
				{
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(233);
						expr();
						setState(234);
						match(COMMA);
						}
						} 
					}
					setState(240);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(241);
				expr();
				}
			}

			setState(244);
			match(RBRACKET);
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
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode DOUBLEDOT() { return getToken(FunctionCraftParser.DOUBLEDOT, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_range);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(LPAR);
				setState(247);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(INT_VAL);
				setState(249);
				match(DOUBLEDOT);
				setState(250);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(INT_VAL);
				setState(252);
				match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_structureContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<Function_scopeContext> function_scope() {
			return getRuleContexts(Function_scopeContext.class);
		}
		public Function_scopeContext function_scope(int i) {
			return getRuleContext(Function_scopeContext.class,i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(FunctionCraftParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(FunctionCraftParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public If_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_structure; }
	}

	public final If_structureContext if_structure() throws RecognitionException {
		If_structureContext _localctx = new If_structureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IF);
			setState(256);
			condition();
			setState(257);
			function_scope();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(258);
				match(ELSEIF);
				setState(259);
				condition();
				setState(260);
				function_scope();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(267);
				match(ELSE);
				setState(268);
				function_scope();
				}
			}

			setState(271);
			match(END);
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
	public static class If_structure_loopContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<Loop_scopeContext> loop_scope() {
			return getRuleContexts(Loop_scopeContext.class);
		}
		public Loop_scopeContext loop_scope(int i) {
			return getRuleContext(Loop_scopeContext.class,i);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(FunctionCraftParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(FunctionCraftParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public If_structure_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_structure_loop; }
	}

	public final If_structure_loopContext if_structure_loop() throws RecognitionException {
		If_structure_loopContext _localctx = new If_structure_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_structure_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(IF);
			setState(274);
			condition();
			setState(275);
			loop_scope();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(276);
				match(ELSEIF);
				setState(277);
				condition();
				setState(278);
				loop_scope();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(285);
				match(ELSE);
				setState(286);
				loop_scope();
				}
			}

			setState(289);
			match(END);
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
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(LPAR);
				setState(292);
				condition();
				setState(293);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(LPAR);
				setState(296);
				condition();
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(298);
				condition();
				setState(299);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(LPAR);
				setState(302);
				expr();
				setState(303);
				match(RPAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public Loop_scopeContext loop_scope() {
			return getRuleContext(Loop_scopeContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(LOOP);
			setState(308);
			match(DO);
			setState(309);
			loop_scope();
			setState(310);
			match(END);
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
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Loop_scopeContext loop_scope() {
			return getRuleContext(Loop_scopeContext.class,0);
		}
		public TerminalNode END() { return getToken(FunctionCraftParser.END, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_loop);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(FOR);
				setState(313);
				match(IDENTIFIER);
				setState(314);
				match(IN);
				setState(315);
				list();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(IDENTIFIER);
				}
				break;
			case INT_VAL:
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				range();
				setState(318);
				loop_scope();
				setState(319);
				match(END);
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
	public static class List_elementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(FunctionCraftParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(FunctionCraftParser.LBRACKET, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(FunctionCraftParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(FunctionCraftParser.RBRACKET, i);
		}
		public List_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_element; }
	}

	public final List_elementContext list_element() throws RecognitionException {
		List_elementContext _localctx = new List_elementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_list_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(IDENTIFIER);
			setState(328); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(324);
				match(LBRACKET);
				setState(325);
				expr();
				setState(326);
				match(RBRACKET);
				}
				}
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
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
	public static class AssignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(FunctionCraftParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(FunctionCraftParser.SUB_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FunctionCraftParser.MOD_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(FunctionCraftParser.DIV_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(FunctionCraftParser.MUL_ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List_elementContext list_element() {
			return getRuleContext(List_elementContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(332);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(333);
				list();
				}
				break;
			case 3:
				{
				setState(334);
				list_element();
				}
				break;
			}
			setState(337);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385664L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(338);
			expr();
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
	public static class Loop_scopeContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<If_structure_loopContext> if_structure_loop() {
			return getRuleContexts(If_structure_loopContext.class);
		}
		public If_structure_loopContext if_structure_loop(int i) {
			return getRuleContext(If_structure_loopContext.class,i);
		}
		public List<Break_if_statementContext> break_if_statement() {
			return getRuleContexts(Break_if_statementContext.class);
		}
		public Break_if_statementContext break_if_statement(int i) {
			return getRuleContext(Break_if_statementContext.class,i);
		}
		public List<Next_if_statementContext> next_if_statement() {
			return getRuleContexts(Next_if_statementContext.class);
		}
		public Next_if_statementContext next_if_statement(int i) {
			return getRuleContext(Next_if_statementContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Next_statementContext next_statement() {
			return getRuleContext(Next_statementContext.class,0);
		}
		public Loop_scopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_scope; }
	}

	public final Loop_scopeContext loop_scope() throws RecognitionException {
		Loop_scopeContext _localctx = new Loop_scopeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loop_scope);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(345);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TRUE:
					case FALSE:
					case CHOP:
					case CHOMP:
					case PUSH:
					case PUTS:
					case METHOD:
					case LEN:
					case LOOP:
					case FOR:
					case INT_VAL:
					case FLOAT_VAL:
					case STRING_VAL:
					case LPAR:
					case LBRACKET:
					case MINUS:
					case NOT:
					case IDENTIFIER:
					case ARROW:
						{
						setState(340);
						statement();
						}
						break;
					case SINGLE_LINE_COMMENT:
					case MULTI_LINE_COMMENT:
						{
						setState(341);
						comment();
						}
						break;
					case IF:
						{
						setState(342);
						if_structure_loop();
						}
						break;
					case BREAK:
						{
						setState(343);
						break_if_statement();
						}
						break;
					case NEXT:
						{
						setState(344);
						next_if_statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(350);
				return_statement();
				}
				break;
			case BREAK:
				{
				setState(351);
				break_statement();
				}
				break;
			case NEXT:
				{
				setState(352);
				next_statement();
				}
				break;
			case END:
			case ELSE:
			case ELSEIF:
				break;
			default:
				break;
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
	public static class Break_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(BREAK);
			setState(356);
			match(SEMICOLON);
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
	public static class Next_statementContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Next_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_statement; }
	}

	public final Next_statementContext next_statement() throws RecognitionException {
		Next_statementContext _localctx = new Next_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_next_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(NEXT);
			setState(359);
			match(SEMICOLON);
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
	public static class Next_if_statementContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(FunctionCraftParser.NEXT, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Next_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_if_statement; }
	}

	public final Next_if_statementContext next_if_statement() throws RecognitionException {
		Next_if_statementContext _localctx = new Next_if_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_next_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(NEXT);
			setState(362);
			match(IF);
			setState(363);
			condition();
			setState(364);
			match(SEMICOLON);
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
	public static class Break_if_statementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public Break_if_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_if_statement; }
	}

	public final Break_if_statementContext break_if_statement() throws RecognitionException {
		Break_if_statementContext _localctx = new Break_if_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_break_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(BREAK);
			setState(367);
			match(IF);
			setState(368);
			condition();
			setState(369);
			match(SEMICOLON);
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
	public static class Function_ptrContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(FunctionCraftParser.METHOD, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode COLON() { return getToken(FunctionCraftParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Function_ptrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_ptr; }
	}

	public final Function_ptrContext function_ptr() throws RecognitionException {
		Function_ptrContext _localctx = new Function_ptrContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(METHOD);
			setState(372);
			match(LPAR);
			setState(373);
			match(COLON);
			setState(374);
			match(IDENTIFIER);
			setState(375);
			match(RPAR);
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
	public static class ExprContext extends ParserRuleContext {
		public Expr_appendContext expr_append() {
			return getRuleContext(Expr_appendContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			expr_append();
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
	public static class Expr_appendContext extends ParserRuleContext {
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_append_Context expr_append_() {
			return getRuleContext(Expr_append_Context.class,0);
		}
		public Expr_appendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_append; }
	}

	public final Expr_appendContext expr_append() throws RecognitionException {
		Expr_appendContext _localctx = new Expr_appendContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			expr_or();
			setState(380);
			expr_append_();
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
	public static class Expr_append_Context extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(FunctionCraftParser.APPEND, 0); }
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_append_Context expr_append_() {
			return getRuleContext(Expr_append_Context.class,0);
		}
		public Expr_append_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_append_; }
	}

	public final Expr_append_Context expr_append_() throws RecognitionException {
		Expr_append_Context _localctx = new Expr_append_Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_append_);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(APPEND);
				setState(383);
				expr_or();
				setState(384);
				expr_append_();
				}
				break;
			case RPAR:
			case RBRACKET:
			case COMMA:
			case SEMICOLON:
			case PATTERN_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Expr_orContext extends ParserRuleContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_Context expr_or_() {
			return getRuleContext(Expr_or_Context.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			expr_and();
			setState(390);
			expr_or_();
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
	public static class Expr_or_Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_Context expr_or_() {
			return getRuleContext(Expr_or_Context.class,0);
		}
		public Expr_or_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_; }
	}

	public final Expr_or_Context expr_or_() throws RecognitionException {
		Expr_or_Context _localctx = new Expr_or_Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_or_);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(OR);
				setState(393);
				expr_and();
				setState(394);
				expr_or_();
				}
				break;
			case RPAR:
			case RBRACKET:
			case APPEND:
			case COMMA:
			case SEMICOLON:
			case PATTERN_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Expr_andContext extends ParserRuleContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_Context expr_and_() {
			return getRuleContext(Expr_and_Context.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			expr_eq();
			setState(400);
			expr_and_();
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
	public static class Expr_and_Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_Context expr_and_() {
			return getRuleContext(Expr_and_Context.class,0);
		}
		public Expr_and_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and_; }
	}

	public final Expr_and_Context expr_and_() throws RecognitionException {
		Expr_and_Context _localctx = new Expr_and_Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_and_);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(AND);
				setState(403);
				expr_eq();
				setState(404);
				expr_and_();
				}
				break;
			case RPAR:
			case RBRACKET:
			case OR:
			case APPEND:
			case COMMA:
			case SEMICOLON:
			case PATTERN_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class Expr_eqContext extends ParserRuleContext {
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_Context expr_eq_() {
			return getRuleContext(Expr_eq_Context.class,0);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			expr_cmp();
			setState(410);
			expr_eq_();
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
	public static class Expr_eq_Context extends ParserRuleContext {
		public TerminalNode EQL() { return getToken(FunctionCraftParser.EQL, 0); }
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_Context expr_eq_() {
			return getRuleContext(Expr_eq_Context.class,0);
		}
		public TerminalNode NEQ() { return getToken(FunctionCraftParser.NEQ, 0); }
		public Expr_eq_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq_; }
	}

	public final Expr_eq_Context expr_eq_() throws RecognitionException {
		Expr_eq_Context _localctx = new Expr_eq_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_expr_eq_);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQL:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(EQL);
				setState(413);
				expr_cmp();
				setState(414);
				expr_eq_();
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(NEQ);
				setState(417);
				expr_cmp();
				setState(418);
				expr_eq_();
				}
				break;
			case RPAR:
			case RBRACKET:
			case AND:
			case OR:
			case APPEND:
			case COMMA:
			case SEMICOLON:
			case PATTERN_TOKEN:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class Expr_cmpContext extends ParserRuleContext {
		public Expr_add_subContext expr_add_sub() {
			return getRuleContext(Expr_add_subContext.class,0);
		}
		public Expr_cmp_Context expr_cmp_() {
			return getRuleContext(Expr_cmp_Context.class,0);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			expr_add_sub();
			setState(424);
			expr_cmp_();
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
	public static class Expr_cmp_Context extends ParserRuleContext {
		public TerminalNode GTR() { return getToken(FunctionCraftParser.GTR, 0); }
		public Expr_add_subContext expr_add_sub() {
			return getRuleContext(Expr_add_subContext.class,0);
		}
		public Expr_cmp_Context expr_cmp_() {
			return getRuleContext(Expr_cmp_Context.class,0);
		}
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public TerminalNode GEQ() { return getToken(FunctionCraftParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(FunctionCraftParser.LEQ, 0); }
		public Expr_cmp_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp_; }
	}

	public final Expr_cmp_Context expr_cmp_() throws RecognitionException {
		Expr_cmp_Context _localctx = new Expr_cmp_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_expr_cmp_);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(GTR);
				setState(427);
				expr_add_sub();
				setState(428);
				expr_cmp_();
				}
				break;
			case LES:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(LES);
				setState(431);
				expr_add_sub();
				setState(432);
				expr_cmp_();
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(GEQ);
				setState(435);
				expr_add_sub();
				setState(436);
				expr_cmp_();
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				match(LEQ);
				setState(439);
				expr_add_sub();
				setState(440);
				expr_cmp_();
				}
				break;
			case RPAR:
			case RBRACKET:
			case EQL:
			case NEQ:
			case AND:
			case OR:
			case APPEND:
			case COMMA:
			case SEMICOLON:
			case PATTERN_TOKEN:
				enterOuterAlt(_localctx, 5);
				{
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
	public static class Expr_add_subContext extends ParserRuleContext {
		public Expr_mul_divContext expr_mul_div() {
			return getRuleContext(Expr_mul_divContext.class,0);
		}
		public Expr_add_sub_Context expr_add_sub_() {
			return getRuleContext(Expr_add_sub_Context.class,0);
		}
		public Expr_add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_sub; }
	}

	public final Expr_add_subContext expr_add_sub() throws RecognitionException {
		Expr_add_subContext _localctx = new Expr_add_subContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expr_add_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			expr_mul_div();
			setState(446);
			expr_add_sub_();
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
	public static class Expr_add_sub_Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public Expr_mul_divContext expr_mul_div() {
			return getRuleContext(Expr_mul_divContext.class,0);
		}
		public Expr_add_sub_Context expr_add_sub_() {
			return getRuleContext(Expr_add_sub_Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Expr_add_sub_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_sub_; }
	}

	public final Expr_add_sub_Context expr_add_sub_() throws RecognitionException {
		Expr_add_sub_Context _localctx = new Expr_add_sub_Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_expr_add_sub_);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(PLUS);
				setState(449);
				expr_mul_div();
				setState(450);
				expr_add_sub_();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(MINUS);
				setState(453);
				expr_mul_div();
				setState(454);
				expr_add_sub_();
				}
				break;
			case RPAR:
			case RBRACKET:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case AND:
			case OR:
			case APPEND:
			case COMMA:
			case SEMICOLON:
			case PATTERN_TOKEN:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class Expr_mul_divContext extends ParserRuleContext {
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public Expr_mul_div_Context expr_mul_div_() {
			return getRuleContext(Expr_mul_div_Context.class,0);
		}
		public Expr_mul_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mul_div; }
	}

	public final Expr_mul_divContext expr_mul_div() throws RecognitionException {
		Expr_mul_divContext _localctx = new Expr_mul_divContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expr_mul_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			expr_unary();
			setState(460);
			expr_mul_div_();
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
	public static class Expr_mul_div_Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public Expr_unaryContext expr_unary() {
			return getRuleContext(Expr_unaryContext.class,0);
		}
		public Expr_mul_div_Context expr_mul_div_() {
			return getRuleContext(Expr_mul_div_Context.class,0);
		}
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FunctionCraftParser.MOD, 0); }
		public Expr_mul_div_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mul_div_; }
	}

	public final Expr_mul_div_Context expr_mul_div_() throws RecognitionException {
		Expr_mul_div_Context _localctx = new Expr_mul_div_Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr_mul_div_);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(MULT);
				setState(463);
				expr_unary();
				setState(464);
				expr_mul_div_();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(DIV);
				setState(467);
				expr_unary();
				setState(468);
				expr_mul_div_();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(MOD);
				setState(471);
				expr_unary();
				setState(472);
				expr_mul_div_();
				}
				break;
			case RPAR:
			case RBRACKET:
			case PLUS:
			case MINUS:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case AND:
			case OR:
			case APPEND:
			case COMMA:
			case SEMICOLON:
			case PATTERN_TOKEN:
				enterOuterAlt(_localctx, 4);
				{
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
	public static class Expr_unaryContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public Expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_unary; }
	}

	public final Expr_unaryContext expr_unary() throws RecognitionException {
		Expr_unaryContext _localctx = new Expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expr_unary);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(NOT);
				setState(478);
				expr_other();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				match(MINUS);
				setState(480);
				expr_other();
				}
				break;
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case PUTS:
			case METHOD:
			case LEN:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case LPAR:
			case LBRACKET:
			case IDENTIFIER:
			case ARROW:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				expr_other();
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
	public static class Expr_otherContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public List_elementContext list_element() {
			return getRuleContext(List_elementContext.class,0);
		}
		public TerminalNode INC() { return getToken(FunctionCraftParser.INC, 0); }
		public TerminalNode DEC() { return getToken(FunctionCraftParser.DEC, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Primitive_function_callContext primitive_function_call() {
			return getRuleContext(Primitive_function_callContext.class,0);
		}
		public Primitive_valueContext primitive_value() {
			return getRuleContext(Primitive_valueContext.class,0);
		}
		public MatchingContext matching() {
			return getRuleContext(MatchingContext.class,0);
		}
		public Function_ptrContext function_ptr() {
			return getRuleContext(Function_ptrContext.class,0);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expr_other);
		int _la;
		try {
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(LPAR);
				setState(485);
				expr();
				setState(486);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(489);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(490);
					list_element();
					}
					break;
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(493);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(497);
				primitive_function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(498);
				primitive_value();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(499);
				matching();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(500);
				function_ptr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(IDENTIFIER);
			setState(504);
			match(LPAR);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611615644599654464L) != 0)) {
				{
				setState(505);
				expr();
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(506);
					match(COMMA);
					setState(507);
					expr();
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(515);
			match(RPAR);
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
	public static class Primitive_function_callContext extends ParserRuleContext {
		public PutsContext puts() {
			return getRuleContext(PutsContext.class,0);
		}
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public ChopContext chop() {
			return getRuleContext(ChopContext.class,0);
		}
		public ChompContext chomp() {
			return getRuleContext(ChompContext.class,0);
		}
		public Primitive_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_function_call; }
	}

	public final Primitive_function_callContext primitive_function_call() throws RecognitionException {
		Primitive_function_callContext _localctx = new Primitive_function_callContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primitive_function_call);
		try {
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				puts();
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				push();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				len();
				}
				break;
			case CHOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
				chop();
				}
				break;
			case CHOMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(521);
				chomp();
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
	public static class MatchingContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FunctionCraftParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FunctionCraftParser.COMMA, i);
		}
		public MatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching; }
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_matching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(IDENTIFIER);
			setState(525);
			match(DOT);
			setState(526);
			match(MATCH);
			setState(527);
			match(LPAR);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611615644599654464L) != 0)) {
				{
				setState(528);
				expr();
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(529);
					match(COMMA);
					setState(530);
					expr();
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(538);
			match(RPAR);
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
	public static class PutsContext extends ParserRuleContext {
		public TerminalNode PUTS() { return getToken(FunctionCraftParser.PUTS, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puts; }
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(PUTS);
			setState(541);
			match(LPAR);
			setState(542);
			expr();
			setState(543);
			match(RPAR);
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
	public static class PushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(PUSH);
			setState(546);
			match(LPAR);
			setState(547);
			expr();
			setState(548);
			match(COMMA);
			setState(549);
			expr();
			setState(550);
			match(RPAR);
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
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(LEN);
			setState(553);
			match(LPAR);
			setState(554);
			expr();
			setState(555);
			match(RPAR);
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
	public static class ChopContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ChopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chop; }
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(CHOP);
			setState(558);
			match(LPAR);
			setState(559);
			expr();
			setState(560);
			match(RPAR);
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
	public static class ChompContext extends ParserRuleContext {
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chomp; }
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(CHOMP);
			setState(563);
			match(LPAR);
			setState(564);
			expr();
			setState(565);
			match(RPAR);
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
		"\u0004\u0001C\u0238\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000j\b\u0000\n\u0000"+
		"\f\u0000m\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000q\b\u0000\n\u0000"+
		"\f\u0000t\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0085"+
		"\b\u0003\n\u0003\f\u0003\u0088\t\u0003\u0003\u0003\u008a\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u0092\b\u0003\n\u0003\f\u0003\u0095\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009c\b\u0004\n\u0004"+
		"\f\u0004\u009f\t\u0004\u0001\u0004\u0003\u0004\u00a2\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00a6\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00ac\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00b2\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0005\b\u00be\b\b\n\b\f\b\u00c1\t\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00c9\b\b\n\b\f\b\u00cc\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d4\b\b\u0001\b\u0003\b\u00d7\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e7\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ed\b\u000b\n\u000b"+
		"\f\u000b\u00f0\t\u000b\u0001\u000b\u0003\u000b\u00f3\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00fe\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0107\b\r\n\r\f\r\u010a\t\r\u0001\r\u0001\r\u0003\r\u010e\b\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0119\b\u000e\n\u000e\f\u000e\u011c"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0120\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0132\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0142\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0004\u0012\u0149\b\u0012\u000b\u0012\f\u0012"+
		"\u014a\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0150\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u015a\b\u0014\n\u0014\f\u0014\u015d\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0162\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0184\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u018e\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0198\b \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01a6\b\"\u0001"+
		"#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u01bc\b$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u01ca\b&\u0001\'\u0001\'\u0001\'\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u01dc\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u01e3\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01ec"+
		"\b*\u0001*\u0003*\u01ef\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01f6"+
		"\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u01fd\b+\n+\f+\u0200\t+"+
		"\u0003+\u0202\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u020b\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u0214"+
		"\b-\n-\f-\u0217\t-\u0003-\u0219\b-\u0001-\u0001-\u0001.\u0001.\u0001."+
		"\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u0000\u00003\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0004\u0001\u0000AB\u0001\u0000,-\u0001"+
		"\u0000/4\u0001\u0000$%\u0254\u0000k\u0001\u0000\u0000\u0000\u0002u\u0001"+
		"\u0000\u0000\u0000\u0004w\u0001\u0000\u0000\u0000\u0006~\u0001\u0000\u0000"+
		"\u0000\b\u009d\u0001\u0000\u0000\u0000\n\u00a3\u0001\u0000\u0000\u0000"+
		"\f\u00b1\u0001\u0000\u0000\u0000\u000e\u00b3\u0001\u0000\u0000\u0000\u0010"+
		"\u00bf\u0001\u0000\u0000\u0000\u0012\u00d8\u0001\u0000\u0000\u0000\u0014"+
		"\u00e6\u0001\u0000\u0000\u0000\u0016\u00e8\u0001\u0000\u0000\u0000\u0018"+
		"\u00fd\u0001\u0000\u0000\u0000\u001a\u00ff\u0001\u0000\u0000\u0000\u001c"+
		"\u0111\u0001\u0000\u0000\u0000\u001e\u0131\u0001\u0000\u0000\u0000 \u0133"+
		"\u0001\u0000\u0000\u0000\"\u0141\u0001\u0000\u0000\u0000$\u0143\u0001"+
		"\u0000\u0000\u0000&\u014f\u0001\u0000\u0000\u0000(\u015b\u0001\u0000\u0000"+
		"\u0000*\u0163\u0001\u0000\u0000\u0000,\u0166\u0001\u0000\u0000\u0000."+
		"\u0169\u0001\u0000\u0000\u00000\u016e\u0001\u0000\u0000\u00002\u0173\u0001"+
		"\u0000\u0000\u00004\u0179\u0001\u0000\u0000\u00006\u017b\u0001\u0000\u0000"+
		"\u00008\u0183\u0001\u0000\u0000\u0000:\u0185\u0001\u0000\u0000\u0000<"+
		"\u018d\u0001\u0000\u0000\u0000>\u018f\u0001\u0000\u0000\u0000@\u0197\u0001"+
		"\u0000\u0000\u0000B\u0199\u0001\u0000\u0000\u0000D\u01a5\u0001\u0000\u0000"+
		"\u0000F\u01a7\u0001\u0000\u0000\u0000H\u01bb\u0001\u0000\u0000\u0000J"+
		"\u01bd\u0001\u0000\u0000\u0000L\u01c9\u0001\u0000\u0000\u0000N\u01cb\u0001"+
		"\u0000\u0000\u0000P\u01db\u0001\u0000\u0000\u0000R\u01e2\u0001\u0000\u0000"+
		"\u0000T\u01f5\u0001\u0000\u0000\u0000V\u01f7\u0001\u0000\u0000\u0000X"+
		"\u020a\u0001\u0000\u0000\u0000Z\u020c\u0001\u0000\u0000\u0000\\\u021c"+
		"\u0001\u0000\u0000\u0000^\u0221\u0001\u0000\u0000\u0000`\u0228\u0001\u0000"+
		"\u0000\u0000b\u022d\u0001\u0000\u0000\u0000d\u0232\u0001\u0000\u0000\u0000"+
		"fj\u0003\u000e\u0007\u0000gj\u0003\u0002\u0001\u0000hj\u0003\u0006\u0003"+
		"\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"nr\u0003\u0004\u0002\u0000oq\u0003\u0002\u0001\u0000po\u0001\u0000\u0000"+
		"\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000s\u0001\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uv\u0007\u0000\u0000\u0000v\u0003\u0001\u0000\u0000\u0000wx\u0005\u0002"+
		"\u0000\u0000xy\u0005\u000b\u0000\u0000yz\u0005\u001b\u0000\u0000z{\u0005"+
		"\u001c\u0000\u0000{|\u0003\b\u0004\u0000|}\u0005\u0001\u0000\u0000}\u0005"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005\u0010\u0000\u0000\u007f\u0080\u0005"+
		">\u0000\u0000\u0080\u0089\u0005\u001b\u0000\u0000\u0081\u0086\u0005>\u0000"+
		"\u0000\u0082\u0083\u00058\u0000\u0000\u0083\u0085\u0005>\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u0081\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u0093\u0005\u001c\u0000\u0000\u008c"+
		"\u008d\u0005@\u0000\u0000\u008d\u008e\u0003\u001e\u000f\u0000\u008e\u008f"+
		"\u0005/\u0000\u0000\u008f\u0090\u00034\u001a\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005<\u0000\u0000\u0097\u0007\u0001\u0000\u0000"+
		"\u0000\u0098\u009c\u0003\f\u0006\u0000\u0099\u009c\u0003\u001a\r\u0000"+
		"\u009a\u009c\u0003\u0002\u0001\u0000\u009b\u0098\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\n\u0005\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2"+
		"\t\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\f\u0000\u0000\u00a4\u00a6"+
		"\u00034\u001a\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"<\u0000\u0000\u00a8\u000b\u0001\u0000\u0000\u0000\u00a9\u00ac\u00034\u001a"+
		"\u0000\u00aa\u00ac\u0003&\u0013\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005<\u0000\u0000\u00ae\u00b2\u0001\u0000\u0000\u0000\u00af"+
		"\u00b2\u0003\"\u0011\u0000\u00b0\u00b2\u0003 \u0010\u0000\u00b1\u00ab"+
		"\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\r\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"\u0002\u0000\u0000\u00b4\u00b5\u0005>\u0000\u0000\u00b5\u00b6\u0005\u001b"+
		"\u0000\u0000\u00b6\u00b7\u0003\u0010\b\u0000\u00b7\u00b8\u0005\u001c\u0000"+
		"\u0000\u00b8\u00b9\u0003\b\u0004\u0000\u00b9\u00ba\u0005\u0001\u0000\u0000"+
		"\u00ba\u000f\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005>\u0000\u0000\u00bc"+
		"\u00be\u00058\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00d6\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c2\u00ca\u0005\u001d\u0000\u0000\u00c3\u00c4"+
		"\u0005>\u0000\u0000\u00c4\u00c5\u0005/\u0000\u0000\u00c5\u00c6\u00034"+
		"\u001a\u0000\u00c6\u00c7\u00058\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0005>\u0000\u0000\u00ce\u00cf\u0005/\u0000\u0000\u00cf"+
		"\u00d0\u00034\u001a\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005\u001e\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00c2"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d7\u0005>\u0000\u0000\u00d6\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u0011\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005?\u0000\u0000\u00d9\u00da\u0005\u001b"+
		"\u0000\u0000\u00da\u00db\u0003\u0010\b\u0000\u00db\u00dc\u0005\u001c\u0000"+
		"\u0000\u00dc\u00dd\u00056\u0000\u0000\u00dd\u00de\u0003\b\u0004\u0000"+
		"\u00de\u00df\u00057\u0000\u0000\u00df\u0013\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e7\u0005\u0018\u0000\u0000\u00e1\u00e7\u0005\u0019\u0000\u0000\u00e2"+
		"\u00e7\u0005\u001a\u0000\u0000\u00e3\u00e7\u0005\u0006\u0000\u0000\u00e4"+
		"\u00e7\u0005\u0007\u0000\u0000\u00e5\u00e7\u0003\u0012\t\u0000\u00e6\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u0015"+
		"\u0001\u0000\u0000\u0000\u00e8\u00f2\u0005\u001d\u0000\u0000\u00e9\u00ea"+
		"\u00034\u001a\u0000\u00ea\u00eb\u00058\u0000\u0000\u00eb\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f3\u00034\u001a\u0000\u00f2\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0005\u001e\u0000\u0000\u00f5\u0017\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005\u001b\u0000\u0000\u00f7\u00fe\u0005>\u0000\u0000"+
		"\u00f8\u00f9\u0005\u0018\u0000\u0000\u00f9\u00fa\u0005:\u0000\u0000\u00fa"+
		"\u00fe\u0005>\u0000\u0000\u00fb\u00fc\u0005\u0018\u0000\u0000\u00fc\u00fe"+
		"\u0005\u001c\u0000\u0000\u00fd\u00f6\u0001\u0000\u0000\u0000\u00fd\u00f8"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u0019"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0003\u0000\u0000\u0100\u0101"+
		"\u0003\u001e\u000f\u0000\u0101\u0108\u0003\b\u0004\u0000\u0102\u0103\u0005"+
		"\u0005\u0000\u0000\u0103\u0104\u0003\u001e\u000f\u0000\u0104\u0105\u0003"+
		"\b\u0004\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u0102\u0001\u0000"+
		"\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010d\u0001\u0000"+
		"\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0004"+
		"\u0000\u0000\u010c\u010e\u0003\b\u0004\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0005\u0001\u0000\u0000\u0110\u001b\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005\u0003\u0000\u0000\u0112\u0113\u0003\u001e\u000f"+
		"\u0000\u0113\u011a\u0003(\u0014\u0000\u0114\u0115\u0005\u0005\u0000\u0000"+
		"\u0115\u0116\u0003\u001e\u000f\u0000\u0116\u0117\u0003(\u0014\u0000\u0117"+
		"\u0119\u0001\u0000\u0000\u0000\u0118\u0114\u0001\u0000\u0000\u0000\u0119"+
		"\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011f\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0004\u0000\u0000\u011e"+
		"\u0120\u0003(\u0014\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0005\u0001\u0000\u0000\u0122\u001d\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0005\u001b\u0000\u0000\u0124\u0125\u0003\u001e\u000f\u0000\u0125\u0126"+
		"\u0005\u001c\u0000\u0000\u0126\u0132\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0005\u001b\u0000\u0000\u0128\u0129\u0003\u001e\u000f\u0000\u0129\u012a"+
		"\u0007\u0001\u0000\u0000\u012a\u012b\u0003\u001e\u000f\u0000\u012b\u012c"+
		"\u0005\u001c\u0000\u0000\u012c\u0132\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0005\u001b\u0000\u0000\u012e\u012f\u00034\u001a\u0000\u012f\u0130\u0005"+
		"\u001c\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u0123\u0001"+
		"\u0000\u0000\u0000\u0131\u0127\u0001\u0000\u0000\u0000\u0131\u012d\u0001"+
		"\u0000\u0000\u0000\u0132\u001f\u0001\u0000\u0000\u0000\u0133\u0134\u0005"+
		"\u0014\u0000\u0000\u0134\u0135\u0005\u0015\u0000\u0000\u0135\u0136\u0003"+
		"(\u0014\u0000\u0136\u0137\u0005\u0001\u0000\u0000\u0137!\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005\u0016\u0000\u0000\u0139\u013a\u0005>\u0000\u0000"+
		"\u013a\u013b\u0005\u0017\u0000\u0000\u013b\u0142\u0003\u0016\u000b\u0000"+
		"\u013c\u0142\u0005>\u0000\u0000\u013d\u013e\u0003\u0018\f\u0000\u013e"+
		"\u013f\u0003(\u0014\u0000\u013f\u0140\u0005\u0001\u0000\u0000\u0140\u0142"+
		"\u0001\u0000\u0000\u0000\u0141\u0138\u0001\u0000\u0000\u0000\u0141\u013c"+
		"\u0001\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000\u0142#\u0001"+
		"\u0000\u0000\u0000\u0143\u0148\u0005>\u0000\u0000\u0144\u0145\u0005\u001d"+
		"\u0000\u0000\u0145\u0146\u00034\u001a\u0000\u0146\u0147\u0005\u001e\u0000"+
		"\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0144\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b%\u0001\u0000\u0000\u0000"+
		"\u014c\u0150\u0005>\u0000\u0000\u014d\u0150\u0003\u0016\u000b\u0000\u014e"+
		"\u0150\u0003$\u0012\u0000\u014f\u014c\u0001\u0000\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0007\u0002\u0000\u0000\u0152\u0153"+
		"\u00034\u001a\u0000\u0153\'\u0001\u0000\u0000\u0000\u0154\u015a\u0003"+
		"\f\u0006\u0000\u0155\u015a\u0003\u0002\u0001\u0000\u0156\u015a\u0003\u001c"+
		"\u000e\u0000\u0157\u015a\u00030\u0018\u0000\u0158\u015a\u0003.\u0017\u0000"+
		"\u0159\u0154\u0001\u0000\u0000\u0000\u0159\u0155\u0001\u0000\u0000\u0000"+
		"\u0159\u0156\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000"+
		"\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000"+
		"\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u0161\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000"+
		"\u015e\u0162\u0003\n\u0005\u0000\u015f\u0162\u0003*\u0015\u0000\u0160"+
		"\u0162\u0003,\u0016\u0000\u0161\u015e\u0001\u0000\u0000\u0000\u0161\u015f"+
		"\u0001\u0000\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162)\u0001\u0000\u0000\u0000\u0163\u0164\u0005"+
		"\u0013\u0000\u0000\u0164\u0165\u0005<\u0000\u0000\u0165+\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005\u0012\u0000\u0000\u0167\u0168\u0005<\u0000\u0000"+
		"\u0168-\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u0012\u0000\u0000\u016a"+
		"\u016b\u0005\u0003\u0000\u0000\u016b\u016c\u0003\u001e\u000f\u0000\u016c"+
		"\u016d\u0005<\u0000\u0000\u016d/\u0001\u0000\u0000\u0000\u016e\u016f\u0005"+
		"\u0013\u0000\u0000\u016f\u0170\u0005\u0003\u0000\u0000\u0170\u0171\u0003"+
		"\u001e\u000f\u0000\u0171\u0172\u0005<\u0000\u0000\u01721\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0005\u000e\u0000\u0000\u0174\u0175\u0005\u001b\u0000"+
		"\u0000\u0175\u0176\u0005;\u0000\u0000\u0176\u0177\u0005>\u0000\u0000\u0177"+
		"\u0178\u0005\u001c\u0000\u0000\u01783\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u00036\u001b\u0000\u017a5\u0001\u0000\u0000\u0000\u017b\u017c\u0003:"+
		"\u001d\u0000\u017c\u017d\u00038\u001c\u0000\u017d7\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u00055\u0000\u0000\u017f\u0180\u0003:\u001d\u0000\u0180\u0181"+
		"\u00038\u001c\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u017e\u0001\u0000\u0000\u0000\u0183\u0182\u0001"+
		"\u0000\u0000\u0000\u01849\u0001\u0000\u0000\u0000\u0185\u0186\u0003>\u001f"+
		"\u0000\u0186\u0187\u0003<\u001e\u0000\u0187;\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u0005-\u0000\u0000\u0189\u018a\u0003>\u001f\u0000\u018a\u018b\u0003"+
		"<\u001e\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018e\u0001\u0000"+
		"\u0000\u0000\u018d\u0188\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000"+
		"\u0000\u0000\u018e=\u0001\u0000\u0000\u0000\u018f\u0190\u0003B!\u0000"+
		"\u0190\u0191\u0003@ \u0000\u0191?\u0001\u0000\u0000\u0000\u0192\u0193"+
		"\u0005,\u0000\u0000\u0193\u0194\u0003B!\u0000\u0194\u0195\u0003@ \u0000"+
		"\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000"+
		"\u0197\u0192\u0001\u0000\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000"+
		"\u0198A\u0001\u0000\u0000\u0000\u0199\u019a\u0003F#\u0000\u019a\u019b"+
		"\u0003D\"\u0000\u019bC\u0001\u0000\u0000\u0000\u019c\u019d\u0005*\u0000"+
		"\u0000\u019d\u019e\u0003F#\u0000\u019e\u019f\u0003D\"\u0000\u019f\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005+\u0000\u0000\u01a1\u01a2\u0003"+
		"F#\u0000\u01a2\u01a3\u0003D\"\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u019c\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a0\u0001\u0000\u0000\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a6E\u0001\u0000\u0000\u0000\u01a7\u01a8\u0003J%\u0000\u01a8\u01a9"+
		"\u0003H$\u0000\u01a9G\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005(\u0000"+
		"\u0000\u01ab\u01ac\u0003J%\u0000\u01ac\u01ad\u0003H$\u0000\u01ad\u01bc"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0005)\u0000\u0000\u01af\u01b0\u0003"+
		"J%\u0000\u01b0\u01b1\u0003H$\u0000\u01b1\u01bc\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0005&\u0000\u0000\u01b3\u01b4\u0003J%\u0000\u01b4\u01b5"+
		"\u0003H$\u0000\u01b5\u01bc\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005\'"+
		"\u0000\u0000\u01b7\u01b8\u0003J%\u0000\u01b8\u01b9\u0003H$\u0000\u01b9"+
		"\u01bc\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb"+
		"\u01aa\u0001\u0000\u0000\u0000\u01bb\u01ae\u0001\u0000\u0000\u0000\u01bb"+
		"\u01b2\u0001\u0000\u0000\u0000\u01bb\u01b6\u0001\u0000\u0000\u0000\u01bb"+
		"\u01ba\u0001\u0000\u0000\u0000\u01bcI\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0003N\'\u0000\u01be\u01bf\u0003L&\u0000\u01bfK\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0005\u001f\u0000\u0000\u01c1\u01c2\u0003N\'\u0000\u01c2"+
		"\u01c3\u0003L&\u0000\u01c3\u01ca\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005"+
		" \u0000\u0000\u01c5\u01c6\u0003N\'\u0000\u01c6\u01c7\u0003L&\u0000\u01c7"+
		"\u01ca\u0001\u0000\u0000\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c9\u01c4\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c8\u0001\u0000\u0000\u0000\u01caM\u0001\u0000\u0000\u0000\u01cb\u01cc"+
		"\u0003R)\u0000\u01cc\u01cd\u0003P(\u0000\u01cdO\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u0005!\u0000\u0000\u01cf\u01d0\u0003R)\u0000\u01d0\u01d1"+
		"\u0003P(\u0000\u01d1\u01dc\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005\""+
		"\u0000\u0000\u01d3\u01d4\u0003R)\u0000\u01d4\u01d5\u0003P(\u0000\u01d5"+
		"\u01dc\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005#\u0000\u0000\u01d7\u01d8"+
		"\u0003R)\u0000\u01d8\u01d9\u0003P(\u0000\u01d9\u01dc\u0001\u0000\u0000"+
		"\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db\u01ce\u0001\u0000\u0000"+
		"\u0000\u01db\u01d2\u0001\u0000\u0000\u0000\u01db\u01d6\u0001\u0000\u0000"+
		"\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01dcQ\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0005.\u0000\u0000\u01de\u01e3\u0003T*\u0000\u01df\u01e0"+
		"\u0005 \u0000\u0000\u01e0\u01e3\u0003T*\u0000\u01e1\u01e3\u0003T*\u0000"+
		"\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2\u01df\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3S\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u0005\u001b\u0000\u0000\u01e5\u01e6\u00034\u001a\u0000\u01e6\u01e7"+
		"\u0005\u001c\u0000\u0000\u01e7\u01f6\u0001\u0000\u0000\u0000\u01e8\u01f6"+
		"\u0003\u0016\u000b\u0000\u01e9\u01ec\u0005>\u0000\u0000\u01ea\u01ec\u0003"+
		"$\u0012\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ee\u0001\u0000\u0000\u0000\u01ed\u01ef\u0007\u0003"+
		"\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f6\u0001\u0000\u0000\u0000\u01f0\u01f6\u0003V+\u0000"+
		"\u01f1\u01f6\u0003X,\u0000\u01f2\u01f6\u0003\u0014\n\u0000\u01f3\u01f6"+
		"\u0003Z-\u0000\u01f4\u01f6\u00032\u0019\u0000\u01f5\u01e4\u0001\u0000"+
		"\u0000\u0000\u01f5\u01e8\u0001\u0000\u0000\u0000\u01f5\u01eb\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f0\u0001\u0000\u0000\u0000\u01f5\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f6U\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0005>\u0000\u0000\u01f8\u0201\u0005\u001b\u0000\u0000"+
		"\u01f9\u01fe\u00034\u001a\u0000\u01fa\u01fb\u00058\u0000\u0000\u01fb\u01fd"+
		"\u00034\u001a\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd\u0200\u0001"+
		"\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001"+
		"\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001"+
		"\u0000\u0000\u0000\u0201\u01f9\u0001\u0000\u0000\u0000\u0201\u0202\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0005"+
		"\u001c\u0000\u0000\u0204W\u0001\u0000\u0000\u0000\u0205\u020b\u0003\\"+
		".\u0000\u0206\u020b\u0003^/\u0000\u0207\u020b\u0003`0\u0000\u0208\u020b"+
		"\u0003b1\u0000\u0209\u020b\u0003d2\u0000\u020a\u0205\u0001\u0000\u0000"+
		"\u0000\u020a\u0206\u0001\u0000\u0000\u0000\u020a\u0207\u0001\u0000\u0000"+
		"\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000"+
		"\u0000\u020bY\u0001\u0000\u0000\u0000\u020c\u020d\u0005>\u0000\u0000\u020d"+
		"\u020e\u00059\u0000\u0000\u020e\u020f\u0005\u0011\u0000\u0000\u020f\u0218"+
		"\u0005\u001b\u0000\u0000\u0210\u0215\u00034\u001a\u0000\u0211\u0212\u0005"+
		"8\u0000\u0000\u0212\u0214\u00034\u001a\u0000\u0213\u0211\u0001\u0000\u0000"+
		"\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000\u0000"+
		"\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u0210\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0005\u001c\u0000\u0000\u021b[\u0001\u0000\u0000\u0000"+
		"\u021c\u021d\u0005\r\u0000\u0000\u021d\u021e\u0005\u001b\u0000\u0000\u021e"+
		"\u021f\u00034\u001a\u0000\u021f\u0220\u0005\u001c\u0000\u0000\u0220]\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0005\n\u0000\u0000\u0222\u0223\u0005\u001b"+
		"\u0000\u0000\u0223\u0224\u00034\u001a\u0000\u0224\u0225\u00058\u0000\u0000"+
		"\u0225\u0226\u00034\u001a\u0000\u0226\u0227\u0005\u001c\u0000\u0000\u0227"+
		"_\u0001\u0000\u0000\u0000\u0228\u0229\u0005\u000f\u0000\u0000\u0229\u022a"+
		"\u0005\u001b\u0000\u0000\u022a\u022b\u00034\u001a\u0000\u022b\u022c\u0005"+
		"\u001c\u0000\u0000\u022ca\u0001\u0000\u0000\u0000\u022d\u022e\u0005\b"+
		"\u0000\u0000\u022e\u022f\u0005\u001b\u0000\u0000\u022f\u0230\u00034\u001a"+
		"\u0000\u0230\u0231\u0005\u001c\u0000\u0000\u0231c\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0005\t\u0000\u0000\u0233\u0234\u0005\u001b\u0000\u0000\u0234"+
		"\u0235\u00034\u001a\u0000\u0235\u0236\u0005\u001c\u0000\u0000\u0236e\u0001"+
		"\u0000\u0000\u0000/ikr\u0086\u0089\u0093\u009b\u009d\u00a1\u00a5\u00ab"+
		"\u00b1\u00bf\u00ca\u00d3\u00d6\u00e6\u00ee\u00f2\u00fd\u0108\u010d\u011a"+
		"\u011f\u0131\u0141\u014a\u014f\u0159\u015b\u0161\u0183\u018d\u0197\u01a5"+
		"\u01bb\u01c9\u01db\u01e2\u01eb\u01ee\u01f5\u01fe\u0201\u020a\u0215\u0218";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}