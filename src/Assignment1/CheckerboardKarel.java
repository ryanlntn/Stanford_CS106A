/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

    public void run() {
        if (frontIsClear()) {
            while (frontIsClear()) {
                checkerRow();
                moveUpAndOffset();
            }
        } else {
            turnLeft();
            while (frontIsClear()) {
                checkerRow();
                moveUpAndOffset();
            }
        }
    }

    private void checkerRow() {
        putBeeper();
        while (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                putBeeper();
            }
        }
    }

    private void moveUpAndOffset() {
        if (beepersPresent()) {
            moveUpRow();
            if (frontIsClear()) {
                move();
            }
        } else {
            moveUpRow();
        }
    }

    private void moveUpRow() {
        if (facingWest() && rightIsClear()) {
            turnRight();
            move();
            turnRight();
        } else {
            if (facingEast() && leftIsClear()) {
                turnLeft();
                move();
                turnLeft();
            }
        }
    }
}
