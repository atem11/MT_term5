package grammar.result.test2 ; 
 
public class Parsertest2 { 
 
	private Lexertest2 lexer; 
 
	public class RETlowOp { 
		public int val ; 
	} 
 
	public class RETlowOp_ { 
		public int val ; 
	} 
 
	public class REThiOp { 
		public int val ; 
	} 
 
	public class REThiOp_ { 
		public int val ; 
	} 
 
	public class RETunar { 
		public int val ; 
	} 
 
	public Parsertest2 ( Lexertest2 lexer) { 
		this.lexer = lexer; 
		this.lexer.nextToken(); 
	} 
 
	private String consume( Tokentest2 token) { 
		while (lexer.curToken() != token) { 
			System.err.println("Unexpected token:" + token.name()); 
			lexer.nextToken(); 
		} 
		String res = lexer.curStr(); 
		lexer.nextToken(); 
		return res; 
	} 
 
	public RETlowOp lowOp () { 
		RETlowOp retArg = new RETlowOp (); 
		switch (lexer.curToken()) { 
			case NUM: 
			case BRO: 
			{ 
				REThiOp 
				hiOp = 
				hiOp 
					(); 
				RETlowOp_ 
				lowOp_ = 
				lowOp_ 
					(hiOp.val); 
				 retArg.val = lowOp_.val;  
				return retArg; 
			} 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public RETlowOp_ lowOp_ (int prev) { 
		RETlowOp_ retArg = new RETlowOp_ (); 
		switch (lexer.curToken()) { 
			case ADD: 
			{ 
				String 
				ADD = consume(lexer.curToken()); 
				REThiOp 
				hiOp = 
				hiOp 
					(); 
				 int N = prev + hiOp.val;  
				RETlowOp_ 
				lowOp_ = 
				lowOp_ 
					(N); 
				 retArg.val = lowOp_.val;  
				return retArg; 
			} 
			case SUB: 
			{ 
				String 
				SUB = consume(lexer.curToken()); 
				REThiOp 
				hiOp = 
				hiOp 
					(); 
				 int N = prev - hiOp.val;  
				RETlowOp_ 
				lowOp_ = 
				lowOp_ 
					(N); 
				 retArg.val = lowOp_.val;  
				return retArg; 
			} 
			case END_POINT: 
			case BRC: 
				{ retArg.val = prev; } 
				return retArg; 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public REThiOp hiOp () { 
		REThiOp retArg = new REThiOp (); 
		switch (lexer.curToken()) { 
			case NUM: 
			case BRO: 
			{ 
				RETunar 
				unar = 
				unar 
					(); 
				REThiOp_ 
				hiOp_ = 
				hiOp_ 
					(unar.val); 
				 retArg.val = hiOp_.val;  
				return retArg; 
			} 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public REThiOp_ hiOp_ (int prev) { 
		REThiOp_ retArg = new REThiOp_ (); 
		switch (lexer.curToken()) { 
			case MUL: 
			{ 
				String 
				MUL = consume(lexer.curToken()); 
				RETunar 
				unar = 
				unar 
					(); 
				REThiOp_ 
				hiOp_ = 
				hiOp_ 
					(prev * unar.val); 
				 retArg.val = hiOp_.val; 
				return retArg; 
			} 
			case DIV: 
			{ 
				String 
				DIV = consume(lexer.curToken()); 
				RETunar 
				unar = 
				unar 
					(); 
				REThiOp_ 
				hiOp_ = 
				hiOp_ 
					(prev / unar.val); 
				 retArg.val = hiOp_.val; 
				return retArg; 
			} 
			case ADD: 
			case SUB: 
			case END_POINT: 
			case BRC: 
				{ retArg.val = prev; } 
				return retArg; 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public RETunar unar () { 
		RETunar retArg = new RETunar (); 
		switch (lexer.curToken()) { 
			case BRO: 
			{ 
				String 
				BRO = consume(lexer.curToken()); 
				RETlowOp 
				lowOp = 
				lowOp 
					(); 
				String 
				BRC = consume(lexer.curToken()); 
				 retArg.val = lowOp.val;  
				return retArg; 
			} 
			case NUM: 
			{ 
				String 
				NUM = consume(lexer.curToken()); 
				 retArg.val = Integer.valueOf(NUM);  
				return retArg; 
			} 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
} 
