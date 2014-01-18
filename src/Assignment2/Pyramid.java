/*
 * File: Pyramid.java
 * Name: Ryan Linton
 * Section Leader: N/A
 * ------------------
 * This program draws a pyramid of bricks (GRect objects)
 * to the screen. Brick width, height, and the number of
 * bricks in the base may be adjusted. The pyramid will
 * appear centered at the bottom of the screen.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {

        // Get initial x and y values for the first brick
        int x = (getWidth() - (BRICKS_IN_BASE * BRICK_WIDTH)) / 2;
        int y = getHeight() - BRICK_HEIGHT;

        // Set number of bricks in row so we can decrement later
        int bricksInRow = BRICKS_IN_BASE;

        while (bricksInRow > 0) {

            // Lay row of bricks
            for (int brick = 0; brick < bricksInRow; brick++) {
                add(new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT));
                x += BRICK_WIDTH;
            }

            // Decrement number of bricks in row
            bricksInRow--;

            // Adjust x and y to center next row of bricks
            x = (getWidth() - (bricksInRow * BRICK_WIDTH)) / 2;
            y -= BRICK_HEIGHT;
        }
	}
}

