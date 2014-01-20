/*
 * File: Fibonacci.java
 * Name: Ryan Linton
 * Section Leader: N/A
 * ---------------------------
 * This program prints the Fibonacci sequence.
 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

    private static final int MAX_TERM_VALUE = 10000;

    public void run() {
        println("This program lists the Fibonacci sequence.");
        println("0");
        println("1");

        int prev = 0;
        int term = 1;

        while ((term + prev) < MAX_TERM_VALUE) {
            int temp = term;
            term = term + prev;
            println(term);
            prev = temp;
        }
    }
}
