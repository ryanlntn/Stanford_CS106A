import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class RandomWord extends ConsoleProgram {

    private static final int MIN_LETTERS = 3;
    private static final int MAX_LETTERS = 8;

    public void run() {
        for (int i = 0; i < 5; i++) {
            println(randomWord());
        }
    }

    private String randomWord() {
        String word = "";
        for (int i = 0; i < rand.nextInt(MIN_LETTERS, MAX_LETTERS); i++) {
            word += randomChar();
        }
        return word;
    }

    private char randomChar() {
        return (char) rand.nextInt('A', 'Z');
    }

    /* Create an instance variable for the random number generator */
    private RandomGenerator rand = new RandomGenerator();

}
