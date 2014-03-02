import acm.program.*;
import acm.util.*;

/**
 * Something
 */
public class Card extends ConsoleProgram {

    /* Suits */
    private static final int CLUBS = 1;
    private static final int SPADES = 2;
    private static final int HEARTS = 3;
    private static final int DIAMONDS = 4;

    /* Ranks */
    private static final int ACE = 1;
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;

    public void run() {

    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    public String toString() {
        return this.rank + " of " + this.suit;
    }

    private int suit;
    private int rank;

}
