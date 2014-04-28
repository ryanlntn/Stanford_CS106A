import acm.program.ConsoleProgram;

public class ScrabbleScore extends ConsoleProgram {

    public void run() {
        println(scoreWord("Farm"));
        println(scoreWord("Barn"));
        println(scoreWord("Booze"));
        println(scoreWord("Queen"));
        println(scoreWord("Zebra"));
    }

    private int scoreWord(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += scoreLetter(word.charAt(i));
        }
        return score;
    }

    private int scoreLetter(char letter) {
        switch (Character.toLowerCase(letter)) {
            case 'a': case 'e': case 'i': case 'l': case 'n':
            case 'o': case 'r': case 's': case 't': case 'u':
                return 1;
            case 'd': case 'g':
                return 2;
            case 'b': case 'c': case 'm': case 'p':
                return 3;
            case 'f': case 'h': case 'v': case 'w': case 'y':
                return 4;
            case 'k':
                return 5;
            case 'j': case 'x':
                return 8;
            case 'q': case 'z':
                return 10;
            default:
                return 0;
        }
    }

}
