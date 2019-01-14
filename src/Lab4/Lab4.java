package Lab4;


//java -jar ..\..\..\..\lib\antlr-4.7.1-complete.jar -o output Grammarv2.g4

import Lab4.grammar.Grammar;
import Lab4.grammar.generator.ClassGenerator;
import Lab4.grammar.generator.LexerGenerator;
import Lab4.grammar.generator.ParserGenerator;
import Lab4.grammar.generator.TokenGenerator;
import Lab4.grammar.parser.output.Grammarv2Lexer;
import Lab4.grammar.parser.output.Grammarv2Parser;
import grammar.result.testGrammar.LexertestGrammar;
import grammar.result.testGrammar.ParsertestGrammar;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lab4 {


    public static void main(String[] args) throws IOException {
        Path pathToGrammarFile = Paths.get(".\\src\\Lab4\\testGrammar.txt");
        String pathToOutput = ".\\src";
        Path pathToInputFile = Paths.get(".\\src\\Lab4\\test.txt");
        //Parse to Grammar.class
        ANTLRInputStream reader = new ANTLRInputStream(Files.newInputStream(pathToGrammarFile));
        Grammarv2Lexer lexer = new Grammarv2Lexer(reader);
        TokenStream tokens = new CommonTokenStream(lexer);
        Grammarv2Parser parser = new Grammarv2Parser(tokens);
        Grammar grammar = parser.start().g;
        grammar.prepare();
        //Generate Token.class
        ClassGenerator tokenGenerator = new TokenGenerator(pathToOutput, grammar);
        tokenGenerator.generateClass();
        //Generate Lexer.class
        ClassGenerator lexerGenerator = new LexerGenerator(pathToOutput, grammar);
        lexerGenerator.generateClass();
        //Generate Parser.class
        ClassGenerator parserGenerator = new ParserGenerator(pathToOutput, grammar);
        parserGenerator.generateClass();

        System.out.println("Finish");

        //*Test part
        try (BufferedReader read = Files.newBufferedReader(pathToInputFile)) {
            StringBuilder input = new StringBuilder();
            String line;
            while ((line = read.readLine()) != null) {
                input.append(line);
            }
            LexertestGrammar lex = new LexertestGrammar(input.toString());
            ParsertestGrammar parsertestGrammar = new ParsertestGrammar(lex);
            parsertestGrammar.s();
        }//*/

    }
}
