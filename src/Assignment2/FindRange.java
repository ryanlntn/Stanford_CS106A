/*
 * File: FindRange.java
 * Name: Ryan Linton
 * Section Leader: 
 * --------------------
 * This program finds the largest and smallest numbers from
 * those provided by the user. It reads numbers until the
 * sentinel value is read.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

    private static final int EXIT = 0;

	public void run() {

        println("This program finds the largest and smallest numbers.");

        int value = readInt("? ");

        if (value != 0) {
            int smallest = value;
            int largest = smallest;
            while (true) {
                value = readInt("? ");
                if (value == 0) {
                    break;
                }
                if (value > largest) {
                    largest = value;
                }
                if (value > 0 && value < smallest) {
                    smallest = value;
                }
            }
            println("smallest: " + smallest);
            println("largest: " + largest);

        } else {
            println("You gotta give me something to work with here...");
        }

	}

}

