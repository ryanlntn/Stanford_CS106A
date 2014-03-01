import acm.program.*;
import acm.util.*;

/**
 * This program administers a math quiz.
 */
public class MathQuiz extends ConsoleProgram {

    private static final int TOTAL_QUESTIONS = 5;
    private static final int MAX_ATTEMPTS = 3;

    public void run() {
        println("Welcome to Math Quiz");
        for (int i = 0; i < TOTAL_QUESTIONS; i++) {
            askQuestion();
        }
    }

    private void askQuestion() {
        int x = rand.nextInt(0, 20);
        int y = rand.nextInt(0, 20);
        int attempts = 0;

        if (rand.nextBoolean()) {
            int ans = readInt("What is " + x + " + " + y + "? ");
            while (ans != x + y) {
                attempts++;
                if (attempts == MAX_ATTEMPTS) {
                    println("No, the answer is " + (x + y) + ".");
                    return;
                }
                ans = readInt("That's incorrect - try a different answer: ");
            }
        } else {
            int ans = readInt("What is " + x + " - " + y + "? ");
            while (ans != x - y) {
                attempts++;
                if (attempts == MAX_ATTEMPTS) {
                    println("No, the answer is " + (x - y) + ".");
                    return;
                }
                ans = readInt("That's incorrect - try a different answer: ");
            }
        }
        giveKudos();
    }

    private void giveKudos() {
        int kudo = rand.nextInt(1, 6);
        switch (kudo) {
            case 1:
                println("That's the answer!");
                break;
            case 2:
                println("Correct!");
                break;
            case 3:
                println("Super!");
                break;
            case 4:
                println("Damn you're smart!");
                break;
            case 5:
                println("You got it!");
                break;
            default:
                println("Genius!");
                break;
        }
    }

    private RandomGenerator rand = new RandomGenerator();

}
