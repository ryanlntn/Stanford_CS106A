/*
 * File: RaiseIntToPower.java
 * --------------------
 * This program displays the nth value in the Fibonacci sequence.
 */

import acm.program.*;

public class RaiseIntToPower extends ConsoleProgram {

    public void run() {

        println("This program displays the powers of 2 from 2^0 to 2^10.");

        for (int k = 0; k <= 10; k++) {
            println("2^" + k + " = " + raiseIntToPower(2, k));
        }

    }

    private int raiseIntToPower(int n, int k) {

        int power = 1;

        for (int i = 0; i < k; i++) {
            power *= n;
        }

        return power;

    }

}
