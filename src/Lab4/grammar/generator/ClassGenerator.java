package Lab4.grammar.generator;

import Lab4.grammar.Grammar;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ClassGenerator {

    private String packName;
    Grammar grammar;
    PrintWriter output;

    static final String TAB = "\t";
    static final String EOL = System.lineSeparator();

    ClassGenerator(String dir, String fileName, Grammar grammar) throws IOException {
        packName = "grammar.result." + grammar.name();
        this.grammar = grammar;
        Path pathDir = Paths.get(dir);
        pathDir = pathDir.resolve("grammar").resolve("result").resolve(grammar.name());
        Files.createDirectories(pathDir);
        output = new PrintWriter(new File(pathDir.toString(), fileName));
    }

    public void generateClass() {
        printPack();
        printImport();
        printClass();
        output.close();
    }

    private void printPack() {
        printCodeLine(0, "package", packName, ";", EOL);
    }

    abstract void printImport();

    abstract void printClass();

    void printCodeLine(int including, String... code) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < including; i++) {
            out.append(TAB);
        }
        for (String part : code) {
            out.append(part).append(" ");
        }
        out.append(EOL);
        output.write(out.toString());
    }
}
