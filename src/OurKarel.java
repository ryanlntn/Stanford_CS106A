/*
 * File: OurKarel.java
 * -----------------------------
 * The OurKarel class extends the basic Karel class
 * by defining a "run" method with three commands.  These
 * commands cause Karel to move forward three blocks.
 */

import stanford.karel.*;

public class OurKarel extends Karel {
    public void run() {
        move();
        turnLeft();
        move();
        move();
    }
}