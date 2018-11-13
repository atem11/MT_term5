package Lab2;

import Lab2.parserLab2.Lexer;
import Lab2.parserLab2.Parser;
import Lab2.parserLab2.TokenStream;
import Lab2.parserLab2.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Lab2 {

    public static void main(String[] args) {
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
