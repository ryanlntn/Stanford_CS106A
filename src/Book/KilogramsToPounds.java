/*
 * File: KilogramsToPounds.java
 * ------------------------------
 * This program converts kilogram weights to pounds and ounces.
 */

import acm.program.*;

public class KilogramsToPounds extends ConsoleProgram {

    public void run() {
        println("This program converts kilogram weights to pounds and ounces.");
        double kilograms = readDouble("Enter kilogram weight: ");
        double ounces = kilograms * 2.2 * 16.0;                    // Get total number of oz
        int pounds = (int) ounces / 16;                            // Get total number of lbs
        ounces %= 16.0;                                            // Get remaining oz after taking out lbs

        println(kilograms + " kg = " + pounds + " lbs " + ounces + " oz");
    }

}