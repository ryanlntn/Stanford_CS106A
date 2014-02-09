/*
 * File: GoldenRatio.java
 * ----------------------
 * This program displays the value of the GoldenRatio
 */

import acm.program.*;

public class GoldenRatio extends ConsoleProgram {

    public void run() {
        double golden_ratio = (1 + Math.sqrt(5)) / 2;
        println("The value of the Golden Ratio is " + golden_ratio);
    }

}
