/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will reimplement for Part III of the assignment.
 */

import java.io.*;
import java.util.*;

public class HangmanLexicon {

    private List<String> words;

    public HangmanLexicon() {
        File file = new File("ShorterLexicon.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        words = new ArrayList<String>();

        String word = reader.readLine();

        while (word != null) {
            words.add(word);
            word = reader.readLine();
        }
    }

    /** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return words.size();
	}

    /** Returns the word at the specified index. */
	public String getWord(int index) {
		return words.get(index);
	}

}
