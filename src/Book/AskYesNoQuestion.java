/*
 * File: AskYesNoQuestion.java
 * -------------------
 * This program prints true or false if an integer is a perfect square.
 */

import acm.program.*;

public class AskYesNoQuestion extends ConsoleProgram {

    public void run() {
        println(askYesNoQuestion("Would you like instructions"));
    }

    private boolean askYesNoQuestion(String str) {

        String ans = readLine(str + "? ");

        if (ans.equals("yes") || ans.equals("Yes")) {
            return true;
        } else if (ans.equals("no") || ans.equals("No")) {
            return false;
        } else {
            println("Please answer yes or no.");
            return askYesNoQuestion(str);
        }

    }

}