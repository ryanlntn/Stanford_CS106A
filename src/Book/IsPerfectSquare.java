/*
 * File: IsPerfectSquare.java
 * -------------------
 * This program prints true or false if an integer is a perfect square.
 */

import acm.program.*;

public class IsPerfectSquare extends ConsoleProgram {

    public void run() {

        println("This program prints true or false if an integer is a perfect square.");

        while (true) {
            int n = readInt("Enter a positive integer: ");
            if (n <= 0) break;
            println(isPerfectSquare(n));
        }

    }

    private boolean isPerfectSquare(int n) {

        int root = (int) Math.sqrt(n);

        return (root * root) == n;
        
    }

}