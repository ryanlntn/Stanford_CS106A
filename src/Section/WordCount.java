import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;

/**
 * This program counts lines, words, and characters in a file.
 */
public class WordCount extends ConsoleProgram {

    private int lines = 0;
    private int words = 0;
    private int chars = 2;

    public void run() {
        while (true) {
            String filename = readLine("File: ");
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                while(true) {
                    String line = reader.readLine();
                    if (line == null) break;
                    for (int i = 1; i < line.length(); i++) {
                        if (isAlphanumeric(line.toLowerCase().charAt(i - 1)) &&
                            !isAlphanumeric(line.toLowerCase().charAt(i))) {
                            words += 1;
                        }
                        chars += 1;
                    }
                    lines += 1;
                }
                reader.close();
                println("Lines = " + lines);
                println("Words = " + words);
                println("Chars = " + chars);
            } catch (IOException ex) {
                throw new ErrorException(ex);
            }
        }
    }

    private boolean isAlphanumeric(char chr) {
        return (chr >= 'a' && chr <= 'z') ||
               (chr >= 'A' && chr <= 'Z') ||
               (chr >= '0' && chr <= '9');
    }



}
