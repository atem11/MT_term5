package Lab2.parserLab2;

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
                if (((((1 << Character.LOWERCASE_LETTER) >> Character.getType(name)) & 1) != 0)) {
                    token = tokens.SYMBOL;
                } else {
                    throw new IOException("Wrong symbol: " + name);
                }
                /*if (!Character.isAlphabetic(name)) {
                    throw new IOException("Wrong symbol: " + name);
                }
                token = tokens.SYMBOL;*/
        }
    }

    tokens get() {
        return token;
    }

    String getName() {
        return name.toString();
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
