/*
 * File: Target.java
 * Name: Ryan Linton
 * Section Leader: N/A
 * -----------------
 * This program draws the Target logo to the screen.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	

    // Circle diameters in pixels
    private static final int OUTER_SIZE = 72;
    private static final int WHITE_SIZE = (int) (72 * 0.65);
    private static final int INNER_SIZE = (int) (72 * 0.3);

    public void run() {
		GOval outer = new GOval((getWidth() - OUTER_SIZE) / 2, (getHeight() - OUTER_SIZE) / 2, OUTER_SIZE, OUTER_SIZE);
        GOval white = new GOval((getWidth() - WHITE_SIZE) / 2, (getHeight() - WHITE_SIZE) / 2, WHITE_SIZE, WHITE_SIZE);
        GOval inner = new GOval((getWidth() - INNER_SIZE) / 2, (getHeight() - INNER_SIZE) / 2, INNER_SIZE, INNER_SIZE);

        outer.setColor(Color.RED);
        outer.setFilled(true);
        outer.setFillColor(Color.RED);
        white.setColor(Color.WHITE);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        inner.setColor(Color.RED);
        inner.setFilled(true);
        inner.setFillColor(Color.RED);

        add(outer);
        add(white);
        add(inner);
	}


}
