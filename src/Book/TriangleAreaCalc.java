/*
 * File: TriangleAreaCalc.java
 * --------------------
 * This console program calculates the area of a triangle after
 * obtaining the base and height of that triangle from the user.
 */

import acm.program.*;

public class TriangleAreaCalc extends ConsoleProgram {
    public void run() {
        println("This program calculates the area of a triangle.");
        double b = readDouble("Enter base: ");
        double h = readDouble("Enter height: ");
        double a = (b * h) / 2;
        println("Triangle's area = " + a);
    }
}
