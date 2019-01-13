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
		T__9=10, T__10=11, T__11=12, TERM_NAME=13, NONTERM_NAME=14, STRING=15, 
		CODE=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "TERM_NAME", "NONTERM_NAME", "STRING", "CODE", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'grammar'", "';'", "':'", "'WS'", "'->'", "'|'", "'('", "','", 
		"')'", "'returns'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "TERM_NAME", "NONTERM_NAME", "STRING", "CODE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16N\n\16\f\16\16\16Q\13\16\3\17\3\17"+
		"\7\17U\n\17\f\17\16\17X\13\17\3\20\3\20\7\20\\\n\20\f\20\16\20_\13\20"+
		"\3\20\3\20\3\21\3\21\6\21e\n\21\r\21\16\21f\3\21\5\21j\n\21\7\21l\n\21"+
		"\f\21\16\21o\13\21\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"\3\2\6\6\2\62;C\\aac|\3\2$$\4\2}}\177\177\5\2\13\f\17\17\"\"\2{\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3"+
		"%\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\64\3\2\2\2\r\67\3\2\2"+
		"\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27G\3\2\2\2\31I\3\2"+
		"\2\2\33K\3\2\2\2\35R\3\2\2\2\37Y\3\2\2\2!b\3\2\2\2#r\3\2\2\2%&\7i\2\2"+
		"&\'\7t\2\2\'(\7c\2\2()\7o\2\2)*\7o\2\2*+\7c\2\2+,\7t\2\2,\4\3\2\2\2-."+
		"\7=\2\2.\6\3\2\2\2/\60\7<\2\2\60\b\3\2\2\2\61\62\7Y\2\2\62\63\7U\2\2\63"+
		"\n\3\2\2\2\64\65\7/\2\2\65\66\7@\2\2\66\f\3\2\2\2\678\7~\2\28\16\3\2\2"+
		"\29:\7*\2\2:\20\3\2\2\2;<\7.\2\2<\22\3\2\2\2=>\7+\2\2>\24\3\2\2\2?@\7"+
		"t\2\2@A\7g\2\2AB\7v\2\2BC\7w\2\2CD\7t\2\2DE\7p\2\2EF\7u\2\2F\26\3\2\2"+
		"\2GH\7]\2\2H\30\3\2\2\2IJ\7_\2\2J\32\3\2\2\2KO\4C\\\2LN\t\2\2\2ML\3\2"+
		"\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\34\3\2\2\2QO\3\2\2\2RV\4c|\2SU\t\2"+
		"\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\36\3\2\2\2XV\3\2\2\2Y]\7"+
		"$\2\2Z\\\n\3\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]"+
		"\3\2\2\2`a\7$\2\2a \3\2\2\2bm\7}\2\2ce\n\4\2\2dc\3\2\2\2ef\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2gi\3\2\2\2hj\5!\21\2ih\3\2\2\2ij\3\2\2\2jl\3\2\2\2kd\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\177\2\2q"+
		"\"\3\2\2\2rs\t\5\2\2st\3\2\2\2tu\b\22\2\2u$\3\2\2\2\t\2OV]fim\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}