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

    private static final int BOX_WIDTH = 120;
    private static final int BOX_HEIGHT = 40;

	public void run() {
		drawClassBox(0, 0, "Program");
	}

    // Draws a box with a centered label
    private void drawClassBox(int x, int y, String name) {
        GRect box = new GRect(x, y, BOX_WIDTH, BOX_HEIGHT);
        GLabel label = new GLabel(name, x, y);
        label.move((BOX_WIDTH - label.getWidth()) / 2, BOX_HEIGHT - label.getHeight());
        add(box);
        add(label);
    }
}

