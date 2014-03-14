/*
 * File: DrawLines.java
 * -----------------------
 * This program allows a user to draw lines to the canvas.
 */

import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

public class DrawLines extends GraphicsProgram {

    public void run() {
        addMouseListeners();
    }

    /** Called on mouse press to record the coordinates of the click */
    public void mousePressed(MouseEvent e) {
        line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
        add(line);
    }

    /** Called on mouse drag to reposition the object */
    public void mouseDragged(MouseEvent e) {
        if (line != null) line.setEndPoint(e.getX(), e.getY());
    }

    private GLine line;

}
