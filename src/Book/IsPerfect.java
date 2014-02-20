/*
 * File: IsPerfect.java
 * --------------------
 * This program prints if the given integer is perfect.
 */

import acm.program.*;

public class IsPerfect extends ConsoleProgram {

    public void run() {

        println("This program whether the given integer is perfect.");

        while (true) {
            int n = readInt("Enter and integer: ");
            if (n == 0) break;
            println(n + (isPerfect(n) ? " is " : " isn't ") + "perfect.");
        }

    }

    private boolean isPerfect(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;

    }

}
