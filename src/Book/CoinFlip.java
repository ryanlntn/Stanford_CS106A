import acm.program.*;
import acm.util.*;

/**
 * Simulate coin flips until three heads are tossed
 * then print the number of flips it took.
 */
public class CoinFlip extends ConsoleProgram {

    public void run() {

        int totalFlips = 0;
        int consecutiveHeads = 0;

        while (consecutiveHeads < 5) {

            String flip = flipCoin();
            println(flip);

            if (flip == "Heads") {
                consecutiveHeads++;
            } else {
                consecutiveHeads = 0;
            }

            totalFlips++;

        }

        println("It took " + totalFlips + " flips to get " + consecutiveHeads + " consecutive heads.");

    }

    private String flipCoin() {
        int random = rand.nextInt(0, 1);
        if (random == 0) {
            return "Heads";
        } else {
            return "Tails";
        }
    }

    /* Create an instance variable for the random number generator */
    private RandomGenerator rand = new RandomGenerator();

}
