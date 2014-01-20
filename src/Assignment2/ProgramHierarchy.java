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
        // Chart origin
        int x = (getWidth() - (BOX_WIDTH * 3 + 40)) / 2;
        int y = (getHeight() - BOX_HEIGHT * 3) / 2;

		drawClassBox(x + BOX_WIDTH + 20, y, "Program");
        drawClassBox(x, y + BOX_HEIGHT * 2, "GraphicsProgram");
        drawClassBox(x + BOX_WIDTH + 20, y + BOX_HEIGHT * 2, "ConsoleProgram");
        drawClassBox(x + (BOX_WIDTH + 20) * 2, y + BOX_HEIGHT * 2, "DialogProgram");

        add(new GLine(x + (BOX_WIDTH * 3 + 40) / 2, y + BOX_HEIGHT, x + BOX_WIDTH / 2, y + BOX_HEIGHT * 2));
        add(new GLine(x + (BOX_WIDTH * 3 + 40) / 2, y + BOX_HEIGHT, x + (BOX_WIDTH * 3 + 40) / 2, y + BOX_HEIGHT * 2));
        add(new GLine(x + (BOX_WIDTH * 3 + 40) / 2, y + BOX_HEIGHT, x + (BOX_WIDTH * 3 + 40) - (BOX_WIDTH / 2), y + BOX_HEIGHT * 2));
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

