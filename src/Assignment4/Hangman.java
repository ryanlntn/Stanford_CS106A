/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.program.*;
import acm.util.*;

public class Hangman extends ConsoleProgram {

    private HangmanLexicon lexicon;
    private HangmanCanvas canvas;
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
            canvas.displayWord(guessedWord);

            if (remainingGuesses == 0 || isWordGuessed()) break;

            println("The word now looks like this: " + guessedWord);
            println("You have " + remainingGuesses + " guesses left.");

            String guess = readGuess();

            if (hitsFor(guess) > 0) {
                println("That guess is correct.");
            } else {
                println("There are no " + guess + "'s in the word.");
                canvas.noteIncorrectGuess(guess);
                remainingGuesses--;
            }
        }

        closingMessage();
	}

    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        canvas.reset();
    }

    private void closingMessage() {
        if (isWordGuessed()) {
            println("You guessed the word: " + actualWord);
            println("You win.");
        } else {
            println("You're completely hung.");
            println("The word was: " + actualWord);
            println("You lose.");
        }
    }

    private String readGuess() {
        String guess = readLine("Your guess: ").toUpperCase();
        while (guess.length() != 1) {
            println("That guess is illegal. Please guess again.");
            guess = readLine("Your guess: ").toUpperCase();
        }
        return guess;
    }

    private String hideWord(String originalWord) {
        String dashedWord = "";
        for (int i = 0; i < originalWord.length(); i++) {
            dashedWord += "-";
        }
        return dashedWord;
    }

    private boolean isWordGuessed() {
        return this.actualWord.equals(guessedWord);
    }

    private int hitsFor(String guess) {
        String newGuessedWord = "";
        int hits = 0;
        for (int i = 0; i < actualWord.length(); i++) {
            if (actualWord.substring(i, i + 1).equals(guess)) {
                newGuessedWord += guess;
                hits += 1;
            } else {
                newGuessedWord += guessedWord.substring(i, i + 1);
            }
        }
        guessedWord = newGuessedWord;
        return hits;
    }



}
