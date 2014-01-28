/*
 * File: AverageList.java
 * -------------------------
 * This program reads integers one per line until the
 * user enters a special sentinel value to signal the
 * end of the input.  At that point, the program
 * prints out the average of the numbers entered so far.
 */

import acm.program.*;

public class AverageList extends ConsoleProgram {

    /* Specifies the value of the sentinel */
    private static final int SENTINEL = -1;

    /* Runs the program */
    public void run() {
        println("This program averages a list of integers.");
        println("Enter values, one per line, using " + SENTINEL);
        println("to signal the end of the list.");

        int total = 0;
        int n = 0;

        while (true) {
            int value = readInt(" ? ");
            if (value == SENTINEL) break;
            total += value;
            n++;
        }

        println("The average is " + (total / n) + ".");
    }

}