/*
 * File: Quadratic.java
 * ----------------------
 * This program solves the quadratic equation for
 * given a, b, and c values.
 */

import acm.program.*;

public class Quadratic extends ConsoleProgram {

    public void run() {
        println("Enter coefficients for the quadratic equation:");
        double a = readDouble("a: ");
        double b = readDouble("b: ");
        double c = readDouble("c: ");
        if (a <= 0) {
            println("There is no real solution.");
        } else {
            double x1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
            println("The first solution is " + x1);
            println("The second solution is " + x2);
        }
    }

}
