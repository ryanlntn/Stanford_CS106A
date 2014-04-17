/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;

public class Hangman extends ConsoleProgram {

    private HangmanLexicon lexicon;
    private String word;
    private int remainingGuesses = 8;

    public void run() {
		/* You fill this in */
        lexicon = new HangmanLexicon();
        word = lexicon.getWord(0);
        println("Welcome to Hangman!");
        println("The word now looks like this: " + obfuscatedWord());
        println("You have " + remainingGuesses + " guesses left.");
        String guess = readLine("Your guess: ").toUpperCase();
        println(guess);
	}

    private String obfuscatedWord() {
        String dashedWord = "";
        for (int i = 0; i < word.length(); i++) {
            dashedWord += "-";
        }
        return dashedWord;
    }



}
