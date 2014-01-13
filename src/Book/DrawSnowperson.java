/*
 * File: DrawSnowperson.java
 * --------------------
 * This program draws a simple snowperson diagram in the window.
 * Its programming style leaves much to be desired, mostly because
 * the coordinate values are specified explicitly and not defined
 * so that they automatically adjust according to specified
 * parameters of the image as a whole. You will learn how to
 * improve the style in Chapter 7.
 */

import acm.graphics.*;
import acm.program.*;

public class DrawSnowperson extends GraphicsProgram {
    public void run() {
        drawBody();
        drawFace();
    }

    private void drawFace() {
        // Face starts at 350x100 and goes to 400x150
        add(new GOval(360, 120, 5, 5));
        add(new GOval(390, 120, 5, 5));
        add(new GOval(370, 130, 10, 10));
        add(new GLabel("V"), 373, 120);
    }

    private void drawBody() {
        add(new GOval(350, 100, 50, 50));
        add(new GOval(325, 150, 100, 100));
        add(new GOval(300, 250, 150, 150));
    }
}