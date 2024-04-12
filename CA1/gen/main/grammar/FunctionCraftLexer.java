// Generated from C:/Users/ALI/OneDrive/Desktop/university/Project/Compiler/FunctionCraft-Compiler/CA1/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FunctionCraftLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"END", "DEF", "IF", "ELSE", "ELSEIF", "TRUE", "FALSE", "CHOP", "CHOMP", 
			"PUSH", "MAIN", "RETURN", "PUTS", "METHOD", "LEN", "PATTERN", "MATCH", 
			"NEXT", "BREAK", "LOOP", "DO", "FOR", "IN", "INT_VAL", "FLOAT_VAL", "STRING_VAL", 
			"LPAR", "RPAR", "LBRACKET", "RBRACKET", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "INC", "DEC", "GEQ", "LEQ", "GTR", "LES", "EQL", "NEQ", "AND", 
			"OR", "NOT", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"MOD_ASSIGN", "APPEND", "LBRACE", "RBRACE", "COMMA", "DOT", "DOUBLEDOT", 
			"COLON", "SEMICOLON", "QUESTION", "IDENTIFIER", "ARROW", "PATTERN_TOKEN", 
			"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS"
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


	public FunctionCraftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000C\u01bc\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0100\b\u0017\n\u0017\f\u0017\u0103\t\u0017\u0001\u0017"+
		"\u0003\u0017\u0106\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018"+
		"\u010b\b\u0018\u000b\u0018\f\u0018\u010c\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0113\b\u0018\n\u0018\f\u0018\u0116\t\u0018"+
		"\u0003\u0018\u0118\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u011e\b\u0019\n\u0019\f\u0019\u0121\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00011\u00011\u00011\u00012\u0001"+
		"2\u00012\u00013\u00013\u00013\u00014\u00014\u00014\u00015\u00015\u0001"+
		"6\u00016\u00017\u00017\u00018\u00018\u00019\u00019\u00019\u0001:\u0001"+
		":\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0005=\u017c\b=\n=\f=\u017f"+
		"\t=\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0003?\u018b\b?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003"+
		"?\u0194\b?\u0001?\u0003?\u0197\b?\u0001@\u0001@\u0005@\u019b\b@\n@\f@"+
		"\u019e\t@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0005A\u01aa\bA\nA\fA\u01ad\tA\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001B\u0004B\u01b7\bB\u000bB\fB\u01b8\u0001B\u0001B\u0001"+
		"\u01ab\u0000C\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f"+
		"@\u0081A\u0083B\u0085C\u0001\u0000\f\u0001\u000019\u0001\u000009\u0001"+
		"\u000000\u0002\u0000\"\"\\\\\u0004\u0000\n\n\r\r\"\"\\\\\u0003\u0000A"+
		"Z__az\u0004\u000009AZ__az\u0001\u0000\r\r\u0001\u0000\n\n\u0001\u0000"+
		"\t\t\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u01c9\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q"+
		"\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000"+
		"\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000"+
		"\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_"+
		"\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000"+
		"\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000"+
		"\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m"+
		"\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000"+
		"\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000"+
		"\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{"+
		"\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000\u0000\u007f\u0001"+
		"\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000\u0000\u0083\u0001"+
		"\u0000\u0000\u0000\u0000\u0085\u0001\u0000\u0000\u0000\u0001\u0087\u0001"+
		"\u0000\u0000\u0000\u0003\u008b\u0001\u0000\u0000\u0000\u0005\u008f\u0001"+
		"\u0000\u0000\u0000\u0007\u0092\u0001\u0000\u0000\u0000\t\u0097\u0001\u0000"+
		"\u0000\u0000\u000b\u009e\u0001\u0000\u0000\u0000\r\u00a3\u0001\u0000\u0000"+
		"\u0000\u000f\u00a9\u0001\u0000\u0000\u0000\u0011\u00ae\u0001\u0000\u0000"+
		"\u0000\u0013\u00b4\u0001\u0000\u0000\u0000\u0015\u00b9\u0001\u0000\u0000"+
		"\u0000\u0017\u00be\u0001\u0000\u0000\u0000\u0019\u00c5\u0001\u0000\u0000"+
		"\u0000\u001b\u00ca\u0001\u0000\u0000\u0000\u001d\u00d1\u0001\u0000\u0000"+
		"\u0000\u001f\u00d5\u0001\u0000\u0000\u0000!\u00dd\u0001\u0000\u0000\u0000"+
		"#\u00e3\u0001\u0000\u0000\u0000%\u00e8\u0001\u0000\u0000\u0000\'\u00ee"+
		"\u0001\u0000\u0000\u0000)\u00f3\u0001\u0000\u0000\u0000+\u00f6\u0001\u0000"+
		"\u0000\u0000-\u00fa\u0001\u0000\u0000\u0000/\u0105\u0001\u0000\u0000\u0000"+
		"1\u0117\u0001\u0000\u0000\u00003\u0119\u0001\u0000\u0000\u00005\u0124"+
		"\u0001\u0000\u0000\u00007\u0126\u0001\u0000\u0000\u00009\u0128\u0001\u0000"+
		"\u0000\u0000;\u012a\u0001\u0000\u0000\u0000=\u012c\u0001\u0000\u0000\u0000"+
		"?\u012e\u0001\u0000\u0000\u0000A\u0130\u0001\u0000\u0000\u0000C\u0132"+
		"\u0001\u0000\u0000\u0000E\u0134\u0001\u0000\u0000\u0000G\u0136\u0001\u0000"+
		"\u0000\u0000I\u0139\u0001\u0000\u0000\u0000K\u013c\u0001\u0000\u0000\u0000"+
		"M\u013f\u0001\u0000\u0000\u0000O\u0142\u0001\u0000\u0000\u0000Q\u0144"+
		"\u0001\u0000\u0000\u0000S\u0146\u0001\u0000\u0000\u0000U\u0149\u0001\u0000"+
		"\u0000\u0000W\u014c\u0001\u0000\u0000\u0000Y\u014f\u0001\u0000\u0000\u0000"+
		"[\u0152\u0001\u0000\u0000\u0000]\u0154\u0001\u0000\u0000\u0000_\u0156"+
		"\u0001\u0000\u0000\u0000a\u0159\u0001\u0000\u0000\u0000c\u015c\u0001\u0000"+
		"\u0000\u0000e\u015f\u0001\u0000\u0000\u0000g\u0162\u0001\u0000\u0000\u0000"+
		"i\u0165\u0001\u0000\u0000\u0000k\u0168\u0001\u0000\u0000\u0000m\u016a"+
		"\u0001\u0000\u0000\u0000o\u016c\u0001\u0000\u0000\u0000q\u016e\u0001\u0000"+
		"\u0000\u0000s\u0170\u0001\u0000\u0000\u0000u\u0173\u0001\u0000\u0000\u0000"+
		"w\u0175\u0001\u0000\u0000\u0000y\u0177\u0001\u0000\u0000\u0000{\u0179"+
		"\u0001\u0000\u0000\u0000}\u0180\u0001\u0000\u0000\u0000\u007f\u0196\u0001"+
		"\u0000\u0000\u0000\u0081\u0198\u0001\u0000\u0000\u0000\u0083\u01a1\u0001"+
		"\u0000\u0000\u0000\u0085\u01b6\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"e\u0000\u0000\u0088\u0089\u0005n\u0000\u0000\u0089\u008a\u0005d\u0000"+
		"\u0000\u008a\u0002\u0001\u0000\u0000\u0000\u008b\u008c\u0005d\u0000\u0000"+
		"\u008c\u008d\u0005e\u0000\u0000\u008d\u008e\u0005f\u0000\u0000\u008e\u0004"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005i\u0000\u0000\u0090\u0091\u0005"+
		"f\u0000\u0000\u0091\u0006\u0001\u0000\u0000\u0000\u0092\u0093\u0005e\u0000"+
		"\u0000\u0093\u0094\u0005l\u0000\u0000\u0094\u0095\u0005s\u0000\u0000\u0095"+
		"\u0096\u0005e\u0000\u0000\u0096\b\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005e\u0000\u0000\u0098\u0099\u0005l\u0000\u0000\u0099\u009a\u0005s"+
		"\u0000\u0000\u009a\u009b\u0005e\u0000\u0000\u009b\u009c\u0005i\u0000\u0000"+
		"\u009c\u009d\u0005f\u0000\u0000\u009d\n\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005t\u0000\u0000\u009f\u00a0\u0005r\u0000\u0000\u00a0\u00a1\u0005"+
		"u\u0000\u0000\u00a1\u00a2\u0005e\u0000\u0000\u00a2\f\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005f\u0000\u0000\u00a4\u00a5\u0005a\u0000\u0000\u00a5"+
		"\u00a6\u0005l\u0000\u0000\u00a6\u00a7\u0005s\u0000\u0000\u00a7\u00a8\u0005"+
		"e\u0000\u0000\u00a8\u000e\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005c\u0000"+
		"\u0000\u00aa\u00ab\u0005h\u0000\u0000\u00ab\u00ac\u0005o\u0000\u0000\u00ac"+
		"\u00ad\u0005p\u0000\u0000\u00ad\u0010\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005c\u0000\u0000\u00af\u00b0\u0005h\u0000\u0000\u00b0\u00b1\u0005o"+
		"\u0000\u0000\u00b1\u00b2\u0005m\u0000\u0000\u00b2\u00b3\u0005p\u0000\u0000"+
		"\u00b3\u0012\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005p\u0000\u0000\u00b5"+
		"\u00b6\u0005u\u0000\u0000\u00b6\u00b7\u0005s\u0000\u0000\u00b7\u00b8\u0005"+
		"h\u0000\u0000\u00b8\u0014\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005m\u0000"+
		"\u0000\u00ba\u00bb\u0005a\u0000\u0000\u00bb\u00bc\u0005i\u0000\u0000\u00bc"+
		"\u00bd\u0005n\u0000\u0000\u00bd\u0016\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005r\u0000\u0000\u00bf\u00c0\u0005e\u0000\u0000\u00c0\u00c1\u0005t"+
		"\u0000\u0000\u00c1\u00c2\u0005u\u0000\u0000\u00c2\u00c3\u0005r\u0000\u0000"+
		"\u00c3\u00c4\u0005n\u0000\u0000\u00c4\u0018\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0005p\u0000\u0000\u00c6\u00c7\u0005u\u0000\u0000\u00c7\u00c8\u0005"+
		"t\u0000\u0000\u00c8\u00c9\u0005s\u0000\u0000\u00c9\u001a\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005m\u0000\u0000\u00cb\u00cc\u0005e\u0000\u0000\u00cc"+
		"\u00cd\u0005t\u0000\u0000\u00cd\u00ce\u0005h\u0000\u0000\u00ce\u00cf\u0005"+
		"o\u0000\u0000\u00cf\u00d0\u0005d\u0000\u0000\u00d0\u001c\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005l\u0000\u0000\u00d2\u00d3\u0005e\u0000\u0000\u00d3"+
		"\u00d4\u0005n\u0000\u0000\u00d4\u001e\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005p\u0000\u0000\u00d6\u00d7\u0005a\u0000\u0000\u00d7\u00d8\u0005t"+
		"\u0000\u0000\u00d8\u00d9\u0005t\u0000\u0000\u00d9\u00da\u0005e\u0000\u0000"+
		"\u00da\u00db\u0005r\u0000\u0000\u00db\u00dc\u0005n\u0000\u0000\u00dc "+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0005m\u0000\u0000\u00de\u00df\u0005"+
		"a\u0000\u0000\u00df\u00e0\u0005t\u0000\u0000\u00e0\u00e1\u0005c\u0000"+
		"\u0000\u00e1\u00e2\u0005h\u0000\u0000\u00e2\"\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005n\u0000\u0000\u00e4\u00e5\u0005e\u0000\u0000\u00e5\u00e6"+
		"\u0005x\u0000\u0000\u00e6\u00e7\u0005t\u0000\u0000\u00e7$\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005b\u0000\u0000\u00e9\u00ea\u0005r\u0000\u0000"+
		"\u00ea\u00eb\u0005e\u0000\u0000\u00eb\u00ec\u0005a\u0000\u0000\u00ec\u00ed"+
		"\u0005k\u0000\u0000\u00ed&\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005l"+
		"\u0000\u0000\u00ef\u00f0\u0005o\u0000\u0000\u00f0\u00f1\u0005o\u0000\u0000"+
		"\u00f1\u00f2\u0005p\u0000\u0000\u00f2(\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0005d\u0000\u0000\u00f4\u00f5\u0005o\u0000\u0000\u00f5*\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005f\u0000\u0000\u00f7\u00f8\u0005o\u0000\u0000"+
		"\u00f8\u00f9\u0005r\u0000\u0000\u00f9,\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0005i\u0000\u0000\u00fb\u00fc\u0005n\u0000\u0000\u00fc.\u0001\u0000"+
		"\u0000\u0000\u00fd\u0101\u0007\u0000\u0000\u0000\u00fe\u0100\u0007\u0001"+
		"\u0000\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0106\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104\u0106\u0007\u0002\u0000\u0000\u0105\u00fd\u0001\u0000"+
		"\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u01060\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0003/\u0017\u0000\u0108\u010a\u0005.\u0000\u0000\u0109"+
		"\u010b\u0007\u0001\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u0118\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u00050\u0000\u0000\u010f\u0110\u0005.\u0000\u0000\u0110\u0114\u0001"+
		"\u0000\u0000\u0000\u0111\u0113\u0007\u0001\u0000\u0000\u0112\u0111\u0001"+
		"\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0118\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0107\u0001"+
		"\u0000\u0000\u0000\u0117\u010e\u0001\u0000\u0000\u0000\u01182\u0001\u0000"+
		"\u0000\u0000\u0119\u011f\u0005\"\u0000\u0000\u011a\u011b\u0005\\\u0000"+
		"\u0000\u011b\u011e\u0007\u0003\u0000\u0000\u011c\u011e\b\u0004\u0000\u0000"+
		"\u011d\u011a\u0001\u0000\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000"+
		"\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0123\u0005\"\u0000\u0000\u0123"+
		"4\u0001\u0000\u0000\u0000\u0124\u0125\u0005(\u0000\u0000\u01256\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005)\u0000\u0000\u01278\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0005[\u0000\u0000\u0129:\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0005]\u0000\u0000\u012b<\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"+\u0000\u0000\u012d>\u0001\u0000\u0000\u0000\u012e\u012f\u0005-\u0000"+
		"\u0000\u012f@\u0001\u0000\u0000\u0000\u0130\u0131\u0005*\u0000\u0000\u0131"+
		"B\u0001\u0000\u0000\u0000\u0132\u0133\u0005/\u0000\u0000\u0133D\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005%\u0000\u0000\u0135F\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0005+\u0000\u0000\u0137\u0138\u0005+\u0000\u0000\u0138"+
		"H\u0001\u0000\u0000\u0000\u0139\u013a\u0005-\u0000\u0000\u013a\u013b\u0005"+
		"-\u0000\u0000\u013bJ\u0001\u0000\u0000\u0000\u013c\u013d\u0005>\u0000"+
		"\u0000\u013d\u013e\u0005=\u0000\u0000\u013eL\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0005<\u0000\u0000\u0140\u0141\u0005=\u0000\u0000\u0141N\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0005>\u0000\u0000\u0143P\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005<\u0000\u0000\u0145R\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0005=\u0000\u0000\u0147\u0148\u0005=\u0000\u0000\u0148T\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0005!\u0000\u0000\u014a\u014b\u0005=\u0000"+
		"\u0000\u014bV\u0001\u0000\u0000\u0000\u014c\u014d\u0005&\u0000\u0000\u014d"+
		"\u014e\u0005&\u0000\u0000\u014eX\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"|\u0000\u0000\u0150\u0151\u0005|\u0000\u0000\u0151Z\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0005!\u0000\u0000\u0153\\\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u0005=\u0000\u0000\u0155^\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0005+\u0000\u0000\u0157\u0158\u0005=\u0000\u0000\u0158`\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0005-\u0000\u0000\u015a\u015b\u0005=\u0000\u0000"+
		"\u015bb\u0001\u0000\u0000\u0000\u015c\u015d\u0005*\u0000\u0000\u015d\u015e"+
		"\u0005=\u0000\u0000\u015ed\u0001\u0000\u0000\u0000\u015f\u0160\u0005/"+
		"\u0000\u0000\u0160\u0161\u0005=\u0000\u0000\u0161f\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0005%\u0000\u0000\u0163\u0164\u0005=\u0000\u0000\u0164h"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0005<\u0000\u0000\u0166\u0167\u0005"+
		"<\u0000\u0000\u0167j\u0001\u0000\u0000\u0000\u0168\u0169\u0005{\u0000"+
		"\u0000\u0169l\u0001\u0000\u0000\u0000\u016a\u016b\u0005}\u0000\u0000\u016b"+
		"n\u0001\u0000\u0000\u0000\u016c\u016d\u0005,\u0000\u0000\u016dp\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005.\u0000\u0000\u016fr\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0005.\u0000\u0000\u0171\u0172\u0005.\u0000\u0000\u0172"+
		"t\u0001\u0000\u0000\u0000\u0173\u0174\u0005:\u0000\u0000\u0174v\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\u0005;\u0000\u0000\u0176x\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0005?\u0000\u0000\u0178z\u0001\u0000\u0000\u0000\u0179"+
		"\u017d\u0007\u0005\u0000\u0000\u017a\u017c\u0007\u0006\u0000\u0000\u017b"+
		"\u017a\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000\u0000\u017d"+
		"\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"|\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0005-\u0000\u0000\u0181\u0182\u0005>\u0000\u0000\u0182~\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0007\u0007\u0000\u0000\u0184\u018a\u0007\b\u0000"+
		"\u0000\u0185\u018b\u0007\t\u0000\u0000\u0186\u0187\u0005 \u0000\u0000"+
		"\u0187\u0188\u0005 \u0000\u0000\u0188\u0189\u0005 \u0000\u0000\u0189\u018b"+
		"\u0005 \u0000\u0000\u018a\u0185\u0001\u0000\u0000\u0000\u018a\u0186\u0001"+
		"\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u0197\u0005"+
		"|\u0000\u0000\u018d\u0193\u0007\b\u0000\u0000\u018e\u0194\u0007\t\u0000"+
		"\u0000\u018f\u0190\u0005 \u0000\u0000\u0190\u0191\u0005 \u0000\u0000\u0191"+
		"\u0192\u0005 \u0000\u0000\u0192\u0194\u0005 \u0000\u0000\u0193\u018e\u0001"+
		"\u0000\u0000\u0000\u0193\u018f\u0001\u0000\u0000\u0000\u0194\u0195\u0001"+
		"\u0000\u0000\u0000\u0195\u0197\u0005|\u0000\u0000\u0196\u0183\u0001\u0000"+
		"\u0000\u0000\u0196\u018d\u0001\u0000\u0000\u0000\u0197\u0080\u0001\u0000"+
		"\u0000\u0000\u0198\u019c\u0005#\u0000\u0000\u0199\u019b\b\n\u0000\u0000"+
		"\u019a\u0199\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000"+
		"\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000"+
		"\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0006@\u0000\u0000\u01a0\u0082\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0005=\u0000\u0000\u01a2\u01a3\u0005b\u0000\u0000\u01a3\u01a4\u0005"+
		"e\u0000\u0000\u01a4\u01a5\u0005g\u0000\u0000\u01a5\u01a6\u0005i\u0000"+
		"\u0000\u01a6\u01a7\u0005n\u0000\u0000\u01a7\u01ab\u0001\u0000\u0000\u0000"+
		"\u01a8\u01aa\t\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ab"+
		"\u01a9\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af\u0005=\u0000\u0000\u01af\u01b0"+
		"\u0005e\u0000\u0000\u01b0\u01b1\u0005n\u0000\u0000\u01b1\u01b2\u0005d"+
		"\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0006A\u0000"+
		"\u0000\u01b4\u0084\u0001\u0000\u0000\u0000\u01b5\u01b7\u0007\u000b\u0000"+
		"\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb\u0006B\u0000\u0000"+
		"\u01bb\u0086\u0001\u0000\u0000\u0000\u000f\u0000\u0101\u0105\u010c\u0114"+
		"\u0117\u011d\u011f\u017d\u018a\u0193\u0196\u019c\u01ab\u01b8\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}