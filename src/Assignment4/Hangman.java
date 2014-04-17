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
    private String actualWord;
    private String guessedWord;
    private int remainingGuesses = 8;
    private RandomGenerator rand = RandomGenerator.getInstance();

    public void run() {
        lexicon = new HangmanLexicon();
        actualWord = lexicon.getWord(rand.nextInt(0, lexicon.getWordCount() - 1));
        guessedWord = hideWord(actualWord);
        println("Welcome to Hangman!");
        while (true) {
            if (remainingGuesses == 0 || isWordGuessed()) break;

            println("The word now looks like this: " + guessedWord);
            println("You have " + remainingGuesses + " guesses left.");

            String guess = readLine("Your guess: ").toUpperCase();
            println("Your guess: " + guess);
            takeGuess(guess);
            println("There are no " + guess + "'s in the word.");

            remainingGuesses--;
        }
	}

    private String hideWord(String originalWord) {
        String dashedWord = "";
        for (int i = 0; i < originalWord.length(); i++) {
            dashedWord += "-";
        }
        return dashedWord;
    }

    private boolean isWordGuessed() {
        return actualWord.equals(guessedWord);
    }

    private void takeGuess(String guess) {
        String newGuessedWord = "";
        for (int i = 0; i < actualWord.length(); i++) {
            if (actualWord.substring(i, i + 1).equals(guess)) {
                newGuessedWord += guess;
            } else {
                newGuessedWord += "-";
            }
        }
        guessedWord = newGuessedWord;
    }



}
