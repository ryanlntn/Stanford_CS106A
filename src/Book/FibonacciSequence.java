/*
 * File: FibonacciSequence.java
 * --------------------
 * This program displays the values in the Fibonacci sequence.
 */

import acm.program.*;

public class FibonacciSequence extends ConsoleProgram {

    private static final int F = 15;

    public void run() {
        println("This program displays the values in the Fibonacci sequence from F0 to F" + F);
        println("F0 = 0");
        println("F1 = 1");

        int prev = 0;
        int term = 1;

        for (int i = 2; i <= F; i++) {
            int temp = term;
            term = term + prev;
            println("F" + i + " = " + term);
            prev = temp;
        }
    }

}
