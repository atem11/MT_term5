// Generated from Grammarv2.g4 by ANTLR 4.7.1

package Lab4.grammar.parser.output;
import Lab4.grammar.Grammar;
import Lab4.grammar.rules.*;
import Lab4.grammar.term.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Grammarv2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, TERM_NAME=14, NONTERM_NAME=15, 
		STRING=16, CODE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "TERM_NAME", "NONTERM_NAME", "STRING", 
		"CODE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'grammar'", "';'", "':'", "'WS'", "'->'", "'|'", "'Eps'", "'('", 
		"','", "')'", "'returns'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "TERM_NAME", "NONTERM_NAME", "STRING", "CODE", "WS"
	};
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


	public Grammarv2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammarv2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17T\n\17\f\17\16"+
		"\17W\13\17\3\20\3\20\7\20[\n\20\f\20\16\20^\13\20\3\21\3\21\7\21b\n\21"+
		"\f\21\16\21e\13\21\3\21\3\21\3\22\3\22\6\22k\n\22\r\22\16\22l\3\22\5\22"+
		"p\n\22\7\22r\n\22\f\22\16\22u\13\22\3\22\3\22\3\23\3\23\3\23\3\23\2\2"+
		"\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\3\2\6\6\2\62;C\\aac|\3\2$$\4\2}}\177\177\5\2\13"+
		"\f\17\17\"\"\2\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5/\3\2\2\2\7\61\3\2\2"+
		"\2\t\63\3\2\2\2\13\66\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21?\3\2\2\2\23A\3"+
		"\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31M\3\2\2\2\33O\3\2\2\2\35Q\3\2\2\2\37"+
		"X\3\2\2\2!_\3\2\2\2#h\3\2\2\2%x\3\2\2\2\'(\7i\2\2()\7t\2\2)*\7c\2\2*+"+
		"\7o\2\2+,\7o\2\2,-\7c\2\2-.\7t\2\2.\4\3\2\2\2/\60\7=\2\2\60\6\3\2\2\2"+
		"\61\62\7<\2\2\62\b\3\2\2\2\63\64\7Y\2\2\64\65\7U\2\2\65\n\3\2\2\2\66\67"+
		"\7/\2\2\678\7@\2\28\f\3\2\2\29:\7~\2\2:\16\3\2\2\2;<\7G\2\2<=\7r\2\2="+
		">\7u\2\2>\20\3\2\2\2?@\7*\2\2@\22\3\2\2\2AB\7.\2\2B\24\3\2\2\2CD\7+\2"+
		"\2D\26\3\2\2\2EF\7t\2\2FG\7g\2\2GH\7v\2\2HI\7w\2\2IJ\7t\2\2JK\7p\2\2K"+
		"L\7u\2\2L\30\3\2\2\2MN\7]\2\2N\32\3\2\2\2OP\7_\2\2P\34\3\2\2\2QU\4C\\"+
		"\2RT\t\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\36\3\2\2\2WU\3\2"+
		"\2\2X\\\4c|\2Y[\t\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2] \3"+
		"\2\2\2^\\\3\2\2\2_c\7$\2\2`b\n\3\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2df\3\2\2\2ec\3\2\2\2fg\7$\2\2g\"\3\2\2\2hs\7}\2\2ik\n\4\2\2ji\3"+
		"\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\5#\22\2on\3\2\2\2op\3"+
		"\2\2\2pr\3\2\2\2qj\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3"+
		"\2\2\2vw\7\177\2\2w$\3\2\2\2xy\t\5\2\2yz\3\2\2\2z{\b\23\2\2{&\3\2\2\2"+
		"\t\2U\\clos\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}