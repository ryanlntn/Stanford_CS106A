/*
 * File: PascalsTriangle.java
 * -----------------------
 * This program displays Pascal's Triangle.
 */

import acm.graphics.*;
import acm.program.*;

public class PascalsTriangle extends GraphicsProgram {

    public void run() {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= i; j++) {
                add(new GLabel("C(" + i + "," + j + ")"), 40 * j + getWidth() / 2 - 20 * i, i * 20 + 100);
            }
        }

    }

}