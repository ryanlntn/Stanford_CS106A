/*
 * File: GCTest.java
 * -------------------------
 * This program tests how much memory is freed during Garbage Collection
 */

import acm.program.*;

public class GCTest extends ConsoleProgram {

    public void run() {

        Runtime myRuntime = Runtime.getRuntime();

        println("Allocating 10000 Rational objects");
        for (int i = 0; i < 10000; i++) {
            new Rational();
        }

        long freeMemory = myRuntime.freeMemory();
        myRuntime.gc();
        long memoryfreed = myRuntime.freeMemory() - freeMemory;

        println("Garbage collection freed " + memoryfreed + " bytes");

    }

}
