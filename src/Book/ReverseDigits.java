/*
 * File: ReverseDigits.java
 * -------------------
 * This program reverses the digits in an integer.
 */

import acm.program.*;

public class ReverseDigits extends ConsoleProgram {

    public void run() {
        println("This program reverses the digits in an integer.");

        int n = readInt("Enter a positive integer: ");
        String reverse = "";

        while (n > 0) {
            reverse += n % 10;
            n /= 10;
        }

        println("The reversed number is " + reverse);
    }

}