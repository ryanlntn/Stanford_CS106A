/*
 * File: PythagoreanTheorem.java
 * Name: Ryan Linton
 * Section Leader: N/A
 * -----------------------------
 * This program computes the Pythagorean theorem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {

	public void run() {
        println("Enter values to compute Pythagorean theorem.");
		double a = readDouble("a: ");
        double b = readDouble("b: ");
        double c = Math.sqrt((a * a) + (b * b));
        println("c = " + c);
	}

}
