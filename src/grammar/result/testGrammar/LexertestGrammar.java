package grammar.result.testGrammar ; 
 
import java.util.*; 
import java.util.regex.*; 

public class LexertestGrammar { 
 
	private String input; 
	private TokentestGrammar token; 
	private int currentIndex; 
	private Matcher matcher; 
	private Map< TokentestGrammar , Pattern> tokenRegexp = new HashMap<>(); 
 
	public LexertestGrammar (String input) { 
		this.input = input; 
		currentIndex = 0; 
		matcher = Pattern.compile("").matcher(input); 
		addTerms(); 
	} 
 
	private void addTerms() { 
		tokenRegexp.put( TokentestGrammar.END_POINT, Pattern.compile("__\\$__")); 
		tokenRegexp.put( TokentestGrammar.BRO , Pattern.compile( "\\(" )); 
		tokenRegexp.put( TokentestGrammar.BRC , Pattern.compile( "\\)" )); 
		tokenRegexp.put( TokentestGrammar.OR , Pattern.compile( "\\|" )); 
		tokenRegexp.put( TokentestGrammar.Q , Pattern.compile( "\\?" )); 
		tokenRegexp.put( TokentestGrammar.Z , Pattern.compile( "\\*" )); 
		tokenRegexp.put( TokentestGrammar.LET , Pattern.compile( "[a-z]+" )); 
	} 
 
	private void skipWS() { 
	} 
 
	private boolean hasToken() { 
		for ( TokentestGrammar t : TokentestGrammar.values()) { 
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
 
	public TokentestGrammar curToken() { 
		return token; 
	} 
 
	public String curStr() { 
		return matcher.group(); 
	} 
} 
