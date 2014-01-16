/*
 * File: CircleAreaCalc.java
 * ------------------------------
 * This program calculates the area of a circle given its radius.
 */

import acm.program.*;

public class CircleAreaCalc extends ConsoleProgram {

    public void run() {
        println("Circle area calculation program");
        double radius = readDouble("Enter radius: ");
        double area = PI * (radius * radius);
        println("Area = " + area);
    }

    private static final double PI = 3.14159265359;

}