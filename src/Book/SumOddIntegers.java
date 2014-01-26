/*
 * File: SumOddIntegers.java
 * -------------------
 * This program sums the odd integers from 0 to n.
 */

import acm.program.*;

public class SumOddIntegers extends ConsoleProgram {

    public void run() {
        println("This program sums the odd integers from 0 to n.");
        int n = readInt("Please enter an number n: ");
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        println("The sum of the odd integers from 0 to " + n + " is " + sum + ".");
    }

}
