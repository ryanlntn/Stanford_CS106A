/*
 * File: InterestCalculator.java
 * ------------------------------
 * This program converts inches to centimeters.
 */

import acm.program.*;

public class InterestCalculator extends ConsoleProgram {

    public void run() {
        println("Interest calculation program");
        double balance = readDouble("Enter starting balance: ");
        double rate = readDouble("Enter annual interest rate: ");
        balance *= (1 + (rate / 100));
        println("Balance after one year = " + Math.round(balance * 100.0) / 100.0);
        balance *= (1 + (rate / 100));
        println("Balance after two years = " + Math.round(balance * 100.0) / 100.0);
    }

}