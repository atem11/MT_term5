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
		RULE_atomMinus = 4, RULE_atom = 5;
	public static final String[] ruleNames = {
		"calc", "statment", "expr", "multExpression", "atomMinus", "atom"
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				statment();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << ID) | (1L << INT))) != 0) );
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
			setState(27);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				((StatmentContext)_localctx).ID = match(ID);
				setState(18);
				match(T__0);
				setState(19);
				((StatmentContext)_localctx).expr = expr();
				setState(20);
				match(T__1);

					    values.put((((StatmentContext)_localctx).ID!=null?((StatmentContext)_localctx).ID.getText():null), ((StatmentContext)_localctx).expr.value);
					    System.out.println((((StatmentContext)_localctx).ID!=null?((StatmentContext)_localctx).ID.getText():null) + " = " + ((StatmentContext)_localctx).expr.value);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				((StatmentContext)_localctx).expr = expr();
				setState(24);
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
			setState(29);
			((ExprContext)_localctx).resultFirst = multExpression();

				            ((ExprContext)_localctx).value =  ((ExprContext)_localctx).resultFirst.value;
				        
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				setState(39);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(31);
					match(T__2);
					setState(32);
					((ExprContext)_localctx).resultFollow = multExpression();

						            _localctx.value += ((ExprContext)_localctx).resultFollow.value;
						        
					}
					break;
				case T__3:
					{
					setState(35);
					match(T__3);
					setState(36);
					((ExprContext)_localctx).resultFollow = multExpression();

						            _localctx.value -= ((ExprContext)_localctx).resultFollow.value;
						        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43);
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
		public AtomMinusContext resultFirst;
		public AtomMinusContext resultFollow;
		public List<AtomMinusContext> atomMinus() {
			return getRuleContexts(AtomMinusContext.class);
		}
		public AtomMinusContext atomMinus(int i) {
			return getRuleContext(AtomMinusContext.class,i);
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
			setState(44);
			((MultExpressionContext)_localctx).resultFirst = atomMinus();

			                ((MultExpressionContext)_localctx).value =  ((MultExpressionContext)_localctx).resultFirst.value;
			            
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(46);
					match(T__4);
					setState(47);
					((MultExpressionContext)_localctx).resultFollow = atomMinus();

					                _localctx.value *= ((MultExpressionContext)_localctx).resultFollow.value;
					            
					}
					break;
				case T__5:
					{
					setState(50);
					match(T__5);
					setState(51);
					((MultExpressionContext)_localctx).resultFollow = atomMinus();

					                _localctx.value /= ((MultExpressionContext)_localctx).resultFollow.value;
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
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

	public static class AtomMinusContext extends ParserRuleContext {
		public int value;
		public AtomContext result;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).enterAtomMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcListener ) ((CalcListener)listener).exitAtomMinus(this);
		}
	}

	public final AtomMinusContext atomMinus() throws RecognitionException {
		AtomMinusContext _localctx = new AtomMinusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atomMinus);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				((AtomMinusContext)_localctx).result = atom();

				        ((AtomMinusContext)_localctx).value =  ((AtomMinusContext)_localctx).result.value;
				    
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__3);
				setState(63);
				((AtomMinusContext)_localctx).result = atom();

				        ((AtomMinusContext)_localctx).value =  -((AtomMinusContext)_localctx).result.value;
				    
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
		enterRule(_localctx, 10, RULE_atom);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
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
				setState(70);
				((AtomContext)_localctx).INT = match(INT);

				        ((AtomContext)_localctx).value =  Integer.parseInt((((AtomContext)_localctx).INT!=null?((AtomContext)_localctx).INT.getText():null));
					
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(T__6);
				setState(73);
				((AtomContext)_localctx).expr = expr();
				setState(74);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rR\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\59\n\5\f\5\16\5<\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6E\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\7\2\2\b\2\4\6\b\n\f\2"+
		"\2\2T\2\17\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b.\3\2\2\2\nD\3\2\2\2\fO"+
		"\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22"+
		"\3\2\2\2\22\3\3\2\2\2\23\24\7\13\2\2\24\25\7\3\2\2\25\26\5\6\4\2\26\27"+
		"\7\4\2\2\27\30\b\3\1\2\30\36\3\2\2\2\31\32\5\6\4\2\32\33\7\4\2\2\33\34"+
		"\b\3\1\2\34\36\3\2\2\2\35\23\3\2\2\2\35\31\3\2\2\2\36\5\3\2\2\2\37 \5"+
		"\b\5\2 +\b\4\1\2!\"\7\5\2\2\"#\5\b\5\2#$\b\4\1\2$*\3\2\2\2%&\7\6\2\2&"+
		"\'\5\b\5\2\'(\b\4\1\2(*\3\2\2\2)!\3\2\2\2)%\3\2\2\2*-\3\2\2\2+)\3\2\2"+
		"\2+,\3\2\2\2,\7\3\2\2\2-+\3\2\2\2./\5\n\6\2/:\b\5\1\2\60\61\7\7\2\2\61"+
		"\62\5\n\6\2\62\63\b\5\1\2\639\3\2\2\2\64\65\7\b\2\2\65\66\5\n\6\2\66\67"+
		"\b\5\1\2\679\3\2\2\28\60\3\2\2\28\64\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2"+
		"\2\2;\t\3\2\2\2<:\3\2\2\2=>\5\f\7\2>?\b\6\1\2?E\3\2\2\2@A\7\6\2\2AB\5"+
		"\f\7\2BC\b\6\1\2CE\3\2\2\2D=\3\2\2\2D@\3\2\2\2E\13\3\2\2\2FG\7\13\2\2"+
		"GP\b\7\1\2HI\7\f\2\2IP\b\7\1\2JK\7\t\2\2KL\5\6\4\2LM\7\n\2\2MN\b\7\1\2"+
		"NP\3\2\2\2OF\3\2\2\2OH\3\2\2\2OJ\3\2\2\2P\r\3\2\2\2\n\21\35)+8:DO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}