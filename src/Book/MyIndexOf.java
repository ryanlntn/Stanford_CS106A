/*
 * File: MyIndexOf.java
 * -----------------------
 * This program adds a predefined number of integers and
 * then prints the sum at the end.  To change the number
 * of integers, change the definition of NVALUES.
 */

import acm.program.*;

public class MyIndexOf extends ConsoleProgram {

    public void run() {
        println("This program finds the index of a letter in a word.");

        String word = readLine("Enter the word: ");
        char letter = readLine("Enter the letter you'd like the index of: ").charAt(0);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                println("The index of " + letter + " is " + i);
            }
        }
    }

}
