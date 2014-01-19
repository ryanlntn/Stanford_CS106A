/*
 * File: ProgramHierarchy.java
 * Name: Ryan Linton
 * Section Leader: N/A
 * ---------------------------
 * This program draws a diagram of the GraphicsProgram class hierarchy.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {

    private static final int BOX_WIDTH = 60;
    private static final int BOX_HEIGHT = 20;

	public void run() {
		add(new GRect(0, 0, BOX_WIDTH, BOX_HEIGHT));
	}
}

