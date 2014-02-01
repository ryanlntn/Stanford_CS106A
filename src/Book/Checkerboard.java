/*
 * File: Checkerboard.java
 * Name: Ryan Linton
 * Section Leader: N/A
 * ---------------------------
 * This program draws a checkerboard.
 */

import acm.program.*;
import acm.graphics.*;

public class Checkerboard extends GraphicsProgram {

    public void run() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                add(new GRect(j * 40, i * 40, 40, 40));
                if ((i % 2 == 1 && j % 2 == 0) || (i % 2 == 0 && j % 2 == 1)) {
                    add(new GOval(j * 40 + 5, i * 40 + 5, 30, 30));
                }
            }
        }
    }

}
