/*
 * File: IsPrime.java
 * --------------------
 * This program prints if the given integer is prime.
 */

import acm.program.*;

public class IsPrime extends ConsoleProgram {

    public void run() {

        println("This program prints true if the given integer is prime, false otherwise.");

        while (true) {
            int n = readInt("Enter and integer: ");
            if (n == 0) break;
            println(n + (isPrime(n) ? " is " : " isn't ") + "prime.");
        }
        
    }

    private boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;

    }

}
