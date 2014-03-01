import acm.program.*;
import acm.util.*;

/**
 * This program attempts to approximate pi by
 * simulating throwing darts at a dart board.
 */
public class DartBoard extends ConsoleProgram {

    private static final int BOARD_WIDTH = 1000;
    private static final int THROWS = 10000;

    public void run() {

        int hits = 0;

        for (int i = 0; i < THROWS; i++) {
            int x = rand.nextInt(0, BOARD_WIDTH);
            int y = rand.nextInt(0, BOARD_WIDTH);
            if (((x * x) + (y * y)) < 1) hits++;
        }

        double pi = (double) hits / THROWS * 4.0;

        println(hits);
        println("After simulating " + THROWS + " throws we approximate pi to be: " + pi);

    }

    /* Create an instance variable for the random number generator */
    private RandomGenerator rand = new RandomGenerator();

}
