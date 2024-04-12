// Generated from C:/Users/ALI/OneDrive/Desktop/university/Project/Compiler/FunctionCraft-Compiler/CA1/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
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
		RULE_condition = 15, RULE_condition_or = 16, RULE_condition_or_ = 17, 
		RULE_condition_and = 18, RULE_condition_and_ = 19, RULE_condition_other = 20, 
		RULE_loop = 21, RULE_for_loop = 22, RULE_list_element = 23, RULE_assignment = 24, 
		RULE_loop_scope = 25, RULE_break_statement = 26, RULE_next_statement = 27, 
		RULE_next_if_statement = 28, RULE_break_if_statement = 29, RULE_function_ptr = 30, 
		RULE_expr = 31, RULE_expr_append = 32, RULE_expr_append_ = 33, RULE_expr_or = 34, 
		RULE_expr_or_ = 35, RULE_expr_and = 36, RULE_expr_and_ = 37, RULE_expr_eq = 38, 
		RULE_expr_eq_ = 39, RULE_expr_cmp = 40, RULE_expr_cmp_ = 41, RULE_expr_add_sub = 42, 
		RULE_expr_add_sub_ = 43, RULE_expr_mul_div = 44, RULE_expr_mul_div_ = 45, 
		RULE_expr_unary = 46, RULE_expr_other = 47, RULE_function_call = 48, RULE_primitive_function_call = 49, 
		RULE_matching = 50, RULE_puts = 51, RULE_push = 52, RULE_len = 53, RULE_chop = 54, 
		RULE_chomp = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"function_craft", "comment", "main", "pattern", "function_scope", "return_statement", 
			"statement", "function", "function_args", "lambda_function", "primitive_value", 
			"list", "range", "if_structure", "if_structure_loop", "condition", "condition_or", 
			"condition_or_", "condition_and", "condition_and_", "condition_other", 
			"loop", "for_loop", "list_element", "assignment", "loop_scope", "break_statement", 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_craft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_craft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_craft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_craftContext function_craft() throws RecognitionException {
		Function_craftContext _localctx = new Function_craftContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_function_craft);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(115);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DEF:
						{
						setState(112);
						function();
						}
						break;
					case SINGLE_LINE_COMMENT:
					case MULTI_LINE_COMMENT:
						{
						setState(113);
						comment();
						}
						break;
					case PATTERN:
						{
						setState(114);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(120);
			main();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) {
				{
				{
				setState(121);
				comment();
				}
				}
				setState(126);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(DEF);
			setState(130);
			match(MAIN);
			setState(131);
			match(LPAR);
			setState(132);
			match(RPAR);
			setState(133);
			function_scope();
			setState(134);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(PATTERN);
			setState(137);
			match(IDENTIFIER);
			setState(138);
			match(LPAR);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(139);
				match(IDENTIFIER);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(140);
					match(COMMA);
					setState(141);
					match(IDENTIFIER);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(149);
			match(RPAR);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PATTERN_TOKEN) {
				{
				{
				setState(150);
				match(PATTERN_TOKEN);
				setState(151);
				condition();
				setState(152);
				match(ASSIGN);
				setState(153);
				expr();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_scopeContext function_scope() throws RecognitionException {
		Function_scopeContext _localctx = new Function_scopeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & -2882294964787995399L) != 0)) {
				{
				setState(165);
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
					setState(162);
					statement();
					}
					break;
				case IF:
					{
					setState(163);
					if_structure();
					}
					break;
				case SINGLE_LINE_COMMENT:
				case MULTI_LINE_COMMENT:
					{
					setState(164);
					comment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(170);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(RETURN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611615644599654464L) != 0)) {
				{
				setState(174);
				expr();
				}
			}

			setState(177);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(179);
					expr();
					}
					break;
				case 2:
					{
					setState(180);
					assignment();
					}
					break;
				}
				setState(183);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				for_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(DEF);
			setState(190);
			match(IDENTIFIER);
			setState(191);
			match(LPAR);
			setState(192);
			function_args();
			setState(193);
			match(RPAR);
			setState(194);
			function_scope();
			setState(195);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_args(this);
			else return visitor.visitChildren(this);
		}
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
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					match(IDENTIFIER);
					setState(198);
					match(COMMA);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAR:
			case LBRACKET:
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(204);
					match(LBRACKET);
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(205);
							match(IDENTIFIER);
							setState(206);
							match(ASSIGN);
							setState(207);
							expr();
							setState(208);
							match(COMMA);
							}
							} 
						}
						setState(214);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					{
					setState(215);
					match(IDENTIFIER);
					setState(216);
					match(ASSIGN);
					setState(217);
					expr();
					}
					setState(219);
					match(RBRACKET);
					}
				}

				}
				break;
			case IDENTIFIER:
				{
				{
				setState(223);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambda_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambda_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambda_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_functionContext lambda_function() throws RecognitionException {
		Lambda_functionContext _localctx = new Lambda_functionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lambda_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ARROW);
			setState(227);
			match(LPAR);
			setState(228);
			function_args();
			setState(229);
			match(RPAR);
			setState(230);
			match(LBRACE);
			setState(231);
			function_scope();
			setState(232);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPrimitive_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPrimitive_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPrimitive_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_valueContext primitive_value() throws RecognitionException {
		Primitive_valueContext _localctx = new Primitive_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_primitive_value);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(INT_VAL);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(FLOAT_VAL);
				}
				break;
			case STRING_VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(STRING_VAL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(FALSE);
				}
				break;
			case ARROW:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(LBRACKET);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611615644599654464L) != 0)) {
				{
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(243);
						expr();
						setState(244);
						match(COMMA);
						}
						} 
					}
					setState(250);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(251);
				expr();
				}
			}

			setState(254);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_range);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(LPAR);
				setState(257);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(INT_VAL);
				setState(259);
				match(DOUBLEDOT);
				setState(260);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(INT_VAL);
				setState(262);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf_structure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf_structure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf_structure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_structureContext if_structure() throws RecognitionException {
		If_structureContext _localctx = new If_structureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(IF);
			setState(266);
			condition();
			setState(267);
			function_scope();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(268);
				match(ELSEIF);
				setState(269);
				condition();
				setState(270);
				function_scope();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(277);
				match(ELSE);
				setState(278);
				function_scope();
				}
			}

			setState(281);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf_structure_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf_structure_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf_structure_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_structure_loopContext if_structure_loop() throws RecognitionException {
		If_structure_loopContext _localctx = new If_structure_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_structure_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(IF);
			setState(284);
			condition();
			setState(285);
			loop_scope();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(286);
				match(ELSEIF);
				setState(287);
				condition();
				setState(288);
				loop_scope();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(295);
				match(ELSE);
				setState(296);
				loop_scope();
				}
			}

			setState(299);
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
		public Condition_orContext condition_or() {
			return getRuleContext(Condition_orContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			condition_or();
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
	public static class Condition_orContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Condition_andContext condition_and() {
			return getRuleContext(Condition_andContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Condition_or_Context condition_or_() {
			return getRuleContext(Condition_or_Context.class,0);
		}
		public Condition_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_orContext condition_or() throws RecognitionException {
		Condition_orContext _localctx = new Condition_orContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition_or);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(LPAR);
				setState(304);
				condition_and();
				setState(305);
				match(RPAR);
				setState(306);
				condition_or_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				condition_and();
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
	public static class Condition_or_Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Condition_andContext condition_and() {
			return getRuleContext(Condition_andContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Condition_or_Context condition_or_() {
			return getRuleContext(Condition_or_Context.class,0);
		}
		public Condition_or_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_or_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition_or_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition_or_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition_or_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_or_Context condition_or_() throws RecognitionException {
		Condition_or_Context _localctx = new Condition_or_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition_or_);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(OR);
				setState(312);
				match(LPAR);
				setState(313);
				condition_and();
				setState(314);
				match(RPAR);
				setState(315);
				condition_or_();
				}
				break;
			case END:
			case IF:
			case ELSE:
			case ELSEIF:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case RETURN:
			case PUTS:
			case METHOD:
			case LEN:
			case NEXT:
			case BREAK:
			case LOOP:
			case FOR:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case LPAR:
			case LBRACKET:
			case MINUS:
			case NOT:
			case ASSIGN:
			case SEMICOLON:
			case IDENTIFIER:
			case ARROW:
			case SINGLE_LINE_COMMENT:
			case MULTI_LINE_COMMENT:
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
	public static class Condition_andContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Condition_otherContext condition_other() {
			return getRuleContext(Condition_otherContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Condition_and_Context condition_and_() {
			return getRuleContext(Condition_and_Context.class,0);
		}
		public Condition_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_andContext condition_and() throws RecognitionException {
		Condition_andContext _localctx = new Condition_andContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition_and);
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(LPAR);
				setState(321);
				condition_other();
				setState(322);
				match(RPAR);
				setState(323);
				condition_and_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				condition_other();
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
	public static class Condition_and_Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FunctionCraftParser.AND, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Condition_otherContext condition_other() {
			return getRuleContext(Condition_otherContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Condition_and_Context condition_and_() {
			return getRuleContext(Condition_and_Context.class,0);
		}
		public Condition_and_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_and_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition_and_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition_and_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition_and_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_and_Context condition_and_() throws RecognitionException {
		Condition_and_Context _localctx = new Condition_and_Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition_and_);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(AND);
				setState(329);
				match(LPAR);
				setState(330);
				condition_other();
				setState(331);
				match(RPAR);
				setState(332);
				condition_and_();
				}
				break;
			case END:
			case IF:
			case ELSE:
			case ELSEIF:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case RETURN:
			case PUTS:
			case METHOD:
			case LEN:
			case NEXT:
			case BREAK:
			case LOOP:
			case FOR:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case LPAR:
			case RPAR:
			case LBRACKET:
			case MINUS:
			case NOT:
			case ASSIGN:
			case SEMICOLON:
			case IDENTIFIER:
			case ARROW:
			case SINGLE_LINE_COMMENT:
			case MULTI_LINE_COMMENT:
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
	public static class Condition_otherContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Condition_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCondition_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCondition_other(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCondition_other(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_otherContext condition_other() throws RecognitionException {
		Condition_otherContext _localctx = new Condition_otherContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condition_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(LPAR);
			setState(338);
			expr();
			setState(339);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(LOOP);
			setState(342);
			match(DO);
			setState(343);
			loop_scope();
			setState(344);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_for_loop);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(FOR);
				setState(347);
				match(IDENTIFIER);
				setState(348);
				match(IN);
				setState(349);
				list();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(IDENTIFIER);
				}
				break;
			case INT_VAL:
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				range();
				setState(352);
				loop_scope();
				setState(353);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterList_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitList_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitList_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_elementContext list_element() throws RecognitionException {
		List_elementContext _localctx = new List_elementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_list_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(IDENTIFIER);
			setState(362); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(358);
				match(LBRACKET);
				setState(359);
				expr();
				setState(360);
				match(RBRACKET);
				}
				}
				setState(364); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(366);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(367);
				list();
				}
				break;
			case 3:
				{
				setState(368);
				list_element();
				}
				break;
			}
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8866461766385664L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(372);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoop_scope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoop_scope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoop_scope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_scopeContext loop_scope() throws RecognitionException {
		Loop_scopeContext _localctx = new Loop_scopeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loop_scope);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(379);
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
						setState(374);
						statement();
						}
						break;
					case SINGLE_LINE_COMMENT:
					case MULTI_LINE_COMMENT:
						{
						setState(375);
						comment();
						}
						break;
					case IF:
						{
						setState(376);
						if_structure_loop();
						}
						break;
					case BREAK:
						{
						setState(377);
						break_if_statement();
						}
						break;
					case NEXT:
						{
						setState(378);
						next_if_statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(384);
				return_statement();
				}
				break;
			case BREAK:
				{
				setState(385);
				break_statement();
				}
				break;
			case NEXT:
				{
				setState(386);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(BREAK);
			setState(390);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNext_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNext_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNext_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_statementContext next_statement() throws RecognitionException {
		Next_statementContext _localctx = new Next_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_next_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(NEXT);
			setState(393);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNext_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNext_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNext_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Next_if_statementContext next_if_statement() throws RecognitionException {
		Next_if_statementContext _localctx = new Next_if_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_next_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(NEXT);
			setState(396);
			match(IF);
			setState(397);
			condition();
			setState(398);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreak_if_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreak_if_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreak_if_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_if_statementContext break_if_statement() throws RecognitionException {
		Break_if_statementContext _localctx = new Break_if_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_break_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(BREAK);
			setState(401);
			match(IF);
			setState(402);
			condition();
			setState(403);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_ptr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_ptr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_ptr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_ptrContext function_ptr() throws RecognitionException {
		Function_ptrContext _localctx = new Function_ptrContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_function_ptr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(METHOD);
			setState(406);
			match(LPAR);
			setState(407);
			match(COLON);
			setState(408);
			match(IDENTIFIER);
			setState(409);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_append(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_append(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_append(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_appendContext expr_append() throws RecognitionException {
		Expr_appendContext _localctx = new Expr_appendContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			expr_or();
			setState(414);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_append_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_append_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_append_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_append_Context expr_append_() throws RecognitionException {
		Expr_append_Context _localctx = new Expr_append_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_append_);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPEND:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(APPEND);
				setState(417);
				expr_or();
				setState(418);
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
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Expr_or_Context expr_or_() {
			return getRuleContext(Expr_or_Context.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expr_or);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(LPAR);
				setState(424);
				expr_and();
				setState(425);
				match(RPAR);
				setState(426);
				expr_or_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				expr_and();
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
	public static class Expr_or_Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(FunctionCraftParser.OR, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Expr_or_Context expr_or_() {
			return getRuleContext(Expr_or_Context.class,0);
		}
		public Expr_or_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_or_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_or_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_or_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_or_Context expr_or_() throws RecognitionException {
		Expr_or_Context _localctx = new Expr_or_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_expr_or_);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(OR);
				setState(432);
				match(LPAR);
				setState(433);
				expr_and();
				setState(434);
				match(RPAR);
				setState(435);
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
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public Expr_and_Context expr_and_() {
			return getRuleContext(Expr_and_Context.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expr_and);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(LPAR);
				setState(441);
				expr_eq();
				setState(442);
				match(RPAR);
				setState(443);
				expr_and_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				expr_eq();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_and_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_and_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_and_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_and_Context expr_and_() throws RecognitionException {
		Expr_and_Context _localctx = new Expr_and_Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_expr_and_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(AND);
			setState(449);
			expr_eq();
			setState(450);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_eq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			expr_cmp();
			setState(453);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_eq_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_eq_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_eq_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_eq_Context expr_eq_() throws RecognitionException {
		Expr_eq_Context _localctx = new Expr_eq_Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_expr_eq_);
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQL:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(EQL);
				setState(456);
				expr_cmp();
				setState(457);
				expr_eq_();
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(NEQ);
				setState(460);
				expr_cmp();
				setState(461);
				expr_eq_();
				}
				break;
			case RPAR:
			case RBRACKET:
			case AND:
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_cmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_cmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			expr_add_sub();
			setState(467);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_cmp_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_cmp_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_cmp_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cmp_Context expr_cmp_() throws RecognitionException {
		Expr_cmp_Context _localctx = new Expr_cmp_Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_expr_cmp_);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(GTR);
				setState(470);
				expr_add_sub();
				setState(471);
				expr_cmp_();
				}
				break;
			case LES:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(LES);
				setState(474);
				expr_add_sub();
				setState(475);
				expr_cmp_();
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				match(GEQ);
				setState(478);
				expr_add_sub();
				setState(479);
				expr_cmp_();
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				match(LEQ);
				setState(482);
				expr_add_sub();
				setState(483);
				expr_cmp_();
				}
				break;
			case RPAR:
			case RBRACKET:
			case EQL:
			case NEQ:
			case AND:
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_add_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_add_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_add_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_add_subContext expr_add_sub() throws RecognitionException {
		Expr_add_subContext _localctx = new Expr_add_subContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expr_add_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			expr_mul_div();
			setState(489);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_add_sub_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_add_sub_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_add_sub_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_add_sub_Context expr_add_sub_() throws RecognitionException {
		Expr_add_sub_Context _localctx = new Expr_add_sub_Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_expr_add_sub_);
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(PLUS);
				setState(492);
				expr_mul_div();
				setState(493);
				expr_add_sub_();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				match(MINUS);
				setState(496);
				expr_mul_div();
				setState(497);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_mul_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_mul_div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_mul_div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_mul_divContext expr_mul_div() throws RecognitionException {
		Expr_mul_divContext _localctx = new Expr_mul_divContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expr_mul_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			expr_unary();
			setState(503);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_mul_div_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_mul_div_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_mul_div_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_mul_div_Context expr_mul_div_() throws RecognitionException {
		Expr_mul_div_Context _localctx = new Expr_mul_div_Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_expr_mul_div_);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(MULT);
				setState(506);
				expr_unary();
				setState(507);
				expr_mul_div_();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(DIV);
				setState(510);
				expr_unary();
				setState(511);
				expr_mul_div_();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				match(MOD);
				setState(514);
				expr_unary();
				setState(515);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_unaryContext expr_unary() throws RecognitionException {
		Expr_unaryContext _localctx = new Expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr_unary);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(NOT);
				setState(521);
				expr_other();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(MINUS);
				setState(523);
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
				setState(524);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterExpr_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitExpr_other(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitExpr_other(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expr_other);
		int _la;
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(LPAR);
				setState(528);
				expr();
				setState(529);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(532);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(533);
					list_element();
					}
					break;
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(536);
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
				setState(539);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(540);
				primitive_function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(541);
				primitive_value();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(542);
				matching();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(543);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(IDENTIFIER);
			setState(547);
			match(LPAR);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611615644599654464L) != 0)) {
				{
				setState(548);
				expr();
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(549);
					match(COMMA);
					setState(550);
					expr();
					}
					}
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(558);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPrimitive_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPrimitive_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPrimitive_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_function_callContext primitive_function_call() throws RecognitionException {
		Primitive_function_callContext _localctx = new Primitive_function_callContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_primitive_function_call);
		try {
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				puts();
				}
				break;
			case PUSH:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				push();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				len();
				}
				break;
			case CHOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(563);
				chop();
				}
				break;
			case CHOMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(564);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_matching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(IDENTIFIER);
			setState(568);
			match(DOT);
			setState(569);
			match(MATCH);
			setState(570);
			match(LPAR);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611615644599654464L) != 0)) {
				{
				setState(571);
				expr();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(572);
					match(COMMA);
					setState(573);
					expr();
					}
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(581);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPuts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPuts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPuts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutsContext puts() throws RecognitionException {
		PutsContext _localctx = new PutsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_puts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(PUTS);
			setState(584);
			match(LPAR);
			setState(585);
			expr();
			setState(586);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(PUSH);
			setState(589);
			match(LPAR);
			setState(590);
			expr();
			setState(591);
			match(COMMA);
			setState(592);
			expr();
			setState(593);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(LEN);
			setState(596);
			match(LPAR);
			setState(597);
			expr();
			setState(598);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopContext chop() throws RecognitionException {
		ChopContext _localctx = new ChopContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_chop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(CHOP);
			setState(601);
			match(LPAR);
			setState(602);
			expr();
			setState(603);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChompContext chomp() throws RecognitionException {
		ChompContext _localctx = new ChompContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_chomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(CHOMP);
			setState(606);
			match(LPAR);
			setState(607);
			expr();
			setState(608);
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
		"\u0004\u0001C\u0263\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000t\b\u0000\n\u0000"+
		"\f\u0000w\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000{\b\u0000\n\u0000"+
		"\f\u0000~\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008f"+
		"\b\u0003\n\u0003\f\u0003\u0092\t\u0003\u0003\u0003\u0094\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u009c\b\u0003\n\u0003\f\u0003\u009f\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00a6\b\u0004\n\u0004"+
		"\f\u0004\u00a9\t\u0004\u0001\u0004\u0003\u0004\u00ac\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00b0\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00b6\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00bc\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0005\b\u00c8\b\b\n\b\f\b\u00cb\t\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00d3\b\b\n\b\f\b\u00d6\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00de\b\b\u0001\b\u0003\b\u00e1\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f1\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f7\b\u000b\n\u000b"+
		"\f\u000b\u00fa\t\u000b\u0001\u000b\u0003\u000b\u00fd\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0108\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0111\b\r\n\r\f\r\u0114\t\r\u0001\r\u0001\r\u0003\r\u0118\b\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0123\b\u000e\n\u000e\f\u000e\u0126"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u012a\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0136\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u013f\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0147\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0150\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0164\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0004\u0017\u016b\b\u0017\u000b\u0017\f\u0017"+
		"\u016c\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0172\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u017c\b\u0019\n\u0019\f\u0019\u017f\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0184\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01a6\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01ae\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u01b7\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u01bf\b$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u01d1\b\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u01e7\b)\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01f5"+
		"\b+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0207\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u020e\b.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u0217\b/\u0001/\u0003/\u021a\b/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u0221\b/\u00010\u00010\u00010\u00010\u00010\u0005"+
		"0\u0228\b0\n0\f0\u022b\t0\u00030\u022d\b0\u00010\u00010\u00011\u00011"+
		"\u00011\u00011\u00011\u00031\u0236\b1\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00052\u023f\b2\n2\f2\u0242\t2\u00032\u0244\b2\u00012"+
		"\u00012\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u0000"+
		"\u00008\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\u0003"+
		"\u0001\u0000AB\u0001\u0000/4\u0001\u0000$%\u027d\u0000u\u0001\u0000\u0000"+
		"\u0000\u0002\u007f\u0001\u0000\u0000\u0000\u0004\u0081\u0001\u0000\u0000"+
		"\u0000\u0006\u0088\u0001\u0000\u0000\u0000\b\u00a7\u0001\u0000\u0000\u0000"+
		"\n\u00ad\u0001\u0000\u0000\u0000\f\u00bb\u0001\u0000\u0000\u0000\u000e"+
		"\u00bd\u0001\u0000\u0000\u0000\u0010\u00c9\u0001\u0000\u0000\u0000\u0012"+
		"\u00e2\u0001\u0000\u0000\u0000\u0014\u00f0\u0001\u0000\u0000\u0000\u0016"+
		"\u00f2\u0001\u0000\u0000\u0000\u0018\u0107\u0001\u0000\u0000\u0000\u001a"+
		"\u0109\u0001\u0000\u0000\u0000\u001c\u011b\u0001\u0000\u0000\u0000\u001e"+
		"\u012d\u0001\u0000\u0000\u0000 \u0135\u0001\u0000\u0000\u0000\"\u013e"+
		"\u0001\u0000\u0000\u0000$\u0146\u0001\u0000\u0000\u0000&\u014f\u0001\u0000"+
		"\u0000\u0000(\u0151\u0001\u0000\u0000\u0000*\u0155\u0001\u0000\u0000\u0000"+
		",\u0163\u0001\u0000\u0000\u0000.\u0165\u0001\u0000\u0000\u00000\u0171"+
		"\u0001\u0000\u0000\u00002\u017d\u0001\u0000\u0000\u00004\u0185\u0001\u0000"+
		"\u0000\u00006\u0188\u0001\u0000\u0000\u00008\u018b\u0001\u0000\u0000\u0000"+
		":\u0190\u0001\u0000\u0000\u0000<\u0195\u0001\u0000\u0000\u0000>\u019b"+
		"\u0001\u0000\u0000\u0000@\u019d\u0001\u0000\u0000\u0000B\u01a5\u0001\u0000"+
		"\u0000\u0000D\u01ad\u0001\u0000\u0000\u0000F\u01b6\u0001\u0000\u0000\u0000"+
		"H\u01be\u0001\u0000\u0000\u0000J\u01c0\u0001\u0000\u0000\u0000L\u01c4"+
		"\u0001\u0000\u0000\u0000N\u01d0\u0001\u0000\u0000\u0000P\u01d2\u0001\u0000"+
		"\u0000\u0000R\u01e6\u0001\u0000\u0000\u0000T\u01e8\u0001\u0000\u0000\u0000"+
		"V\u01f4\u0001\u0000\u0000\u0000X\u01f6\u0001\u0000\u0000\u0000Z\u0206"+
		"\u0001\u0000\u0000\u0000\\\u020d\u0001\u0000\u0000\u0000^\u0220\u0001"+
		"\u0000\u0000\u0000`\u0222\u0001\u0000\u0000\u0000b\u0235\u0001\u0000\u0000"+
		"\u0000d\u0237\u0001\u0000\u0000\u0000f\u0247\u0001\u0000\u0000\u0000h"+
		"\u024c\u0001\u0000\u0000\u0000j\u0253\u0001\u0000\u0000\u0000l\u0258\u0001"+
		"\u0000\u0000\u0000n\u025d\u0001\u0000\u0000\u0000pt\u0003\u000e\u0007"+
		"\u0000qt\u0003\u0002\u0001\u0000rt\u0003\u0006\u0003\u0000sp\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000x|\u0003\u0004\u0002"+
		"\u0000y{\u0003\u0002\u0001\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0001"+
		"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0000"+
		"\u0000\u0000\u0080\u0003\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0002"+
		"\u0000\u0000\u0082\u0083\u0005\u000b\u0000\u0000\u0083\u0084\u0005\u001b"+
		"\u0000\u0000\u0084\u0085\u0005\u001c\u0000\u0000\u0085\u0086\u0003\b\u0004"+
		"\u0000\u0086\u0087\u0005\u0001\u0000\u0000\u0087\u0005\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\u0010\u0000\u0000\u0089\u008a\u0005>\u0000\u0000"+
		"\u008a\u0093\u0005\u001b\u0000\u0000\u008b\u0090\u0005>\u0000\u0000\u008c"+
		"\u008d\u00058\u0000\u0000\u008d\u008f\u0005>\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u008b\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u009d\u0005\u001c\u0000\u0000\u0096\u0097\u0005"+
		"@\u0000\u0000\u0097\u0098\u0003\u001e\u000f\u0000\u0098\u0099\u0005/\u0000"+
		"\u0000\u0099\u009a\u0003>\u001f\u0000\u009a\u009c\u0001\u0000\u0000\u0000"+
		"\u009b\u0096\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005<\u0000\u0000\u00a1\u0007\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a6\u0003\f\u0006\u0000\u00a3\u00a6\u0003\u001a\r\u0000\u00a4\u00a6"+
		"\u0003\u0002\u0001\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0003\n\u0005\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\t\u0001\u0000"+
		"\u0000\u0000\u00ad\u00af\u0005\f\u0000\u0000\u00ae\u00b0\u0003>\u001f"+
		"\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005<\u0000\u0000"+
		"\u00b2\u000b\u0001\u0000\u0000\u0000\u00b3\u00b6\u0003>\u001f\u0000\u00b4"+
		"\u00b6\u00030\u0018\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005<\u0000\u0000\u00b8\u00bc\u0001\u0000\u0000\u0000\u00b9\u00bc\u0003"+
		",\u0016\u0000\u00ba\u00bc\u0003*\u0015\u0000\u00bb\u00b5\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\r\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0002\u0000\u0000"+
		"\u00be\u00bf\u0005>\u0000\u0000\u00bf\u00c0\u0005\u001b\u0000\u0000\u00c0"+
		"\u00c1\u0003\u0010\b\u0000\u00c1\u00c2\u0005\u001c\u0000\u0000\u00c2\u00c3"+
		"\u0003\b\u0004\u0000\u00c3\u00c4\u0005\u0001\u0000\u0000\u00c4\u000f\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005>\u0000\u0000\u00c6\u00c8\u00058\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ca\u00e0\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cc\u00d4\u0005\u001d\u0000\u0000\u00cd\u00ce\u0005>\u0000\u0000"+
		"\u00ce\u00cf\u0005/\u0000\u0000\u00cf\u00d0\u0003>\u001f\u0000\u00d0\u00d1"+
		"\u00058\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		">\u0000\u0000\u00d8\u00d9\u0005/\u0000\u0000\u00d9\u00da\u0003>\u001f"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u001e\u0000"+
		"\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00cc\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000"+
		"\u0000\u00df\u00e1\u0005>\u0000\u0000\u00e0\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u0011\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005?\u0000\u0000\u00e3\u00e4\u0005\u001b\u0000\u0000\u00e4"+
		"\u00e5\u0003\u0010\b\u0000\u00e5\u00e6\u0005\u001c\u0000\u0000\u00e6\u00e7"+
		"\u00056\u0000\u0000\u00e7\u00e8\u0003\b\u0004\u0000\u00e8\u00e9\u0005"+
		"7\u0000\u0000\u00e9\u0013\u0001\u0000\u0000\u0000\u00ea\u00f1\u0005\u0018"+
		"\u0000\u0000\u00eb\u00f1\u0005\u0019\u0000\u0000\u00ec\u00f1\u0005\u001a"+
		"\u0000\u0000\u00ed\u00f1\u0005\u0006\u0000\u0000\u00ee\u00f1\u0005\u0007"+
		"\u0000\u0000\u00ef\u00f1\u0003\u0012\t\u0000\u00f0\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u0015\u0001\u0000\u0000"+
		"\u0000\u00f2\u00fc\u0005\u001d\u0000\u0000\u00f3\u00f4\u0003>\u001f\u0000"+
		"\u00f4\u00f5\u00058\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fd\u0003>\u001f\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005\u001e\u0000\u0000\u00ff\u0017\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0005\u001b\u0000\u0000\u0101\u0108\u0005>\u0000\u0000\u0102\u0103\u0005"+
		"\u0018\u0000\u0000\u0103\u0104\u0005:\u0000\u0000\u0104\u0108\u0005>\u0000"+
		"\u0000\u0105\u0106\u0005\u0018\u0000\u0000\u0106\u0108\u0005\u001c\u0000"+
		"\u0000\u0107\u0100\u0001\u0000\u0000\u0000\u0107\u0102\u0001\u0000\u0000"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0019\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0005\u0003\u0000\u0000\u010a\u010b\u0003\u001e\u000f"+
		"\u0000\u010b\u0112\u0003\b\u0004\u0000\u010c\u010d\u0005\u0005\u0000\u0000"+
		"\u010d\u010e\u0003\u001e\u000f\u0000\u010e\u010f\u0003\b\u0004\u0000\u010f"+
		"\u0111\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0111"+
		"\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u0117\u0001\u0000\u0000\u0000\u0114"+
		"\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0004\u0000\u0000\u0116"+
		"\u0118\u0003\b\u0004\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005\u0001\u0000\u0000\u011a\u001b\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0005\u0003\u0000\u0000\u011c\u011d\u0003\u001e\u000f\u0000\u011d\u0124"+
		"\u00032\u0019\u0000\u011e\u011f\u0005\u0005\u0000\u0000\u011f\u0120\u0003"+
		"\u001e\u000f\u0000\u0120\u0121\u00032\u0019\u0000\u0121\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u011e\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0129\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005\u0004\u0000\u0000\u0128\u012a\u00032\u0019"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u0001\u0000"+
		"\u0000\u012c\u001d\u0001\u0000\u0000\u0000\u012d\u012e\u0003 \u0010\u0000"+
		"\u012e\u001f\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u001b\u0000\u0000"+
		"\u0130\u0131\u0003$\u0012\u0000\u0131\u0132\u0005\u001c\u0000\u0000\u0132"+
		"\u0133\u0003\"\u0011\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0136"+
		"\u0003$\u0012\u0000\u0135\u012f\u0001\u0000\u0000\u0000\u0135\u0134\u0001"+
		"\u0000\u0000\u0000\u0136!\u0001\u0000\u0000\u0000\u0137\u0138\u0005-\u0000"+
		"\u0000\u0138\u0139\u0005\u001b\u0000\u0000\u0139\u013a\u0003$\u0012\u0000"+
		"\u013a\u013b\u0005\u001c\u0000\u0000\u013b\u013c\u0003\"\u0011\u0000\u013c"+
		"\u013f\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e"+
		"\u0137\u0001\u0000\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f"+
		"#\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u001b\u0000\u0000\u0141\u0142"+
		"\u0003(\u0014\u0000\u0142\u0143\u0005\u001c\u0000\u0000\u0143\u0144\u0003"+
		"&\u0013\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0147\u0003(\u0014"+
		"\u0000\u0146\u0140\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000\u0000"+
		"\u0000\u0147%\u0001\u0000\u0000\u0000\u0148\u0149\u0005,\u0000\u0000\u0149"+
		"\u014a\u0005\u001b\u0000\u0000\u014a\u014b\u0003(\u0014\u0000\u014b\u014c"+
		"\u0005\u001c\u0000\u0000\u014c\u014d\u0003&\u0013\u0000\u014d\u0150\u0001"+
		"\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000\u014f\u0148\u0001"+
		"\u0000\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\'\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0005\u001b\u0000\u0000\u0152\u0153\u0003>\u001f"+
		"\u0000\u0153\u0154\u0005\u001c\u0000\u0000\u0154)\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0005\u0014\u0000\u0000\u0156\u0157\u0005\u0015\u0000\u0000"+
		"\u0157\u0158\u00032\u0019\u0000\u0158\u0159\u0005\u0001\u0000\u0000\u0159"+
		"+\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u0016\u0000\u0000\u015b\u015c"+
		"\u0005>\u0000\u0000\u015c\u015d\u0005\u0017\u0000\u0000\u015d\u0164\u0003"+
		"\u0016\u000b\u0000\u015e\u0164\u0005>\u0000\u0000\u015f\u0160\u0003\u0018"+
		"\f\u0000\u0160\u0161\u00032\u0019\u0000\u0161\u0162\u0005\u0001\u0000"+
		"\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u015a\u0001\u0000\u0000"+
		"\u0000\u0163\u015e\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000\u0000"+
		"\u0000\u0164-\u0001\u0000\u0000\u0000\u0165\u016a\u0005>\u0000\u0000\u0166"+
		"\u0167\u0005\u001d\u0000\u0000\u0167\u0168\u0003>\u001f\u0000\u0168\u0169"+
		"\u0005\u001e\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0166"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016a"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d/\u0001"+
		"\u0000\u0000\u0000\u016e\u0172\u0005>\u0000\u0000\u016f\u0172\u0003\u0016"+
		"\u000b\u0000\u0170\u0172\u0003.\u0017\u0000\u0171\u016e\u0001\u0000\u0000"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0007\u0001\u0000"+
		"\u0000\u0174\u0175\u0003>\u001f\u0000\u01751\u0001\u0000\u0000\u0000\u0176"+
		"\u017c\u0003\f\u0006\u0000\u0177\u017c\u0003\u0002\u0001\u0000\u0178\u017c"+
		"\u0003\u001c\u000e\u0000\u0179\u017c\u0003:\u001d\u0000\u017a\u017c\u0003"+
		"8\u001c\u0000\u017b\u0176\u0001\u0000\u0000\u0000\u017b\u0177\u0001\u0000"+
		"\u0000\u0000\u017b\u0178\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000"+
		"\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000"+
		"\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000"+
		"\u0000\u0000\u017e\u0183\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u0180\u0184\u0003\n\u0005\u0000\u0181\u0184\u00034\u001a"+
		"\u0000\u0182\u0184\u00036\u001b\u0000\u0183\u0180\u0001\u0000\u0000\u0000"+
		"\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u01843\u0001\u0000\u0000\u0000\u0185"+
		"\u0186\u0005\u0013\u0000\u0000\u0186\u0187\u0005<\u0000\u0000\u01875\u0001"+
		"\u0000\u0000\u0000\u0188\u0189\u0005\u0012\u0000\u0000\u0189\u018a\u0005"+
		"<\u0000\u0000\u018a7\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0012\u0000"+
		"\u0000\u018c\u018d\u0005\u0003\u0000\u0000\u018d\u018e\u0003\u001e\u000f"+
		"\u0000\u018e\u018f\u0005<\u0000\u0000\u018f9\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0005\u0013\u0000\u0000\u0191\u0192\u0005\u0003\u0000\u0000\u0192"+
		"\u0193\u0003\u001e\u000f\u0000\u0193\u0194\u0005<\u0000\u0000\u0194;\u0001"+
		"\u0000\u0000\u0000\u0195\u0196\u0005\u000e\u0000\u0000\u0196\u0197\u0005"+
		"\u001b\u0000\u0000\u0197\u0198\u0005;\u0000\u0000\u0198\u0199\u0005>\u0000"+
		"\u0000\u0199\u019a\u0005\u001c\u0000\u0000\u019a=\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0003@ \u0000\u019c?\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0003D\"\u0000\u019e\u019f\u0003B!\u0000\u019fA\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a1\u00055\u0000\u0000\u01a1\u01a2\u0003D\"\u0000\u01a2\u01a3"+
		"\u0003B!\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a0\u0001\u0000\u0000\u0000\u01a5\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6C\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\u001b\u0000"+
		"\u0000\u01a8\u01a9\u0003H$\u0000\u01a9\u01aa\u0005\u001c\u0000\u0000\u01aa"+
		"\u01ab\u0003F#\u0000\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01ae\u0003"+
		"H$\u0000\u01ad\u01a7\u0001\u0000\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000"+
		"\u0000\u01aeE\u0001\u0000\u0000\u0000\u01af\u01b0\u0005-\u0000\u0000\u01b0"+
		"\u01b1\u0005\u001b\u0000\u0000\u01b1\u01b2\u0003H$\u0000\u01b2\u01b3\u0005"+
		"\u001c\u0000\u0000\u01b3\u01b4\u0003F#\u0000\u01b4\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01af\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7G\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b9\u0005\u001b\u0000\u0000\u01b9\u01ba\u0003L&\u0000\u01ba\u01bb"+
		"\u0005\u001c\u0000\u0000\u01bb\u01bc\u0003J%\u0000\u01bc\u01bf\u0001\u0000"+
		"\u0000\u0000\u01bd\u01bf\u0003L&\u0000\u01be\u01b8\u0001\u0000\u0000\u0000"+
		"\u01be\u01bd\u0001\u0000\u0000\u0000\u01bfI\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0005,\u0000\u0000\u01c1\u01c2\u0003L&\u0000\u01c2\u01c3\u0003"+
		"J%\u0000\u01c3K\u0001\u0000\u0000\u0000\u01c4\u01c5\u0003P(\u0000\u01c5"+
		"\u01c6\u0003N\'\u0000\u01c6M\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005"+
		"*\u0000\u0000\u01c8\u01c9\u0003P(\u0000\u01c9\u01ca\u0003N\'\u0000\u01ca"+
		"\u01d1\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005+\u0000\u0000\u01cc\u01cd"+
		"\u0003P(\u0000\u01cd\u01ce\u0003N\'\u0000\u01ce\u01d1\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01c7\u0001\u0000\u0000"+
		"\u0000\u01d0\u01cb\u0001\u0000\u0000\u0000\u01d0\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d1O\u0001\u0000\u0000\u0000\u01d2\u01d3\u0003T*\u0000\u01d3"+
		"\u01d4\u0003R)\u0000\u01d4Q\u0001\u0000\u0000\u0000\u01d5\u01d6\u0005"+
		"(\u0000\u0000\u01d6\u01d7\u0003T*\u0000\u01d7\u01d8\u0003R)\u0000\u01d8"+
		"\u01e7\u0001\u0000\u0000\u0000\u01d9\u01da\u0005)\u0000\u0000\u01da\u01db"+
		"\u0003T*\u0000\u01db\u01dc\u0003R)\u0000\u01dc\u01e7\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0005&\u0000\u0000\u01de\u01df\u0003T*\u0000\u01df"+
		"\u01e0\u0003R)\u0000\u01e0\u01e7\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005"+
		"\'\u0000\u0000\u01e2\u01e3\u0003T*\u0000\u01e3\u01e4\u0003R)\u0000\u01e4"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6"+
		"\u01d5\u0001\u0000\u0000\u0000\u01e6\u01d9\u0001\u0000\u0000\u0000\u01e6"+
		"\u01dd\u0001\u0000\u0000\u0000\u01e6\u01e1\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7S\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0003X,\u0000\u01e9\u01ea\u0003V+\u0000\u01eaU\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0005\u001f\u0000\u0000\u01ec\u01ed\u0003X,\u0000\u01ed\u01ee"+
		"\u0003V+\u0000\u01ee\u01f5\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005 "+
		"\u0000\u0000\u01f0\u01f1\u0003X,\u0000\u01f1\u01f2\u0003V+\u0000\u01f2"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4"+
		"\u01eb\u0001\u0000\u0000\u0000\u01f4\u01ef\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f5W\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0003\\.\u0000\u01f7\u01f8\u0003Z-\u0000\u01f8Y\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0005!\u0000\u0000\u01fa\u01fb\u0003\\.\u0000\u01fb\u01fc"+
		"\u0003Z-\u0000\u01fc\u0207\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005\""+
		"\u0000\u0000\u01fe\u01ff\u0003\\.\u0000\u01ff\u0200\u0003Z-\u0000\u0200"+
		"\u0207\u0001\u0000\u0000\u0000\u0201\u0202\u0005#\u0000\u0000\u0202\u0203"+
		"\u0003\\.\u0000\u0203\u0204\u0003Z-\u0000\u0204\u0207\u0001\u0000\u0000"+
		"\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u01f9\u0001\u0000\u0000"+
		"\u0000\u0206\u01fd\u0001\u0000\u0000\u0000\u0206\u0201\u0001\u0000\u0000"+
		"\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207[\u0001\u0000\u0000\u0000"+
		"\u0208\u0209\u0005.\u0000\u0000\u0209\u020e\u0003^/\u0000\u020a\u020b"+
		"\u0005 \u0000\u0000\u020b\u020e\u0003^/\u0000\u020c\u020e\u0003^/\u0000"+
		"\u020d\u0208\u0001\u0000\u0000\u0000\u020d\u020a\u0001\u0000\u0000\u0000"+
		"\u020d\u020c\u0001\u0000\u0000\u0000\u020e]\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0005\u001b\u0000\u0000\u0210\u0211\u0003>\u001f\u0000\u0211\u0212"+
		"\u0005\u001c\u0000\u0000\u0212\u0221\u0001\u0000\u0000\u0000\u0213\u0221"+
		"\u0003\u0016\u000b\u0000\u0214\u0217\u0005>\u0000\u0000\u0215\u0217\u0003"+
		".\u0017\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0215\u0001\u0000"+
		"\u0000\u0000\u0217\u0219\u0001\u0000\u0000\u0000\u0218\u021a\u0007\u0002"+
		"\u0000\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000"+
		"\u0000\u0000\u021a\u0221\u0001\u0000\u0000\u0000\u021b\u0221\u0003`0\u0000"+
		"\u021c\u0221\u0003b1\u0000\u021d\u0221\u0003\u0014\n\u0000\u021e\u0221"+
		"\u0003d2\u0000\u021f\u0221\u0003<\u001e\u0000\u0220\u020f\u0001\u0000"+
		"\u0000\u0000\u0220\u0213\u0001\u0000\u0000\u0000\u0220\u0216\u0001\u0000"+
		"\u0000\u0000\u0220\u021b\u0001\u0000\u0000\u0000\u0220\u021c\u0001\u0000"+
		"\u0000\u0000\u0220\u021d\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000"+
		"\u0000\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0221_\u0001\u0000\u0000"+
		"\u0000\u0222\u0223\u0005>\u0000\u0000\u0223\u022c\u0005\u001b\u0000\u0000"+
		"\u0224\u0229\u0003>\u001f\u0000\u0225\u0226\u00058\u0000\u0000\u0226\u0228"+
		"\u0003>\u001f\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228\u022b\u0001"+
		"\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u022a\u0001"+
		"\u0000\u0000\u0000\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u0229\u0001"+
		"\u0000\u0000\u0000\u022c\u0224\u0001\u0000\u0000\u0000\u022c\u022d\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0005"+
		"\u001c\u0000\u0000\u022fa\u0001\u0000\u0000\u0000\u0230\u0236\u0003f3"+
		"\u0000\u0231\u0236\u0003h4\u0000\u0232\u0236\u0003j5\u0000\u0233\u0236"+
		"\u0003l6\u0000\u0234\u0236\u0003n7\u0000\u0235\u0230\u0001\u0000\u0000"+
		"\u0000\u0235\u0231\u0001\u0000\u0000\u0000\u0235\u0232\u0001\u0000\u0000"+
		"\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0234\u0001\u0000\u0000"+
		"\u0000\u0236c\u0001\u0000\u0000\u0000\u0237\u0238\u0005>\u0000\u0000\u0238"+
		"\u0239\u00059\u0000\u0000\u0239\u023a\u0005\u0011\u0000\u0000\u023a\u0243"+
		"\u0005\u001b\u0000\u0000\u023b\u0240\u0003>\u001f\u0000\u023c\u023d\u0005"+
		"8\u0000\u0000\u023d\u023f\u0003>\u001f\u0000\u023e\u023c\u0001\u0000\u0000"+
		"\u0000\u023f\u0242\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000\u0000"+
		"\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000\u0000"+
		"\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0243\u023b\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000"+
		"\u0000\u0245\u0246\u0005\u001c\u0000\u0000\u0246e\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0005\r\u0000\u0000\u0248\u0249\u0005\u001b\u0000\u0000\u0249"+
		"\u024a\u0003>\u001f\u0000\u024a\u024b\u0005\u001c\u0000\u0000\u024bg\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\u0005\n\u0000\u0000\u024d\u024e\u0005\u001b"+
		"\u0000\u0000\u024e\u024f\u0003>\u001f\u0000\u024f\u0250\u00058\u0000\u0000"+
		"\u0250\u0251\u0003>\u001f\u0000\u0251\u0252\u0005\u001c\u0000\u0000\u0252"+
		"i\u0001\u0000\u0000\u0000\u0253\u0254\u0005\u000f\u0000\u0000\u0254\u0255"+
		"\u0005\u001b\u0000\u0000\u0255\u0256\u0003>\u001f\u0000\u0256\u0257\u0005"+
		"\u001c\u0000\u0000\u0257k\u0001\u0000\u0000\u0000\u0258\u0259\u0005\b"+
		"\u0000\u0000\u0259\u025a\u0005\u001b\u0000\u0000\u025a\u025b\u0003>\u001f"+
		"\u0000\u025b\u025c\u0005\u001c\u0000\u0000\u025cm\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0005\t\u0000\u0000\u025e\u025f\u0005\u001b\u0000\u0000\u025f"+
		"\u0260\u0003>\u001f\u0000\u0260\u0261\u0005\u001c\u0000\u0000\u0261o\u0001"+
		"\u0000\u0000\u00003su|\u0090\u0093\u009d\u00a5\u00a7\u00ab\u00af\u00b5"+
		"\u00bb\u00c9\u00d4\u00dd\u00e0\u00f0\u00f8\u00fc\u0107\u0112\u0117\u0124"+
		"\u0129\u0135\u013e\u0146\u014f\u0163\u016c\u0171\u017b\u017d\u0183\u01a5"+
		"\u01ad\u01b6\u01be\u01d0\u01e6\u01f4\u0206\u020d\u0216\u0219\u0220\u0229"+
		"\u022c\u0235\u0240\u0243";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}