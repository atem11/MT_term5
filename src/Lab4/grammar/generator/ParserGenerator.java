package Lab4.grammar.generator;

import Lab4.grammar.Grammar;

import java.io.IOException;

public class ParserGenerator extends ClassGenerator {

    public ParserGenerator(String dir, Grammar grammar) throws IOException {
        super(dir, "Parser" + grammar.name() + ".java", grammar);
    }

    @Override
    void printImport() {
    }

    @Override
    void printClass() {
        printName();
        printMembers();
        printConstructor();
        printCodeLine(0, "}");
    }

    private void printName() {
        printCodeLine(0, "public class Parser" + grammar.name(), "{", EOL);
    }

    private void printMembers() {
        printCodeLine(1, "private", "Lexer" + grammar.name(), "lexer;", EOL);
    }

    private void printConstructor() {
        printCodeLine(1, "public", "Parser" + grammar.name(), "(", "Lexer" + grammar.name() ,"lexer) {");
        printCodeLine(2, "this.lexer = lexer;");
        printCodeLine(1, "}", EOL);
    }
}
