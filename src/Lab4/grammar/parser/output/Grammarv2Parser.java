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
		T__9=10, T__10=11, T__11=12, TERM_NAME=13, NONTERM_NAME=14, STRING=15, 
		CODE=16, WS=17;
	public static final int
		RULE_start = 0, RULE_rules = 1, RULE_nonterm_rule = 2, RULE_pattern = 3, 
		RULE_one_pat = 4, RULE_param = 5, RULE_args = 6, RULE_arg = 7, RULE_type = 8, 
		RULE_ret_arg = 9;
	public static final String[] ruleNames = {
		"start", "rules", "nonterm_rule", "pattern", "one_pat", "param", "args", 
		"arg", "type", "ret_arg"
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
		public TerminalNode NONTERM_NAME() { return getToken(Grammarv2Parser.NONTERM_NAME, 0); }
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
			setState(20);
			match(T__0);
			setState(21);
			((StartContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
			 ((StartContext)_localctx).g =  new Grammar((((StartContext)_localctx).NONTERM_NAME!=null?((StartContext)_localctx).NONTERM_NAME.getText():null)); 
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				rules(_localctx.g);
				setState(24);
				match(T__1);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << TERM_NAME) | (1L << NONTERM_NAME))) != 0) );
			  
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
		enterRule(_localctx, 2, RULE_rules);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((RulesContext)_localctx).TERM_NAME = match(TERM_NAME);
				setState(33);
				match(T__2);
				setState(34);
				((RulesContext)_localctx).STRING = match(STRING);
				 _localctx.g.addTerm(new Term((((RulesContext)_localctx).TERM_NAME!=null?((RulesContext)_localctx).TERM_NAME.getText():null), (((RulesContext)_localctx).STRING!=null?((RulesContext)_localctx).STRING.getText():null))); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__3);
				setState(37);
				match(T__4);
				setState(38);
				((RulesContext)_localctx).STRING = match(STRING);
				 _localctx.g.addWS((((RulesContext)_localctx).STRING!=null?((RulesContext)_localctx).STRING.getText():null)); 
				}
				break;
			case NONTERM_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
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
		enterRule(_localctx, 4, RULE_nonterm_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((Nonterm_ruleContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
			 ((Nonterm_ruleContext)_localctx).t =  new NonTerm((((Nonterm_ruleContext)_localctx).NONTERM_NAME!=null?((Nonterm_ruleContext)_localctx).NONTERM_NAME.getText():null)); 
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(47);
				((Nonterm_ruleContext)_localctx).args = args();
				}
				break;
			}
			 _localctx.t.addArgs(((Nonterm_ruleContext)_localctx).args.a); 
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(51);
				((Nonterm_ruleContext)_localctx).ret_arg = ret_arg();
				}
				break;
			}
			setState(54);
			match(T__2);
			 _localctx.t.addRetArgs(((Nonterm_ruleContext)_localctx).ret_arg.a); 
			setState(56);
			((Nonterm_ruleContext)_localctx).pattern = pattern();
			 _localctx.t.addRule(((Nonterm_ruleContext)_localctx).pattern.r); 
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(58);
				match(T__5);
				setState(59);
				((Nonterm_ruleContext)_localctx).pattern = pattern();
				 _localctx.t.addRule(((Nonterm_ruleContext)_localctx).pattern.r); 
				}
				}
				setState(66);
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
		public List<One_patContext> one_pat() {
			return getRuleContexts(One_patContext.class);
		}
		public One_patContext one_pat(int i) {
			return getRuleContext(One_patContext.class,i);
		}
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
		enterRule(_localctx, 6, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((PatternContext)_localctx).r =  new Rule(); 
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				((PatternContext)_localctx).one_pat = one_pat();
				 _localctx.r.addTerm(((PatternContext)_localctx).one_pat.t); 
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TERM_NAME) | (1L << NONTERM_NAME) | (1L << CODE))) != 0) );
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
		enterRule(_localctx, 8, RULE_one_pat);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				((One_patContext)_localctx).TERM_NAME = match(TERM_NAME);
				 ((One_patContext)_localctx).t =  new Term((((One_patContext)_localctx).TERM_NAME!=null?((One_patContext)_localctx).TERM_NAME.getText():null)); 
				}
				break;
			case NONTERM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((One_patContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
				 NonTerm nt = new NonTerm((((One_patContext)_localctx).NONTERM_NAME!=null?((One_patContext)_localctx).NONTERM_NAME.getText():null)); 
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(79);
					match(T__6);
					setState(80);
					((One_patContext)_localctx).param = param();
					 nt.addParameter(((One_patContext)_localctx).param.s); 
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(82);
						match(T__7);
						setState(83);
						((One_patContext)_localctx).param = param();
						 nt.addParameter(((One_patContext)_localctx).param.s); 
						}
						}
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(91);
					match(T__8);
					}
				}

				 ((One_patContext)_localctx).t =  nt; 
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
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
		enterRule(_localctx, 10, RULE_param);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONTERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				((ParamContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
				 ((ParamContext)_localctx).s =  (((ParamContext)_localctx).NONTERM_NAME!=null?((ParamContext)_localctx).NONTERM_NAME.getText():null); 
				}
				break;
			case TERM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((ParamContext)_localctx).TERM_NAME = match(TERM_NAME);
				 ((ParamContext)_localctx).s =  (((ParamContext)_localctx).TERM_NAME!=null?((ParamContext)_localctx).TERM_NAME.getText():null); 
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
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
		enterRule(_localctx, 12, RULE_args);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__6);
				setState(109);
				((ArgsContext)_localctx).arg = arg();
				 ((ArgsContext)_localctx).a =  new ArrayList<>(); _localctx.a.add(((ArgsContext)_localctx).arg.a); 
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(111);
					match(T__7);
					setState(112);
					((ArgsContext)_localctx).arg = arg();
					 _localctx.a.add(((ArgsContext)_localctx).arg.a); 
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(T__8);
				}
				break;
			case T__2:
			case T__9:
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
		enterRule(_localctx, 14, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((ArgContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
			setState(126);
			match(T__2);
			setState(127);
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
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONTERM_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((TypeContext)_localctx).NONTERM_NAME = match(NONTERM_NAME);
				 ((TypeContext)_localctx).t =  (((TypeContext)_localctx).NONTERM_NAME!=null?((TypeContext)_localctx).NONTERM_NAME.getText():null); 
				}
				break;
			case TERM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
		enterRule(_localctx, 18, RULE_ret_arg);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__9);
				setState(137);
				match(T__10);
				setState(138);
				((Ret_argContext)_localctx).arg = arg();
				 ((Ret_argContext)_localctx).a =  new ArrayList<>(); _localctx.a.add(((Ret_argContext)_localctx).arg.a); 
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(140);
					match(T__7);
					setState(141);
					((Ret_argContext)_localctx).arg = arg();
					 _localctx.a.add(((Ret_argContext)_localctx).arg.a); 
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(T__11);
				}
				break;
			case T__2:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u009d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\5\4\63\n\4\3\4"+
		"\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4A\n\4\f\4\16\4D\13"+
		"\4\3\5\3\5\3\5\3\5\6\5J\n\5\r\5\16\5K\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\5\6`\n\6\3\6\3\6\3\6\5\6"+
		"e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"v\n\b\f\b\16\by\13\b\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\5\n\u0089\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0093"+
		"\n\13\f\13\16\13\u0096\13\13\3\13\3\13\3\13\5\13\u009b\n\13\3\13\2\2\f"+
		"\2\4\6\b\n\f\16\20\22\24\2\2\2\u00a4\2\26\3\2\2\2\4-\3\2\2\2\6/\3\2\2"+
		"\2\bE\3\2\2\2\nd\3\2\2\2\fl\3\2\2\2\16}\3\2\2\2\20\177\3\2\2\2\22\u0088"+
		"\3\2\2\2\24\u009a\3\2\2\2\26\27\7\3\2\2\27\30\7\20\2\2\30\34\b\2\1\2\31"+
		"\32\5\4\3\2\32\33\7\4\2\2\33\35\3\2\2\2\34\31\3\2\2\2\35\36\3\2\2\2\36"+
		"\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\b\2\1\2!\3\3\2\2\2\"#\7\17\2\2"+
		"#$\7\5\2\2$%\7\21\2\2%.\b\3\1\2&\'\7\6\2\2\'(\7\7\2\2()\7\21\2\2).\b\3"+
		"\1\2*+\5\6\4\2+,\b\3\1\2,.\3\2\2\2-\"\3\2\2\2-&\3\2\2\2-*\3\2\2\2.\5\3"+
		"\2\2\2/\60\7\20\2\2\60\62\b\4\1\2\61\63\5\16\b\2\62\61\3\2\2\2\62\63\3"+
		"\2\2\2\63\64\3\2\2\2\64\66\b\4\1\2\65\67\5\24\13\2\66\65\3\2\2\2\66\67"+
		"\3\2\2\2\678\3\2\2\289\7\5\2\29:\b\4\1\2:;\5\b\5\2;B\b\4\1\2<=\7\b\2\2"+
		"=>\5\b\5\2>?\b\4\1\2?A\3\2\2\2@<\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2"+
		"C\7\3\2\2\2DB\3\2\2\2EI\b\5\1\2FG\5\n\6\2GH\b\5\1\2HJ\3\2\2\2IF\3\2\2"+
		"\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2\2\2MN\7\17\2\2Ne\b\6\1\2OP\7\20"+
		"\2\2P_\b\6\1\2QR\7\t\2\2RS\5\f\7\2SZ\b\6\1\2TU\7\n\2\2UV\5\f\7\2VW\b\6"+
		"\1\2WY\3\2\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3"+
		"\2\2\2]^\7\13\2\2^`\3\2\2\2_Q\3\2\2\2_`\3\2\2\2`a\3\2\2\2ae\b\6\1\2bc"+
		"\7\22\2\2ce\b\6\1\2dM\3\2\2\2dO\3\2\2\2db\3\2\2\2e\13\3\2\2\2fg\7\20\2"+
		"\2gm\b\7\1\2hi\7\17\2\2im\b\7\1\2jk\7\22\2\2km\b\7\1\2lf\3\2\2\2lh\3\2"+
		"\2\2lj\3\2\2\2m\r\3\2\2\2no\7\t\2\2op\5\20\t\2pw\b\b\1\2qr\7\n\2\2rs\5"+
		"\20\t\2st\b\b\1\2tv\3\2\2\2uq\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz"+
		"\3\2\2\2yw\3\2\2\2z{\7\13\2\2{~\3\2\2\2|~\b\b\1\2}n\3\2\2\2}|\3\2\2\2"+
		"~\17\3\2\2\2\177\u0080\7\20\2\2\u0080\u0081\7\5\2\2\u0081\u0082\5\22\n"+
		"\2\u0082\u0083\b\t\1\2\u0083\21\3\2\2\2\u0084\u0085\7\20\2\2\u0085\u0089"+
		"\b\n\1\2\u0086\u0087\7\17\2\2\u0087\u0089\b\n\1\2\u0088\u0084\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0089\23\3\2\2\2\u008a\u008b\7\f\2\2\u008b\u008c"+
		"\7\r\2\2\u008c\u008d\5\20\t\2\u008d\u0094\b\13\1\2\u008e\u008f\7\n\2\2"+
		"\u008f\u0090\5\20\t\2\u0090\u0091\b\13\1\2\u0091\u0093\3\2\2\2\u0092\u008e"+
		"\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\16\2\2\u0098\u009b\3"+
		"\2\2\2\u0099\u009b\b\13\1\2\u009a\u008a\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\25\3\2\2\2\21\36-\62\66BKZ_dlw}\u0088\u0094\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}