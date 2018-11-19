package Lab3;

//java -jar ..\..\..\lib\antlr-4.7.1-complete.jar -o output Calc.g4

import Lab3.garmmar.output.CalcLexer;
import Lab3.garmmar.output.CalcParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lab3 {
    public static void main(String[] args) throws IOException {
        Path pathToInputFile = Paths.get(".\\src\\Lab3\\test.txt");
        ANTLRInputStream reader = new ANTLRInputStream(Files.newInputStream(pathToInputFile));
        CalcLexer lexer = new CalcLexer(reader);
        TokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        parser.calc();
    }
}
