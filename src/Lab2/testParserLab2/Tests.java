package Lab2.testParserLab2;

import Lab2.parserLab2.Parser;
import Lab2.parserLab2.Tree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tests {

    private static Parser parser = new Parser();

    private static List<String> trueTests = new ArrayList<>();

    private static List<String> falseTests = new ArrayList<>();

    static {
        //Sample
        trueTests.add("((abc*b|a)*ab(aa|b*)b)*");
        trueTests.add("(a)");
        trueTests.add("test");
        trueTests.add("testsafdgsfdsafdgsfdfsagadsa");
        trueTests.add("adsf|ds");
        trueTests.add("a*");
        trueTests.add("(dfd)*|d");
        trueTests.add("(a*)*");
        trueTests.add("lol");
        trueTests.add("(dg*dg)|(d)*(dg)|x*");
        trueTests.add("df|sdf(sdf)");
        trueTests.add("((fg)*sdf)*|((df)|(sd*d))");
        trueTests.add("(a)?");
        trueTests.add("a?");
        trueTests.add("ab?");
    }

    static {
        falseTests.add("");
        falseTests.add("     \n");
        falseTests.add("     ");
        falseTests.add("()");
        falseTests.add("()|()");
        falseTests.add("a()");
        falseTests.add("|");
        falseTests.add("()a()");
        falseTests.add("(d())");
        falseTests.add("(f))");
        falseTests.add("(d)|)");
        falseTests.add("f*()|sd");
        falseTests.add(")()())(()(");
        falseTests.add("|*");
        falseTests.add("14432");
        falseTests.add("sfLsf");
        falseTests.add("134DSF");
        falseTests.add("(D)|d*");
        falseTests.add("(!)|@");
        falseTests.add("?");
        falseTests.add("*");
        falseTests.add("a?*");
        falseTests.add("a*?");
        falseTests.add("(a)?*");
        falseTests.add("(a)*?");
    }

    public static void main(String[] args) {
        try {
            System.err.println("Running simple tests");
            System.err.println("----------------------");
            simpleTestsTrue();
            simpleTestsFalse();
            System.err.println("Running random tests String");
            System.err.println("----------------------");
            randomTestString(1000);
            System.err.println("Running random tests Tree");
            System.err.println("----------------------");
            randomTestTree(100);
            System.err.println("COMPLETE");
        } catch (IOException e) {
            System.err.println("----------------------");
            System.err.println("TEST FAILURE");
            e.printStackTrace();
        }
    }

    private static void randomTestTree(int size) throws IOException {
        RandomTestTree randomTestTree = new RandomTestTree();
        for (int i = 10; i < size; i++) {
            Tree testTree = randomTestTree.randomTree(i);
            String test = testTree.makeString();
            try {
                Tree ansTree = parser.parse(test);
                if (!testTree.equals(ansTree)) {
                    throw new IOException();
                }
            } catch (IOException e) {
                throw new IOException("WRONG ANSWER at test: " + test);
            }
        }
    }

    private static void randomTestString(int size) throws IOException {
        RandomTest randomTest = new RandomTest();
        for (int i = 100; i < size; i++) {
            String test = randomTest.randomRegEx(i);
            try {
                parser.parse(test);
            } catch (IOException e) {
                throw new IOException("WRONG ANSWER at test: " + test);
            }
        }
    }

    private static void simpleTestsTrue() throws IOException {
        for (String test : trueTests) {
            System.err.println("Running OK test: " + test);
            try {
                parser.parse(test);
            } catch (IOException e) {
                throw new IOException("WRONG ANSWER at test: " + test);
            }
        }
    }

    private static void simpleTestsFalse() throws IOException {
        for (String test : falseTests) {
            System.err.println("Running WA test: " + test);
            try {
                parser.parse(test);
            } catch (IOException ignored) {
                continue;
            }
            throw new IOException("WRONG ANSWER at test: " + test);
        }
    }
}
