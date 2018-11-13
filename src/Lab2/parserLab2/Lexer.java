package Lab2.parserLab2;

import java.io.IOException;

public class Lexer {

    public static TokenStream analyze(String input) throws IOException {
        TokenStream answer = new TokenStream();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isWhitespace(input.charAt(i))) {
                continue;
            }
            Character character = input.charAt(i);
            answer.add(new Token(character));
        }
        answer.add(new Token('#'));
        return answer;
    }
}
