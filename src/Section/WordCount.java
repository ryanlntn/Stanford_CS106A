import java.io.BufferedReader;
import java.io.FileReader;

import acm.program.ConsoleProgram;

/**
 * This program counts lines, words, and characters in a file.
 */
public class WordCount extends ConsoleProgram {

    private int lines = 0;
    private int words = 0;
    private int chars = 0;

    public void run() {
        while (true) {
            String filename = readLine("File: ");
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            while(true) {
                String line = reader.readLine();
                if (line == null) break;
                for (int i = 0; i < line.length(); i++) {
                    chars += 1;
                }
                lines += 1;
            }
            reader.close();
            println("Lines = " + lines);
            println("Words = " + words);
            println("Chars = " + chars);
        }
    }



}
