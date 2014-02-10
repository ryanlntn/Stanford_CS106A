/*
 * File: FibonacciN.java
 * --------------------
 * This program displays the nth value in the Fibonacci sequence.
 */

import acm.program.*;

public class FibonacciN extends ConsoleProgram {

    public void run() {
        println("This program displays the nth value in the Fibonnaci sequence.");
        int n = readInt("Please enter an n value: ");
        fibonacci(n);
    }

    private void fibonacci(int n) {
        int prev = 0;
        int term = 1;

        for (int i = 2; i <= n; i++) {
            int temp = term;
            term = term + prev;
            prev = temp;
        }

        println("F" + n + " = " + term);
    }

}
