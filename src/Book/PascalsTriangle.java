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
                add(new GLabel("C(" + i + "," + j + ")"), j * 40 + 100, i * 20 + 100);
            }
        }

    }

}