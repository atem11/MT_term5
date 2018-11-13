package Lab2.parserLab2;

import java.io.IOException;

public class Parser {
    private TokenStream stream;

    public Tree parse(String input) throws IOException {
        stream = Lexer.analyze(input);
        Tree ans = parseS();
        if (stream.next().get() == Token.tokens.END) {
            return ans;
        } else {
            throw new IOException("Expression have no END literal");
        }
    }

    private Tree parseS() throws IOException {
        Tree tree = new Tree("S");
        Token token = stream.get();
        switch (token.get()) {
            case SYMBOL:
            case LPAREN:
                tree.addChildren(parseNre());
                tree.addChildren(parseNend());
                break;
            default:
                throw new IOException("Wrong symbol: " + token.getName());
        }
        return tree;
    }

    private Tree parseSh() throws IOException {
        Tree tree = new Tree("S'");
        Token token = stream.get();
        switch (token.get()) {
            case OR:
                stream.next();
                tree.addChildren(new Tree(token.getName(), true));
                tree.addChildren(parseNre());
                tree.addChildren(parseNend());
                break;
            default:
                throw new IOException("Wrong symbol: " + token.getName());
        }
        return tree;
    }


    private Tree parseNre() throws IOException {
        Tree tree = new Tree("Nre");
        Token token = stream.get();
        switch (token.get()) {
            case SYMBOL:
            case LPAREN:
                tree.addChildren(parseOs());
                tree.addChildren(parseNext());
                break;
            default:
                throw new IOException("Wrong symbol: " + token.getName());
        }
        return tree;
    }

    private Tree parseNreh() throws IOException {
        Tree tree = new Tree("Nre'");
        Token token = stream.get();
        switch (token.get()) {
            case SYMBOL:
            case LPAREN:
                tree.addChildren(parseOs());
                tree.addChildren(parseNext());
                break;
            default:
                throw new IOException("Wrong symbol: " + token.getName());
        }
        return tree;
    }

    private Tree parseNext() throws IOException {
        Tree tree = new Tree("Next");
        Token token = stream.get();
        switch (token.get()) {
            case SYMBOL:
            case LPAREN:
                tree.addChildren(parseNreh());
                break;
            case END:
            case RPAREN:
            case OR:
                tree.addChildren(new Tree("Eps", true));
                break;
            default:
                throw new IOException("Wrong symbol: " + token.getName());
        }
        return tree;
    }

    private Tree parseNend() throws IOException {
        Tree tree = new Tree("Nend");
        Token token = stream.get();
        switch (token.get()) {
            case OR:
                tree.addChildren(parseSh());
                break;
            case END:
            case RPAREN:
                tree.addChildren(new Tree("Eps", true));
                break;
            default:
                throw new IOException("Wrong symbol: " + token.getName());
        }
        return tree;
    }

    private Tree parseOs() throws IOException {
        Tree tree = new Tree("Os");
        Token token = stream.get();
        switch (token.get()) {
            case SYMBOL:
            case LPAREN:
                tree.addChildren(parseRE());
                tree.addChildren(parseKlini());
                break;
            default:
                throw new IOException("Wrong symbol: " + token.getName());
        }
        return tree;
    }

    private Tree parseKlini() {
        Tree tree = new Tree("Klini");
        Token token = stream.get();
        switch (token.get()) {
            case KLINI:
                stream.next();
                tree.addChildren(new Tree(token.getName(), true));
                break;
            default:
                tree.addChildren(new Tree("Eps", true));
        }
        return tree;
    }

    private Tree parseRE() throws IOException {
        Tree tree = new Tree("RE");
        Token token = stream.get();
        switch (token.get()) {
            case SYMBOL:
                stream.next();
                tree.addChildren(new Tree(token.getName(), true));
                break;
            case LPAREN:
                stream.next();
                Tree tmp = parseS();
                switch (stream.get().get()) {
                    case RPAREN:
                        stream.next();
                        tree.addChildren(new Tree("(", true));
                        tree.addChildren(tmp);
                        tree.addChildren(new Tree(")", true));
                        break;
                    default:
                        throw new IOException("Wrong symbol: " + token.getName());
                }
                break;
            default:
                throw new IOException("Wrong symbol: " + token.getName());
        }
        return tree;
    }
}
