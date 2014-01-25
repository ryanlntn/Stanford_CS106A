/*
 * File: NinetyNineBottles.java
 * --------------------
 * This program generates the lyrics to 99 Bottles of Beer on the Wall.
 */

import acm.program.*;

public class NinetyNineBottles extends ConsoleProgram {

    private static final int BOTTLES = 99;

    public void run() {
        for (int i = BOTTLES; i > 0; i--) {
            println(i + " bottles of beer on the wall.");
            println(i + " bottles of beer.");
            println("You take one down, pass it around. " + (i - 1) + " bottles of beer on the wall.");
        }
        println("BEER RUN!!!");
    }

}