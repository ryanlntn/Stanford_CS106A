/*
 * File: NDigits.java
 * -------------------
 * This program prints the number of digits in a given integer.
 */

import acm.program.*;

public class NDigits extends ConsoleProgram {

    public void run() {

        println("This program prints the number of digits in a given integer.");

        int n = readInt("Enter a positive integer: ");

        println("The number of digits in " + n + " is " + nDigits(n));

    }

    private int nDigits(int n) {

        int numberOfDigits = 0;

        while (n > 0) {
            numberOfDigits++;
            n /= 10;
        }

        return numberOfDigits;

    }

}