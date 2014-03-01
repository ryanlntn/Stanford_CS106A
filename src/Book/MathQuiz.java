import acm.program.*;
import acm.util.*;

/**
 * This program administers a math quiz.
 */
public class MathQuiz extends ConsoleProgram {

    private static final int TOTAL_QUESTIONS = 5;
    private static final int MAX_ATTEMPTS = 3;

    public void run() {
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
        println("That's the answer!");
    }

    private RandomGenerator rand = new RandomGenerator();

}
