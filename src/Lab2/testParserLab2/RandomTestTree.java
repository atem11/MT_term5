package Lab2.testParserLab2;

import Lab2.parserLab2.Tree;

import java.util.Random;

public class RandomTestTree {
    private static final int BORDER = 10; // not < 3
    private int size = 0;
    private Random random = new Random();

    Tree randomTree(int size) {
        this.size = size;
        return randomS();
    }

    private Tree randomS() {
        Tree ans = new Tree("S");
        Tree Nre = randomNre();
        Tree Nend = randomNend();
        ans.addChildren(Nre);
        ans.addChildren(Nend);
        return ans;
    }

    private Tree randomNend() {
        Tree tree = new Tree("Nend");
        if (size > 0) {
            int choose = random.nextInt(BORDER);
            if (choose < BORDER / 3) {
                size--;
                tree.addChildren(randomSh());
            } else {
                tree.addChildren(new Tree("Eps", true));
            }
        } else {
            tree.addChildren(new Tree("Eps", true));
        }
        return tree;
    }

    private Tree randomSh() {
        Tree tree = new Tree("S'");
        size--;
        tree.addChildren(new Tree("|", true));
        tree.addChildren(randomNre());
        tree.addChildren(randomNend());
        return tree;
    }

    private Tree randomNre() {
        Tree tree = new Tree("Nre");
        tree.addChildren(randomOs());
        tree.addChildren(randomNext());
        return tree;
    }

    private Tree randomOs() {
        Tree tree = new Tree("Os");
        tree.addChildren(randomRE());
        tree.addChildren(randomKlini());
        return tree;
    }

    private Tree randomRE() {
        Tree tree = new Tree("RE");
        if (size > 0 && size < 3) {
            size--;
            tree.addChildren(new Tree("t", true));
        } else {
            int choose = random.nextInt(BORDER);
            if (choose > BORDER / 3) {
                size--;
                tree.addChildren(new Tree("t", true));
            } else {
                size -= 2;
                tree.addChildren(new Tree("(", true));
                tree.addChildren(randomS());
                tree.addChildren(new Tree(")", true));
            }
        }
        return tree;
    }

    private Tree randomKlini() {
        Tree tree = new Tree("Klini");
        int choose = random.nextInt(BORDER);
        if (choose < BORDER / 3) {
            size--;
            tree.addChildren(new Tree("*", true));
        } else {
            tree.addChildren(new Tree("Eps", true));
        }
        return tree;
    }

    private Tree randomNext() {
        Tree tree = new Tree("Next");
        if (size > 0) {
            int choose = random.nextInt(BORDER);
            if (choose > 2) {
                tree.addChildren(randomNreh());
            } else {
                tree.addChildren(new Tree("Eps", true));
            }
        } else {
            tree.addChildren(new Tree("Eps", true));
        }
        return tree;
    }

    private Tree randomNreh() {
        Tree tree = new Tree("Nre'");
        tree.addChildren(randomOs());
        tree.addChildren(randomNext());
        return tree;
    }
}
