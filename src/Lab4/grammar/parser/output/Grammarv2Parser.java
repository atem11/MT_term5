// Generated from Grammarv2.g4 by ANTLR 4.7.1

package Lab4.grammar.parser.output;
import Lab4.grammar.Grammar;
import Lab4.grammar.rules.*;
import Lab4.grammar.term.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Grammarv2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, TERM_NAME=15, NONTERM_NAME=16, 
		STRING=17, CODE=18, WS=19;
	public static final int
		RULE_start = 0, RULE_imports = 1, RULE_rules = 2, RULE_nonterm_rule = 3, 
		RULE_pattern = 4, RULE_one_pat = 5, RULE_param = 6, RULE_args = 7, RULE_arg = 8, 
		RULE_type = 9, RULE_ret_arg = 10;
	public static final String[] ruleNames = {
		"start", "imports", "rules", "nonterm_rule", "pattern", "one_pat", "param", 
		"args", "arg", "type", "ret_arg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'grammar'", "';'", "'@import'", "':'", "'WS'", "'->'", "'|'", "'Eps'", 
		"'('", "','", "')'", "'returns'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "TERM_NAME", "NONTERM_NAME", "STRING", "CODE", "WS"
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

	@Override
	public String getGrammarFileName() { return "Grammarv2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Grammarv2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Grammar g;
		public Token NONTERM_NAME;
		public ImportsContext imports;
		public TerminalNode NONTERM_NAME() { return getToken(Grammarv2Parser.NONTERM_NAME, 0); }
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(T__0);
			setState(23);
			((StartContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
			 ((StartContext)_localctx).g =  new Grammar((((StartContext)_localctx).NONTERM_NAME!=null?((StartContext)_localctx).NONTERM_NAME.getText():null)); 
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(25);
				((StartContext)_localctx).imports = imports();
				}
				break;
			}
			 _localctx.g.addImports(((StartContext)_localctx).imports.imp); 
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				rules(_localctx.g);
				setState(30);
				match(T__1);
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << TERM_NAME) | (1L << NONTERM_NAME))) != 0) );
			  
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

	public static class ImportsContext extends ParserRuleContext {
		public String imp;
		public Token CODE;
		public TerminalNode CODE() { return getToken(Grammarv2Parser.CODE, 0); }
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitImports(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(T__2);
				setState(39);
				((ImportsContext)_localctx).CODE = match(CODE);
				 ((ImportsContext)_localctx).imp =  (((ImportsContext)_localctx).CODE!=null?((ImportsContext)_localctx).CODE.getText():null); 
				}
				break;
			case T__4:
			case TERM_NAME:
			case NONTERM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				 ((ImportsContext)_localctx).imp =  null; 
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

	public static class RulesContext extends ParserRuleContext {
		public Grammar g;
		public Token TERM_NAME;
		public Token STRING;
		public Nonterm_ruleContext nonterm_rule;
		public TerminalNode TERM_NAME() { return getToken(Grammarv2Parser.TERM_NAME, 0); }
		public TerminalNode STRING() { return getToken(Grammarv2Parser.STRING, 0); }
		public Nonterm_ruleContext nonterm_rule() {
			return getRuleContext(Nonterm_ruleContext.class,0);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RulesContext(ParserRuleContext parent, int invokingState, Grammar g) {
			super(parent, invokingState);
			this.g = g;
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitRules(this);
		}
	}

	public final RulesContext rules(Grammar g) throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState(), g);
		enterRule(_localctx, 4, RULE_rules);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				((RulesContext)_localctx).TERM_NAME = match(TERM_NAME);
				setState(45);
				match(T__3);
				setState(46);
				((RulesContext)_localctx).STRING = match(STRING);
				 _localctx.g.addTerm(new Term((((RulesContext)_localctx).TERM_NAME!=null?((RulesContext)_localctx).TERM_NAME.getText():null), (((RulesContext)_localctx).STRING!=null?((RulesContext)_localctx).STRING.getText():null))); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(T__4);
				setState(49);
				match(T__5);
				setState(50);
				((RulesContext)_localctx).STRING = match(STRING);
				 _localctx.g.addWS((((RulesContext)_localctx).STRING!=null?((RulesContext)_localctx).STRING.getText():null)); 
				}
				break;
			case NONTERM_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				((RulesContext)_localctx).nonterm_rule = nonterm_rule();
				 _localctx.g.addNonTerm(((RulesContext)_localctx).nonterm_rule.t); 
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

	public static class Nonterm_ruleContext extends ParserRuleContext {
		public NonTerm t;
		public Token NONTERM_NAME;
		public ArgsContext args;
		public Ret_argContext ret_arg;
		public PatternContext pattern;
		public TerminalNode NONTERM_NAME() { return getToken(Grammarv2Parser.NONTERM_NAME, 0); }
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Ret_argContext ret_arg() {
			return getRuleContext(Ret_argContext.class,0);
		}
		public Nonterm_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonterm_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterNonterm_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitNonterm_rule(this);
		}
	}

	public final Nonterm_ruleContext nonterm_rule() throws RecognitionException {
		Nonterm_ruleContext _localctx = new Nonterm_ruleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nonterm_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((Nonterm_ruleContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
			 ((Nonterm_ruleContext)_localctx).t =  new NonTerm((((Nonterm_ruleContext)_localctx).NONTERM_NAME!=null?((Nonterm_ruleContext)_localctx).NONTERM_NAME.getText():null)); 
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(59);
				((Nonterm_ruleContext)_localctx).args = args();
				}
				break;
			}
			 _localctx.t.addArgs(((Nonterm_ruleContext)_localctx).args.a); 
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(63);
				((Nonterm_ruleContext)_localctx).ret_arg = ret_arg();
				}
				break;
			}
			 _localctx.t.addRetArgs(((Nonterm_ruleContext)_localctx).ret_arg.a); 
			setState(67);
			match(T__3);
			setState(68);
			((Nonterm_ruleContext)_localctx).pattern = pattern();
			 _localctx.t.addRule(((Nonterm_ruleContext)_localctx).pattern.r); 
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(70);
				match(T__6);
				setState(71);
				((Nonterm_ruleContext)_localctx).pattern = pattern();
				 _localctx.t.addRule(((Nonterm_ruleContext)_localctx).pattern.r); 
				}
				}
				setState(78);
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

	public static class PatternContext extends ParserRuleContext {
		public Rule r;
		public One_patContext one_pat;
		public Token CODE;
		public List<One_patContext> one_pat() {
			return getRuleContexts(One_patContext.class);
		}
		public One_patContext one_pat(int i) {
			return getRuleContext(One_patContext.class,i);
		}
		public TerminalNode CODE() { return getToken(Grammarv2Parser.CODE, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pattern);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM_NAME:
			case NONTERM_NAME:
			case CODE:
				enterOuterAlt(_localctx, 1);
				{
				 ((PatternContext)_localctx).r =  new Rule(); 
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					((PatternContext)_localctx).one_pat = one_pat();
					 _localctx.r.addTerm(((PatternContext)_localctx).one_pat.t); 
					}
					}
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TERM_NAME) | (1L << NONTERM_NAME) | (1L << CODE))) != 0) );
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				 ((PatternContext)_localctx).r =  new Rule(); 
				setState(88);
				match(T__7);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(89);
					((PatternContext)_localctx).CODE = match(CODE);
					 _localctx.r.addTerm(new Code((((PatternContext)_localctx).CODE!=null?((PatternContext)_localctx).CODE.getText():null))); 
					}
				}

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

	public static class One_patContext extends ParserRuleContext {
		public ObjTerm t;
		public Token TERM_NAME;
		public Token NONTERM_NAME;
		public ParamContext param;
		public Token CODE;
		public TerminalNode TERM_NAME() { return getToken(Grammarv2Parser.TERM_NAME, 0); }
		public TerminalNode NONTERM_NAME() { return getToken(Grammarv2Parser.NONTERM_NAME, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode CODE() { return getToken(Grammarv2Parser.CODE, 0); }
		public One_patContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterOne_pat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitOne_pat(this);
		}
	}

	public final One_patContext one_pat() throws RecognitionException {
		One_patContext _localctx = new One_patContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_one_pat);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				((One_patContext)_localctx).TERM_NAME = match(TERM_NAME);
				 ((One_patContext)_localctx).t =  new Term((((One_patContext)_localctx).TERM_NAME!=null?((One_patContext)_localctx).TERM_NAME.getText():null)); 
				}
				break;
			case NONTERM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				((One_patContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
				 NonTerm nt = new NonTerm((((One_patContext)_localctx).NONTERM_NAME!=null?((One_patContext)_localctx).NONTERM_NAME.getText():null)); 
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(99);
					match(T__8);
					setState(100);
					((One_patContext)_localctx).param = param();
					 nt.addParameter(((One_patContext)_localctx).param.s); 
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(102);
						match(T__9);
						setState(103);
						((One_patContext)_localctx).param = param();
						 nt.addParameter(((One_patContext)_localctx).param.s); 
						}
						}
						setState(110);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(111);
					match(T__10);
					}
				}

				 ((One_patContext)_localctx).t =  nt; 
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				((One_patContext)_localctx).CODE = match(CODE);
				 ((One_patContext)_localctx).t =  new Code((((One_patContext)_localctx).CODE!=null?((One_patContext)_localctx).CODE.getText():null)); 
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

	public static class ParamContext extends ParserRuleContext {
		public String s;
		public Token NONTERM_NAME;
		public Token TERM_NAME;
		public Token CODE;
		public TerminalNode NONTERM_NAME() { return getToken(Grammarv2Parser.NONTERM_NAME, 0); }
		public TerminalNode TERM_NAME() { return getToken(Grammarv2Parser.TERM_NAME, 0); }
		public TerminalNode CODE() { return getToken(Grammarv2Parser.CODE, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONTERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((ParamContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
				 ((ParamContext)_localctx).s =  (((ParamContext)_localctx).NONTERM_NAME!=null?((ParamContext)_localctx).NONTERM_NAME.getText():null); 
				}
				break;
			case TERM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				((ParamContext)_localctx).TERM_NAME = match(TERM_NAME);
				 ((ParamContext)_localctx).s =  (((ParamContext)_localctx).TERM_NAME!=null?((ParamContext)_localctx).TERM_NAME.getText():null); 
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				((ParamContext)_localctx).CODE = match(CODE);
				 ((ParamContext)_localctx).s =  (((ParamContext)_localctx).CODE!=null?((ParamContext)_localctx).CODE.getText():null); 
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

	public static class ArgsContext extends ParserRuleContext {
		public List<Argument> a;
		public ArgContext arg;
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_args);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__8);
				setState(129);
				((ArgsContext)_localctx).arg = arg();
				 ((ArgsContext)_localctx).a =  new ArrayList<>(); _localctx.a.add(((ArgsContext)_localctx).arg.a); 
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(131);
					match(T__9);
					setState(132);
					((ArgsContext)_localctx).arg = arg();
					 _localctx.a.add(((ArgsContext)_localctx).arg.a); 
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(T__10);
				}
				break;
			case T__3:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				 ((ArgsContext)_localctx).a =  null; 
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

	public static class ArgContext extends ParserRuleContext {
		public Argument a;
		public Token NONTERM_NAME;
		public TypeContext type;
		public TerminalNode NONTERM_NAME() { return getToken(Grammarv2Parser.NONTERM_NAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitArg(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((ArgContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
			setState(146);
			match(T__3);
			setState(147);
			((ArgContext)_localctx).type = type();
			 ((ArgContext)_localctx).a =  new Argument((((ArgContext)_localctx).NONTERM_NAME!=null?((ArgContext)_localctx).NONTERM_NAME.getText():null), ((ArgContext)_localctx).type.t); 
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

	public static class TypeContext extends ParserRuleContext {
		public String t;
		public Token NONTERM_NAME;
		public Token TERM_NAME;
		public TerminalNode NONTERM_NAME() { return getToken(Grammarv2Parser.NONTERM_NAME, 0); }
		public TerminalNode TERM_NAME() { return getToken(Grammarv2Parser.TERM_NAME, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONTERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((TypeContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
				 ((TypeContext)_localctx).t =  (((TypeContext)_localctx).NONTERM_NAME!=null?((TypeContext)_localctx).NONTERM_NAME.getText():null); 
				}
				break;
			case TERM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				((TypeContext)_localctx).TERM_NAME = match(TERM_NAME);
				 ((TypeContext)_localctx).t =  (((TypeContext)_localctx).TERM_NAME!=null?((TypeContext)_localctx).TERM_NAME.getText():null);
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

	public static class Ret_argContext extends ParserRuleContext {
		public List<Argument> a;
		public ArgContext arg;
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public Ret_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).enterRet_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Grammarv2Listener ) ((Grammarv2Listener)listener).exitRet_arg(this);
		}
	}

	public final Ret_argContext ret_arg() throws RecognitionException {
		Ret_argContext _localctx = new Ret_argContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ret_arg);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__11);
				setState(157);
				match(T__12);
				setState(158);
				((Ret_argContext)_localctx).arg = arg();
				 ((Ret_argContext)_localctx).a =  new ArrayList<>(); _localctx.a.add(((Ret_argContext)_localctx).arg.a); 
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(160);
					match(T__9);
					setState(161);
					((Ret_argContext)_localctx).arg = arg();
					 _localctx.a.add(((Ret_argContext)_localctx).arg.a); 
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(T__13);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				 ((Ret_argContext)_localctx).a =  null; 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\5\2\35\n\2\3\2\3\2\3\2\3\2\6\2#\n\2\r\2"+
		"\16\2$\3\2\3\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\5\5?\n\5\3\5\3\5\5\5C\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\6\3\6\3\6\3\6\6\6V"+
		"\n\6\r\6\16\6W\3\6\3\6\3\6\3\6\5\6^\n\6\5\6`\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\7\3\7\5\7t\n\7\3\7\3"+
		"\7\3\7\5\7y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\t\3\t\3\t\5\t\u0092\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00a7\n\f\f\f\16\f\u00aa\13\f\3\f\3\f\3\f\5\f"+
		"\u00af\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u00bb\2\30\3\2\2"+
		"\2\4,\3\2\2\2\69\3\2\2\2\b;\3\2\2\2\n_\3\2\2\2\fx\3\2\2\2\16\u0080\3\2"+
		"\2\2\20\u0091\3\2\2\2\22\u0093\3\2\2\2\24\u009c\3\2\2\2\26\u00ae\3\2\2"+
		"\2\30\31\7\3\2\2\31\32\7\22\2\2\32\34\b\2\1\2\33\35\5\4\3\2\34\33\3\2"+
		"\2\2\34\35\3\2\2\2\35\36\3\2\2\2\36\"\b\2\1\2\37 \5\6\4\2 !\7\4\2\2!#"+
		"\3\2\2\2\"\37\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\b\2"+
		"\1\2\'\3\3\2\2\2()\7\5\2\2)*\7\24\2\2*-\b\3\1\2+-\b\3\1\2,(\3\2\2\2,+"+
		"\3\2\2\2-\5\3\2\2\2./\7\21\2\2/\60\7\6\2\2\60\61\7\23\2\2\61:\b\4\1\2"+
		"\62\63\7\7\2\2\63\64\7\b\2\2\64\65\7\23\2\2\65:\b\4\1\2\66\67\5\b\5\2"+
		"\678\b\4\1\28:\3\2\2\29.\3\2\2\29\62\3\2\2\29\66\3\2\2\2:\7\3\2\2\2;<"+
		"\7\22\2\2<>\b\5\1\2=?\5\20\t\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@B\b\5\1\2"+
		"AC\5\26\f\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\5\1\2EF\7\6\2\2FG\5\n\6"+
		"\2GN\b\5\1\2HI\7\t\2\2IJ\5\n\6\2JK\b\5\1\2KM\3\2\2\2LH\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PN\3\2\2\2QU\b\6\1\2RS\5\f\7\2ST\b\6"+
		"\1\2TV\3\2\2\2UR\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X`\3\2\2\2YZ\b\6"+
		"\1\2Z]\7\n\2\2[\\\7\24\2\2\\^\b\6\1\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_Q"+
		"\3\2\2\2_Y\3\2\2\2`\13\3\2\2\2ab\7\21\2\2by\b\7\1\2cd\7\22\2\2ds\b\7\1"+
		"\2ef\7\13\2\2fg\5\16\b\2gn\b\7\1\2hi\7\f\2\2ij\5\16\b\2jk\b\7\1\2km\3"+
		"\2\2\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7"+
		"\r\2\2rt\3\2\2\2se\3\2\2\2st\3\2\2\2tu\3\2\2\2uy\b\7\1\2vw\7\24\2\2wy"+
		"\b\7\1\2xa\3\2\2\2xc\3\2\2\2xv\3\2\2\2y\r\3\2\2\2z{\7\22\2\2{\u0081\b"+
		"\b\1\2|}\7\21\2\2}\u0081\b\b\1\2~\177\7\24\2\2\177\u0081\b\b\1\2\u0080"+
		"z\3\2\2\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081\17\3\2\2\2\u0082\u0083\7"+
		"\13\2\2\u0083\u0084\5\22\n\2\u0084\u008b\b\t\1\2\u0085\u0086\7\f\2\2\u0086"+
		"\u0087\5\22\n\2\u0087\u0088\b\t\1\2\u0088\u008a\3\2\2\2\u0089\u0085\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\r\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u0092\b\t\1\2\u0091\u0082\3\2\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\21\3\2\2\2\u0093\u0094\7\22\2\2\u0094\u0095\7\6\2\2\u0095\u0096\5\24"+
		"\13\2\u0096\u0097\b\n\1\2\u0097\23\3\2\2\2\u0098\u0099\7\22\2\2\u0099"+
		"\u009d\b\13\1\2\u009a\u009b\7\21\2\2\u009b\u009d\b\13\1\2\u009c\u0098"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009d\25\3\2\2\2\u009e\u009f\7\16\2\2\u009f"+
		"\u00a0\7\17\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a8\b\f\1\2\u00a2\u00a3\7"+
		"\f\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5\b\f\1\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\20\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00af\b\f\1\2\u00ae\u009e\3\2\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\27\3\2\2\2\25\34$,9>BNW]_nsx\u0080\u008b\u0091\u009c\u00a8"+
		"\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}