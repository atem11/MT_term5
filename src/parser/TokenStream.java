package parser;

import java.util.ArrayList;
import java.util.List;

public class TokenStream {
    private List<Token> operations = new ArrayList<>();
    private int index = 0;

    public void reset() {
        index = 0;
    }

    public Token next() {
        return operations.get(index++);
    }

    public Token get() {
        return operations.get(index);
    }

    public int size() {
        return operations.size();
    }

    void add(Token t) {
        operations.add(t);
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        for (Token t : operations) {
            ans.append(t.getName());
            ans.append(" ");
        }
        return ans.toString();
    }
}