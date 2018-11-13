package test;

import parser.Parser;
import parser.Tree;

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
        trueTests.add("adsf|ds");
        trueTests.add("a*");
        trueTests.add("(dfd)*|d");
        trueTests.add("(a*)*");
        trueTests.add("lol");
        trueTests.add("(dg*dg)|(d)*(dg)|x*");
        trueTests.add("df|sdf(sdf)");
        trueTests.add("((fg)*sdf)*|((df)|(sd*d))");
    }

    static {
        falseTests.add("");
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
    }

    public static void main(String[] args) {
        try {
            System.err.println("Running simple tests");
            System.err.println("----------------------");
            simpleTestsTrue();
            simpleTestsFalse();
            System.err.println("Running random tests");
            System.err.println("----------------------");
            randomTest(1000);
            System.err.println("----------------------");
            System.err.println("COMPLETE");
        } catch (IOException e) {
            System.err.println("----------------------");
            System.err.println("TEST FAILURE");
            e.printStackTrace();
        }
    }

    private static void randomTest(int size) throws IOException {
        RandomTest randomTest = new RandomTest();
        for (int i = 100; i < size; i++) {
            String test = randomTest.randomRegEx(i);
            try {
                Tree ans = parser.parse(test);
            } catch (IOException e) {
                throw new IOException("WRONG ANSWER at test: " + test);
            }
        }
    }

    private static void simpleTestsTrue() throws IOException {
        for (String test : trueTests) {
            System.err.println("Running test: " + test);
            try {
                Tree ans = parser.parse(test);
            } catch (IOException e) {
                throw new IOException("WRONG ANSWER at test: " + test);
            }
        }
    }

    private static void simpleTestsFalse() throws IOException {
        for (String test : falseTests) {
            System.err.println("Running test: " + test);
            try {
                Tree ans = parser.parse(test);
                throw new IOException("WRONG ANSWER at test: " + test);
            } catch (IOException ignored) {
            }
        }
    }
}
