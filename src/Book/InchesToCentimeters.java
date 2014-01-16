/*
 * File: InchesToCentimeters.java
 * ------------------------------
 * This program converts inches to centimeters.
 */

import acm.program.*;

public class InchesToCentimeters extends ConsoleProgram {

    public void run() {
        println("This program converts feet and inches to centimeters.");
        double feet = readDouble("Enter number of feet: ");
        double inches = readDouble("Enter number of inches: ");
        double cm = (feet * 12 + inches) * CENTIMETERS_PER_INCH;
        println(feet + "ft " + inches + "in = " + cm + "cm");
    }

    private static final double CENTIMETERS_PER_INCH = 2.54;

}