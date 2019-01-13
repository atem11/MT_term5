package Lab4;



//java -jar ..\..\..\..\lib\antlr-4.7.1-complete.jar -o output Grammarv2.g4

import Lab4.grammar.Grammar;
import Lab4.grammar.generator.*;
import Lab4.grammar.parser.output.Grammarv2Lexer;
import Lab4.grammar.parser.output.Grammarv2Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lab4 {


    public static void main(String[] args) throws IOException {
        Path pathToGrammarFile = Paths.get(".\\src\\Lab4\\testGrammar.txt");
        String pathToOutput = ".\\src";
        Path pathToInputFile = Paths.get(".\\test.txt");
        //Parse to Grammar.class
        ANTLRInputStream reader = new ANTLRInputStream(Files.newInputStream(pathToGrammarFile));
        Grammarv2Lexer lexer = new Grammarv2Lexer(reader);
        TokenStream tokens = new CommonTokenStream(lexer);
        Grammarv2Parser parser = new Grammarv2Parser(tokens);
        Grammar grammar =  parser.start().g;
        //Generate Token.class
        ClassGenerator tokenGenerator = new TokenGenerator(pathToOutput, grammar);
        tokenGenerator.generateClass();
        //Generate Lexer.class
        ClassGenerator lexerGenerator = new LexerGenerator(pathToOutput, grammar);
        lexerGenerator.generateClass();

        System.out.println("NICE");
    }
}