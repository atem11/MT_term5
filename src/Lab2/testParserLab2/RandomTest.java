package Lab2.testParserLab2;

import java.util.Random;

public class RandomTest {
    private static final int BORDER = 10; // not < 3
    private int size = 0;
    private Random random = new Random();

    String randomRegEx(int size) {
        this.size = size;
        return randomS();
    }

    private String randomS() {
        String Nre = randomNre();
        String Nend = randomNend();
        return Nre + Nend;
    }

    private String randomNend() {
        if (size > 0) {
            return randomSh();
        } else {
            return "";
        }
    }

    private String randomSh() {
        size--;
        String ans = "|";
        ans += randomNre();
        ans += randomNend();
        return ans;
    }

    private String randomNre() {
        return randomOs() + randomNext();
    }

    private String randomOs() {
        return randomRE() + randomKlini();
    }

    private String randomRE() {
        if (size > 0 && size < 3) {
            size--;
            return "t";
        } else {
            int choose = random.nextInt(BORDER);
            String ans = "";
            if (choose > 1) {
                size--;
                ans += "t";
            } else {
                size -= 2;
                ans += "(";
                ans += randomS();
                ans += ")";
            }
            return ans;
        }
    }

    private String randomKlini() {
        int choose = random.nextInt(BORDER);
        if (choose < 2) {
            size--;
            return "*";
        } else {
            if (choose < BORDER / 3 * 2) {
                return "?";
            }
            return "";
        }
    }

    private String randomNext() {
        if (size > 0) {
            int choose = random.nextInt(BORDER);
            if (choose > 2) {
                return randomNreh();
            } else {
                return "";
            }

        } else {
            return "";
        }
    }

    private String randomNreh() {
        return randomOs() + randomNext();
    }
}
