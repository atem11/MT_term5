package Lab4.grammar.generator;

import Lab4.grammar.Grammar;
import Lab4.grammar.term.Term;

import java.io.IOException;

public class LexerGenerator extends ClassGenerator {

    private String tokenName;

    public LexerGenerator(String dir, Grammar grammar) throws IOException {
        super(dir, "Lexer" + grammar.name() + ".java", grammar);
        tokenName = "Token" + grammar.name();
    }

    @Override
    void printImport() {
        printCodeLine(0, "import java.util.*;");
        printCodeLine(0, "import java.util.regex.*;");
        output.write(EOL);
    }

    @Override
    void printClass() {
        printName();
        printMembers();
        printConstructor();
        printAddTerms();
        printSkipWS();
        printHasToken();
        printNextToken();
        printCurToken();
        printCodeLine(0, "}");
    }

    private void printName() {
        printCodeLine(0, "public class Lexer" + grammar.name(), "{", EOL);
    }

    private void printMembers() {
        if (grammar.WS() != null) {
            printCodeLine(1, "private Pattern WS = Pattern.compile(", grammar.WS(), ");", EOL);
        }
        printCodeLine(1,"private String input;");
        printCodeLine(1, "private" , tokenName, "token;");
        printCodeLine(1, "private int currentIndex;");
        printCodeLine(1, "private Matcher matcher;");
        printCodeLine(1, "private Map<", tokenName,", Pattern> tokenRegexp = new HashMap<>();", EOL);
    }

    private void printConstructor() {
        printCodeLine(1, "public", "Lexer" + grammar.name(), "(String input) {");
        printCodeLine(2, "this.input = input;");
        printCodeLine(2, "currentIndex = 0;");
        printCodeLine(2, "matcher = Pattern.compile(\"\").matcher(input);");
        printCodeLine(2, "addTerms();");
        printCodeLine(1, "}", EOL);
    }

    private void printAddTerms() {
        printCodeLine(1, "private void addTerms() {");
        printCodeLine(2, "tokenRegexp.put(", tokenName+".END_POINT, Pattern.compile(\"#\"));");
        for (Term t : grammar.terms()) {
            printCodeLine(2, "tokenRegexp.put(", tokenName+"."+t.name(), ", Pattern.compile(", t.regexp(),"));");
        }
        printCodeLine(1, "}", EOL);
    }

    private void printSkipWS() {
        printCodeLine(1, "private void skipWS() {");
        if (grammar.WS() != null) {
            printCodeLine(2, "matcher.usePattern(WS);");
            printCodeLine(2, "matcher.region(currentIndex, input.length());");
            printCodeLine(2, "if (matcher.lookingAt()) {");
            printCodeLine(3, "currentIndex += matcher.end() - matcher.start();");
            printCodeLine(2, "}");
        }
        printCodeLine(1, "}", EOL);
    }

    private void printHasToken() {
        printCodeLine(1, "private boolean hasToken() {");
        printCodeLine(2, "for (", tokenName, "t :", tokenName + ".values()) {");
        printCodeLine(3, "matcher.usePattern(tokenRegexp.get(t));");
        printCodeLine(3, "matcher.region(currentIndex, input.length());");
        printCodeLine(3, "if (matcher.lookingAt()) {");
        printCodeLine(4, "token = t;");
        printCodeLine(4, "currentIndex += matcher.end() - matcher.start();");
        printCodeLine(4, "return true;");
        printCodeLine(3, "}");
        printCodeLine(2, "}");
        printCodeLine(2, "return false;");
        printCodeLine(1, "}", EOL);
    }

    private void printNextToken() {
        printCodeLine(1, "public void nextToken() {");
        printCodeLine(2, "while (true) {");
        printCodeLine(3, "skipWS();");
        printCodeLine(3, "if (currentIndex == input.length()) {");
        printCodeLine(4, "return;");
        printCodeLine(3, "}");
        printCodeLine(3, "if (!hasToken()) {");
        printCodeLine(4, "System.err.println(\"Unknown symbol \" + input.charAt(currentIndex) + \" at position: \" + currentIndex);");
        printCodeLine(4, "currentIndex++;");
        printCodeLine(3, "} else {");
        printCodeLine(4, "return;");
        printCodeLine(3, "}");
        printCodeLine(2, "}");
        printCodeLine(1, "}", EOL);
    }

    private void printCurToken() {
        printCodeLine(1, "public TokentestGrammar curToken() {");
        printCodeLine(2, "return token;");
        printCodeLine(1, "}");
    }
}
