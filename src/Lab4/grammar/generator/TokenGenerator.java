package Lab4.grammar.generator;

import Lab4.grammar.Grammar;
import Lab4.grammar.term.Term;

import java.io.IOException;

public class TokenGenerator extends ClassGenerator {
    public TokenGenerator(String dir, Grammar grammar) throws IOException {
        super(dir, "Token" + grammar.name() + ".java", grammar);
    }

    @Override
    void printImport() {
    }

    @Override
    void printClass() {
        printName();
        printMembers();
        printCodeLine(0, "}");
    }

    private void printName() {
        printCodeLine(0, "public enum Token" + grammar.name(), "{");
    }

    private void printMembers() {
        for (Term term : grammar.terms()) {
            printCodeLine(1, term.name(), ",");
        }
        printCodeLine(1, "END_POINT");
    }
}
