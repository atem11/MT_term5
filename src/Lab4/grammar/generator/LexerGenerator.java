package Lab4.grammar.generator;

import Lab4.grammar.Grammar;

import java.io.IOException;

public class LexerGenerator extends ClassGenerator {

    public LexerGenerator(String dir, Grammar grammar) throws IOException {
        super(dir, "Lexer" + grammar.name() + ".java", grammar);
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
        printMebers();
        printCodeLine(0, "}");
    }

    void printName() {
        printCodeLine(0, "public class Lexer" + grammar.name(), "{", EOL);
    }

    void printMebers() {
        if (grammar.WS() != null) {
            printCodeLine(1, "private Pattern WS = Pattern.compile(", grammar.WS(), ");");
        }

    }
}
