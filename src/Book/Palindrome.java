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
            println(str + (isPalindrome(str) ? " is a planidrome." : " isn't a planidrome."));
        }
    }

    private boolean isPalindrome(String str) {
      return str.equals(reverseString(str));
    }

    private String reverseString(String str) {
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
          reversed = str.charAt(i) + reversed;
        }
        return reversed;
    }

}
