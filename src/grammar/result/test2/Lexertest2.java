package grammar.result.test2 ; 
 
import java.util.*; 
import java.util.regex.*; 

public class Lexertest2 { 
 
	private Pattern WS = Pattern.compile( "[ \n\t\r]+" ); 
 
	private String input; 
	private Tokentest2 token; 
	private int currentIndex; 
	private Matcher matcher; 
	private Map< Tokentest2 , Pattern> tokenRegexp = new HashMap<>(); 
 
	public Lexertest2 (String input) { 
		this.input = input; 
		currentIndex = 0; 
		matcher = Pattern.compile("").matcher(input); 
		addTerms(); 
	} 
 
	private void addTerms() { 
		tokenRegexp.put( Tokentest2.END_POINT, Pattern.compile("__\\$__")); 
		tokenRegexp.put( Tokentest2.BRO , Pattern.compile( "\\(" )); 
		tokenRegexp.put( Tokentest2.BRC , Pattern.compile( "\\)" )); 
		tokenRegexp.put( Tokentest2.NUM , Pattern.compile( "[0-9]+" )); 
		tokenRegexp.put( Tokentest2.ADD , Pattern.compile( "\\+" )); 
		tokenRegexp.put( Tokentest2.SUB , Pattern.compile( "-" )); 
		tokenRegexp.put( Tokentest2.MUL , Pattern.compile( "\\*" )); 
		tokenRegexp.put( Tokentest2.DIV , Pattern.compile( "\\\\" )); 
	} 
 
	private void skipWS() { 
		matcher.usePattern(WS); 
		matcher.region(currentIndex, input.length()); 
		if (matcher.lookingAt()) { 
			currentIndex += matcher.end() - matcher.start(); 
		} 
	} 
 
	private boolean hasToken() { 
		for ( Tokentest2 t : Tokentest2.values()) { 
			matcher.usePattern(tokenRegexp.get(t)); 
			matcher.region(currentIndex, input.length()); 
			if (matcher.lookingAt()) { 
				token = t; 
				currentIndex += matcher.end() - matcher.start(); 
				return true; 
			} 
		} 
		return false; 
	} 
 
	public void nextToken() { 
		while (true) { 
			skipWS(); 
			if (currentIndex == input.length()) { 
				return; 
			} 
			if (!hasToken()) { 
				System.err.println("Unknown symbol " + input.charAt(currentIndex) + " at position: " + currentIndex); 
				currentIndex++; 
			} else { 
				return; 
			} 
		} 
	} 
 
	public Tokentest2 curToken() { 
		return token; 
	} 
 
	public String curStr() { 
		return matcher.group(); 
	} 
} 
