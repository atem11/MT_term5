package grammar.result.testGrammar ; 
 

import Lab2.parserLab2.Tree;
 
 
public class ParsertestGrammar { 
 
	private LexertestGrammar lexer; 
 
	public class RETs { 
		public Tree t ; 
	} 
 
	public class RETnend { 
		public Tree t ; 
	} 
 
	public class RETs_ { 
		public Tree t ; 
	} 
 
	public class RETnre { 
		public Tree t ; 
	} 
 
	public class RETnext { 
		public Tree t ; 
	} 
 
	public class RETnre_ { 
		public Tree t ; 
	} 
 
	public class RETos { 
		public Tree t ; 
	} 
 
	public class RETklini { 
		public Tree t ; 
	} 
 
	public class RETre { 
		public Tree t ; 
	} 
 
	public ParsertestGrammar ( LexertestGrammar lexer) { 
		this.lexer = lexer; 
		this.lexer.nextToken(); 
	} 
 
	private String consume( TokentestGrammar token) { 
		while (lexer.curToken() != token) { 
			System.err.println("Unexpected token:" + token.name()); 
			lexer.nextToken(); 
		} 
		String res = lexer.curStr(); 
		lexer.nextToken(); 
		return res; 
	} 
 
	public RETs s () { 
		RETs retArg = new RETs (); 
		switch (lexer.curToken()) { 
			case LET: 
			case BRO: 
			{ 
				{ retArg.t = new Tree("S"); } 
				RETnre 
				nre = 
				nre 
					(); 
				{ retArg.t.addChildren(nre.t); } 
				RETnend 
				nend = 
				nend 
					(); 
				{ retArg.t.addChildren(nend.t); } 
				return retArg; 
			} 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public RETnend nend () { 
		RETnend retArg = new RETnend (); 
		switch (lexer.curToken()) { 
			case OR: 
			{ 
				{ retArg.t = new Tree("Nend"); } 
				RETs_ 
				s_ = 
				s_ 
					(); 
				{ retArg.t.addChildren(s_.t); } 
				return retArg; 
			} 
			case END_POINT: 
			case BRC: 
				{ retArg.t = new Tree("Nend"); } 
				return retArg; 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public RETs_ s_ () { 
		RETs_ retArg = new RETs_ (); 
		switch (lexer.curToken()) { 
			case OR: 
			{ 
				{ retArg.t = new Tree("S'");  } 
				String 
				OR = consume(lexer.curToken()); 
				{ retArg.t.addChildren(new Tree(OR)); } 
				RETnre 
				nre = 
				nre 
					(); 
				{ retArg.t.addChildren(nre.t); } 
				RETnend 
				nend = 
				nend 
					(); 
				{ retArg.t.addChildren(nend.t); } 
				return retArg; 
			} 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public RETnre nre () { 
		RETnre retArg = new RETnre (); 
		switch (lexer.curToken()) { 
			case LET: 
			case BRO: 
			{ 
				{ retArg.t = new Tree("Nre"); } 
				RETos 
				os = 
				os 
					(); 
				{ retArg.t.addChildren(os.t); } 
				RETnext 
				next = 
				next 
					(); 
				{ retArg.t.addChildren(next.t); } 
				return retArg; 
			} 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public RETnext next () { 
		RETnext retArg = new RETnext (); 
		switch (lexer.curToken()) { 
			case LET: 
			case BRO: 
			{ 
				{ retArg.t = new Tree("Next"); } 
				RETnre_ 
				nre_ = 
				nre_ 
					(); 
				{ retArg.t.addChildren(nre_.t); } 
				return retArg; 
			} 
			case END_POINT: 
			case BRC: 
			case OR: 
				{ retArg.t = new Tree("Next"); } 
				return retArg; 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public RETnre_ nre_ () { 
		RETnre_ retArg = new RETnre_ (); 
		switch (lexer.curToken()) { 
			case LET: 
			case BRO: 
			{ 
				{ retArg.t = new Tree("Nre'"); } 
				RETos 
				os = 
				os 
					(); 
				{ retArg.t.addChildren(os.t); } 
				RETnext 
				next = 
				next 
					(); 
				{ retArg.t.addChildren(next.t); } 
				return retArg; 
			} 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public RETos os () { 
		RETos retArg = new RETos (); 
		switch (lexer.curToken()) { 
			case LET: 
			case BRO: 
			{ 
				{ retArg.t = new Tree("Os"); } 
				RETre 
				re = 
				re 
					(); 
				{ retArg.t.addChildren(re.t); } 
				RETklini 
				klini = 
				klini 
					(); 
				{ retArg.t.addChildren(klini.t); } 
				return retArg; 
			} 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public RETklini klini () { 
		RETklini retArg = new RETklini (); 
		switch (lexer.curToken()) { 
			case Z: 
			{ 
				{ retArg.t = new Tree("Klini"); } 
				String 
				Z = consume(lexer.curToken()); 
				{ retArg.t.addChildren(new Tree(Z)); } 
				return retArg; 
			} 
			case Q: 
			{ 
				{ retArg.t = new Tree("Klini"); } 
				String 
				Q = consume(lexer.curToken()); 
				{ retArg.t.addChildren(new Tree(Q)); } 
				return retArg; 
			} 
			case END_POINT: 
			case BRC: 
			case OR: 
			case LET: 
			case BRO: 
				{ retArg.t = new Tree("Klini"); } 
				return retArg; 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
	public RETre re () { 
		RETre retArg = new RETre (); 
		switch (lexer.curToken()) { 
			case LET: 
			{ 
				{ retArg.t = new Tree("RE"); } 
				String 
				LET = consume(lexer.curToken()); 
				{ retArg.t.addChildren(new Tree(LET)); } 
				return retArg; 
			} 
			case BRO: 
			{ 
				{ retArg.t = new Tree("RE"); } 
				String 
				BRO = consume(lexer.curToken()); 
				{ retArg.t.addChildren(new Tree(BRO)); } 
				RETs 
				s = 
				s 
					(); 
				{ retArg.t.addChildren(s.t); } 
				String 
				BRC = consume(lexer.curToken()); 
				{ retArg.t.addChildren(new Tree(BRC)); } 
				return retArg; 
			} 
			default : 
				System.err.println("Unexpected Token:" + lexer.curToken() ); 
		} 
		return null; 
	} 
 
} 
