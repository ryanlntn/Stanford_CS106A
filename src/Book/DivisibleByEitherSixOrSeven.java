/*
 * File: DivisibleByEitherSixOrSeven.java
 * -------------------
 * This program displays the integers between 1 and 100
 * that are divisible by either 6 or 7.
 */

import acm.program.*;

public class DivisibleByEitherSixOrSeven extends ConsoleProgram {

    private static final int UPPER_BOUND = 100;

    public void run() {
        println(
                "This program displays the integers between 1 and "
                        + UPPER_BOUND +
                        " that are divisible by either 6 or 7 but not both."
        );
        for (int i = 1; i <= 100; i++) {
            if ((i % 6 == 0 && i % 7 != 0) || (i % 6 != 0 && i % 7 == 0)) println(i);
        }
    }

}
