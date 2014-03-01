import acm.program.*;
import acm.util.*;

/**
 * This program displays a randomly chosen card.
 */
public class RandomCard extends ConsoleProgram {

    /* Run the program */
    public void run() {
        println("This program displays a randomly chosen card.");
        println(randomRank() + " of " + randomSuit());
    }

    private String randomSuit() {
        int randomInt = rand.nextInt(1, 4);
        String suit;
        switch (randomInt) {
            case 1:
                suit = "Diamonds";
                break;
            case 2:
                suit = "Hearts";
                break;
            case 3:
                suit = "Spades";
                break;
            default:
                suit = "Clubs";
                break;
        }
        return suit;
    }

    private String randomRank() {
        int randomInt = rand.nextInt(1, 13);
        String rank;
        switch (randomInt) {
            case 1:
                rank = "Ace";
                break;
            case 11:
                rank = "Jack";
                break;
            case 12:
                rank = "Queen";
                break;
            case 13:
                rank = "King";
                break;
            default:
                rank = String.valueOf(randomInt);
                break;
        }
        return rank;

    }

    /* Create an instance variable for the random number generator */
    private RandomGenerator rand = new RandomGenerator();

}
