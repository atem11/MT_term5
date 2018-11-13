import parser.Lexer;
import parser.Parser;
import parser.TokenStream;
import parser.Tree;
import test.RandomTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lab2 {

    public static void main(String[] args) throws IOException {
        //*
        Path pathToInputFile = Paths.get("test.txt");
        try (BufferedReader reader = Files.newBufferedReader(pathToInputFile)) {
            StringBuilder allLines = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                allLines.append(line);
            }
            TokenStream tokens = Lexer.analyze(allLines.toString());
           // System.out.println(tokens);
            Parser parser = new Parser();
            Tree tree = parser.parse(allLines.toString());
           // System.out.println(tree.toString());
            tree.printGraph("Tree.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //*/
    }
}
