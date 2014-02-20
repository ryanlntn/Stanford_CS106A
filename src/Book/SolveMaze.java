/*
 * File: SolveMaze.java
 * --------------------
 * This program solves a maze using the right-hand rule.
 */

import acm.graphics.GLabel;
import acm.program.*;

public class SolveMaze extends GraphicsProgram {

    public void run() {

        add(new GLabel("This does nothing.", getWidth() / 2, getHeight() / 2));

    }

    private void solveMaze() {

        while (!isOutside()) {
            while (isFacingWall()) {
                turnRight();
            }
            moveForward();
            solveMaze();
        }

        add(new GLabel("We're outside!", 100, 100));

    }

    private void moveForward(){};     /* Move forward to the next square */
    private void turnRight(){};       /* Turn right without moving */
    //    private void turnLeft(){};        /* Turn left without moving */
    private boolean isFacingWall(){ return false; }; /* True if Theseus is facing a wall  */
    private boolean isOutside(){ return true; };    /* True if Theseus has left the maze */

}
