/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {
        fillRowWithBeepers();
        pickEndBeepers();
    }

    /*
     * Put a beeper on every corner of the St. except the first and last corners.
     * Pre-condition: Be in home position (1st St. and 1st Ave.) facing east.
     * Post-condition: Beepers are on each corner of 1st St. except the first and last corner.
     *                 Karel is on the last corner of 1st St. facing east.
     */
    private void fillRowWithBeepers() {
        move();
        while(frontIsClear()) {
            putBeeper();
            move();
        }
    }

    /*
     * Recursively remove beepers from the end of each St. of beepers until Karel finds the
     * midpoint of the St. Then put Beeper on midpoint.
     */
    private void pickEndBeepers() {
        turnAround();
        move();
        if (beepersPresent()) {
            pickBeeper();
            move();
            while (beepersPresent()) {
                move();
            }
            pickEndBeepers();
        } else {
            putBeeper();
        }
    }
}
