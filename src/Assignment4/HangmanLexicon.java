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
        readLexiconFile();
    }

    /** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return words.size();
	}

    /** Returns the word at the specified index. */
	public String getWord(int index) {
		return words.get(index);
	}

    private void readLexiconFile() {
        File file = new File("/Users/ryanlntn/code/java/Stanford_CS106A/src/Assignment4/ShorterLexicon.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        words = new ArrayList<String>();

        String word = reader.readLine();

        while (word != null) {
            words.add(word);
            word = reader.readLine();
        }
    }

}
