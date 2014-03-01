import acm.program.*;
import acm.util.*;

/**
 * This program simulates radioactive decay.
 */
public class RadioactiveDecay extends ConsoleProgram {

    private static final int INITIAL_ATOMS= 10000;

    public void run() {
        println("There are " + INITIAL_ATOMS + " atoms initially");
        int atoms = INITIAL_ATOMS;
        int year = 0;
        while (atoms > 0) {
            atoms *= rand.nextDouble(0.45, 0.55);
            year++;
            println("There are " + atoms + " atoms at the end of year " + year);
        }
    }

    /* Create an instance variable for the random number generator */
    private RandomGenerator rand = new RandomGenerator();

}
