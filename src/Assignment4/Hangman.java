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
    private RandomGenerator rand = RandomGenerator.getInstance();

    public void run() {
        lexicon = new HangmanLexicon();
        word = lexicon.getWord(rand.nextInt(0, lexicon.getWordCount()));
        println("Welcome to Hangman!");
        while (true) {
            if (remainingGuesses == 0) break;
            println("The word now looks like this: " + obfuscatedWord());
            println("You have " + remainingGuesses + " guesses left.");
            String guess = readLine("Your guess: ").toUpperCase();
            println("Your guess: " + guess);
            println("There are no " + guess + "'s in the word.");
            remainingGuesses--;
        }
	}

    private String obfuscatedWord() {
        String dashedWord = "";
        for (int i = 0; i < word.length(); i++) {
            dashedWord += "-";
        }
        return dashedWord;
    }



}
