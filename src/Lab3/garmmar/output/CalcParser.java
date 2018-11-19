// Generated from Calc.g4 by ANTLR 4.7.1

    package Lab3.garmmar.output;
    import java.util.HashMap;
    import java.util.Map;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ID=9, 
		INT=10, WS=11;
	public static final int
		RULE_calc = 0, RULE_statment = 1, RULE_expr = 2, RULE_multExpression = 3, 
		RULE_atom = 4;
	public static final String[] ruleNames = {
		"calc", "statment", "expr", "multExpression", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ID", "INT", "WS"
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
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Integer> values = new HashMap<>();

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CalcContext extends ParserRuleContext {
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitCalc(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				statment();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << ID) | (1L << INT))) != 0) );
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

	public static class StatmentContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitStatment(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statment);
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				((StatmentContext)_localctx).ID = match(ID);
				setState(16);
				match(T__0);
				setState(17);
				((StatmentContext)_localctx).expr = expr();
				setState(18);
				match(T__1);

					    values.put((((StatmentContext)_localctx).ID!=null?((StatmentContext)_localctx).ID.getText():null), ((StatmentContext)_localctx).expr.value);
					    System.out.println((((StatmentContext)_localctx).ID!=null?((StatmentContext)_localctx).ID.getText():null) + " = " + ((StatmentContext)_localctx).expr.value);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				((StatmentContext)_localctx).expr = expr();
				setState(22);
				match(T__1);

					    System.out.println("Result = " + ((StatmentContext)_localctx).expr.value);
					
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

	public static class ExprContext extends ParserRuleContext {
		public int value;
		public MultExpressionContext resultFirst;
		public MultExpressionContext resultFollow;
		public List<MultExpressionContext> multExpression() {
			return getRuleContexts(MultExpressionContext.class);
		}
		public MultExpressionContext multExpression(int i) {
			return getRuleContext(MultExpressionContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((ExprContext)_localctx).resultFirst = multExpression();

				            ((ExprContext)_localctx).value =  ((ExprContext)_localctx).resultFirst.value;
				        
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(29);
					match(T__2);
					setState(30);
					((ExprContext)_localctx).resultFollow = multExpression();

						            _localctx.value += ((ExprContext)_localctx).resultFollow.value;
						        
					}
					break;
				case T__3:
					{
					setState(33);
					match(T__3);
					setState(34);
					((ExprContext)_localctx).resultFollow = multExpression();

						            _localctx.value -= ((ExprContext)_localctx).resultFollow.value;
						        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(41);
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

	public static class MultExpressionContext extends ParserRuleContext {
		public int value;
		public AtomContext resultFirst;
		public AtomContext resultFollow;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public MultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitMultExpression(this);
		}
	}

	public final MultExpressionContext multExpression() throws RecognitionException {
		MultExpressionContext _localctx = new MultExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((MultExpressionContext)_localctx).resultFirst = atom();

			                ((MultExpressionContext)_localctx).value =  ((MultExpressionContext)_localctx).resultFirst.value;
			            
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				setState(52);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(44);
					match(T__4);
					setState(45);
					((MultExpressionContext)_localctx).resultFollow = atom();

					                _localctx.value *= ((MultExpressionContext)_localctx).resultFollow.value;
					            
					}
					break;
				case T__5:
					{
					setState(48);
					match(T__5);
					setState(49);
					((MultExpressionContext)_localctx).resultFollow = atom();

					                _localctx.value /= ((MultExpressionContext)_localctx).resultFollow.value;
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(56);
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

	public static class AtomContext extends ParserRuleContext {
		public int value;
		public Token ID;
		public Token INT;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(CalcParser.ID, 0); }
		public TerminalNode INT() { return getToken(CalcParser.INT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((AtomContext)_localctx).ID = match(ID);

					    try {
					        ((AtomContext)_localctx).value =  (int) values.get((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				        } catch (NullPointerException e) {
				            System.err.println("Unresolved ID : " + (((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				        }
					
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((AtomContext)_localctx).INT = match(INT);

				        ((AtomContext)_localctx).value =  Integer.parseInt((((AtomContext)_localctx).INT!=null?((AtomContext)_localctx).INT.getText():null));
					
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(T__6);
				setState(62);
				((AtomContext)_localctx).expr = expr();
				setState(63);
				match(T__7);

					    ((AtomContext)_localctx).value =  ((AtomContext)_localctx).expr.value;
					
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rG\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\67\n\5\f\5\16\5:\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6E\n"+
		"\6\3\6\2\2\7\2\4\6\b\n\2\2\2I\2\r\3\2\2\2\4\33\3\2\2\2\6\35\3\2\2\2\b"+
		",\3\2\2\2\nD\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2"+
		"\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\13\2\2\22\23\7\3\2\2\23\24\5\6\4"+
		"\2\24\25\7\4\2\2\25\26\b\3\1\2\26\34\3\2\2\2\27\30\5\6\4\2\30\31\7\4\2"+
		"\2\31\32\b\3\1\2\32\34\3\2\2\2\33\21\3\2\2\2\33\27\3\2\2\2\34\5\3\2\2"+
		"\2\35\36\5\b\5\2\36)\b\4\1\2\37 \7\5\2\2 !\5\b\5\2!\"\b\4\1\2\"(\3\2\2"+
		"\2#$\7\6\2\2$%\5\b\5\2%&\b\4\1\2&(\3\2\2\2\'\37\3\2\2\2\'#\3\2\2\2(+\3"+
		"\2\2\2)\'\3\2\2\2)*\3\2\2\2*\7\3\2\2\2+)\3\2\2\2,-\5\n\6\2-8\b\5\1\2."+
		"/\7\7\2\2/\60\5\n\6\2\60\61\b\5\1\2\61\67\3\2\2\2\62\63\7\b\2\2\63\64"+
		"\5\n\6\2\64\65\b\5\1\2\65\67\3\2\2\2\66.\3\2\2\2\66\62\3\2\2\2\67:\3\2"+
		"\2\28\66\3\2\2\289\3\2\2\29\t\3\2\2\2:8\3\2\2\2;<\7\13\2\2<E\b\6\1\2="+
		">\7\f\2\2>E\b\6\1\2?@\7\t\2\2@A\5\6\4\2AB\7\n\2\2BC\b\6\1\2CE\3\2\2\2"+
		"D;\3\2\2\2D=\3\2\2\2D?\3\2\2\2E\13\3\2\2\2\t\17\33\')\668D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}