package parser;

import java.io.IOException;

class Token {

    enum tokens {
        SYMBOL,     /*Symbols of alphabet*/
        LPAREN,     /* ( */
        RPAREN,     /* ) */
        KLINI,      /* * */
        OR,         /* | */
        END         /* End of regular expression */
    }

    private tokens token;
    private Character name;

    Token(Character name) throws IOException {
        this.name = name;
        switch (name) {
            case '(':
                token = tokens.LPAREN;
                break;
            case ')':
                token = tokens.RPAREN;
                break;
            case '*':
                token = tokens.KLINI;
                break;
            case '|':
                token = tokens.OR;
                break;
            case '#':
                token = tokens.END;
                break;
            default:
                if (!Character.isAlphabetic(name)) {
                    throw new IOException("Wrong symbol: " + name);
                }
                token = tokens.SYMBOL;
        }
    }

    public tokens get() {
        return token;
    }

    public String getName() {
        return name.toString();
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
