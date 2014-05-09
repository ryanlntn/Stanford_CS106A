import acm.program.ConsoleProgram;
import acm.util.*;
import java.io.*;

/**
 * This program creates a histogram from text file data.
 */

public class Histogram extends ConsoleProgram {

    private int[] distribution = {0,0,0,0,0,0,0,0,0,0,0};

    public void run() {
        readScores();
        displayHistogram();
    }

    private void readScores() {
        try {
            FileReader fr = new FileReader("/Users/ryanlntn/Code/Java/Stanford_CS106A/src/Section/MidtermScores.txt");
            BufferedReader reader = new BufferedReader(fr);
            while(true) {
                String line = reader.readLine();
                if (line == null) break;
                distributeScore(Integer.parseInt(line));
            }
        } catch (IOException ex) {
            throw new ErrorException(ex);
        }
    }

    private void distributeScore(int score) {
        if (score < 10) {
            distribution[0] += 1;
        } else if (score < 20) {
            distribution[1] += 1;
        } else if (score < 30) {
            distribution[2] += 1;
        } else if (score < 40) {
            distribution[3] += 1;
        } else if (score < 50) {
            distribution[4] += 1;
        } else if (score < 60) {
            distribution[5] += 1;
        } else if (score < 70) {
            distribution[6] += 1;
        } else if (score < 80) {
            distribution[7] += 1;
        } else if (score < 90) {
            distribution[8] += 1;
        } else if (score < 100) {
            distribution[9] += 1;
        } else {
            distribution[10] += 1;
        }
    }

    private void displayHistogram() {
        println("00-09: " + starify(distribution[0]));
        println("10-19: " + starify(distribution[1]));
        println("20-29: " + starify(distribution[2]));
        println("30-39: " + starify(distribution[3]));
        println("40-49: " + starify(distribution[4]));
        println("50-59: " + starify(distribution[5]));
        println("60-69: " + starify(distribution[6]));
        println("70-79: " + starify(distribution[7]));
        println("80-89: " + starify(distribution[8]));
        println("90-99: " + starify(distribution[9]));
        println("  100: " + starify(distribution[10]));
    }

    private String starify(int n) {
        String stars = "";
        for (int i = 0; i < n; i++) {
            stars += "*";
        }
        return stars;
    }

}
