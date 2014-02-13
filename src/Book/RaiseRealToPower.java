/*
 * File: RaiseRealToPower.java
 * --------------------
 * This program displays the nth value in the Fibonacci sequence.
 */

import acm.program.*;

public class RaiseRealToPower extends ConsoleProgram {

    private static final double PI = 3.14159;

    public void run() {

        println("This program displays the powers of π from π^-4 to π^4.");

        for (int k = -4; k <= 4; k++) {
            println("π^" + k + " = " + raiseRealToPower(PI, k));
        }

    }

    private double raiseRealToPower(double x, int k) {

        double power = 1.0;

        for (int i = 0; i < Math.abs(k); i++) {
            power *= x;
        }

        if (k < 0) {
            power = 1 / power;
        }

        return power;

    }

}
