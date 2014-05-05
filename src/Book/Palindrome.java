/*
 * File: Palindrome.java
 * ----------------------
 * This program determines if a string is a planidrome.
 */

import acm.program.*;

public class Palindrome extends ConsoleProgram {

    public void run() {
        println("This program determines if a string is a planidrome.");
        while (true) {
            String str = readLine("Enter any string: ");
            if (str.length() == 0) break;
            println(str + (isSentencePalindrome(str) ? " is a planidrome." : " isn't a planidrome."));
        }
    }

    private boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }

    private boolean isSentencePalindrome(String str) {
        return cleanString(str).equals(reverseString(cleanString(str)));
    }

    private String reverseString(String str) {
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
          reversed = str.charAt(i) + reversed;
        }
        return reversed;
    }

    private String cleanString(String str) {
        str = str.toLowerCase();
        String clean = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 96 && str.charAt(i) < 123) clean += str.charAt(i);
        }
        return clean;
    }

}
