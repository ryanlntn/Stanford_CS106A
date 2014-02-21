/*
 * File: IsPerfect.java
 * --------------------
 * This program lists the prefect numbers from in 1 to 9999.
 */

import acm.program.*;

public class IsPerfect extends ConsoleProgram {

    public void run() {

        println("This program lists the prefect numbers from in 1 to 9999:");

        for (int i = 1; i < 10000; i++) {
            if (isPerfect(i)) println(i);
        }

    }

    private boolean isPerfect(int n) {

        if (n % 2 == 0) {
            int sumOfDivisors = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) sumOfDivisors += i;
            }

            return sumOfDivisors == n;
        }

        return false;

    }

}
