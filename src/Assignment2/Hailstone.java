/*
 * File: Hailstone.java
 * Name: Ryan Linton
 * Section Leader: N/A
 * --------------------
 * This program computes the Hailstone sequence.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
    
	public void run() {
		/*
		 * Pick some positive integer and call it n.
         * If n is even, divide it by two.
         * If n is odd, multiply it by three and add one.
         * Continue this process until n is equal to one.
         */

        int n = readInt("Enter a number: ");
        int t = 0;

        while (n != 1) {

            int old = n;

            if (n % 2 == 0) {
                n /= 2;
                println(old + " is even so I take half: " + n);
            } else {
                n = n * 3 + 1;
                println(old + " is odd, so I make 3n + 1: " + n);
            }

            t++;
        }

        println("The process took " + t + " to reach 1");

	}
}

