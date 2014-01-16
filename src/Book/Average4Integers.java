/*
 * File: Average4Integers.java
 * ----------------------
 * This program averages four integer numbers.
 */

import acm.program.*;

public class Average4Integers extends ConsoleProgram {

    public void run() {
        println("This program averages four integers.");
        int n1 = readInt("Enter n1: ");
        int n2 = readInt("Enter n2: ");
        int n3 = readInt("Enter n3: ");
        int n4 = readInt("Enter n4: ");
        int average = (n1 + n2 + n3 + n4) / 4;
        println("The average is " + average + ".");
    }

}