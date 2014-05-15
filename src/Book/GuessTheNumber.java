/*
 * File: GuessTheNumber.java
 * ----------------------
 * This program guesses numbers between 1 and 100.
 */

import acm.program.*;

public class GuessTheNumber extends ConsoleProgram {

    public void run() {
        println("Think of a number between 1 and 100 and I'll guess it.");
        boolean guessed = readLine("Is it " + guess + "? ").equals("yes");
        while (!guessed) {
            String lessThan = readLine("Is it less than " + guess +"? ");
            if (lessThan.equals("yes")) {
                guess /= 2;
            } else if (lessThan.equals("no")) {
                guess += guess / 2;
            } else {
                println("hmmm...");
            }
            guessed = readLine("Is it " + guess + "? ").equals("yes");
        }
        println("I guessed the number!");
    }

    private int guess = 50;

}
