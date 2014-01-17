/*
 * File: Pyramid.java
 * Name: Ryan Linton
 * Section Leader: N/A
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
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
        int x = (getWidth() - (BRICKS_IN_BASE * BRICK_WIDTH)) / 2;
        int y = getHeight() - BRICK_HEIGHT;
		add(new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT));
	}
}

