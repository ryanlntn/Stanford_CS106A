/*
 * File: RandomCircles.java
 * -----------------------
 * This program draws 10 random circles
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;

import java.awt.*;

public class RandomCircles extends GraphicsProgram {

    public void run() {

        for (int i = 0; i < 10; i++) {

            int radius = rand.nextInt(5, 100);
            int x = rand.nextInt(0, getWidth() - radius * 2);
            int y = rand.nextInt(0, getHeight() - radius * 2);
            Color fillColor = rand.nextColor();

            GOval circle = new GOval(x, y, radius, radius);
            circle.setFilled(true);
            circle.setFillColor(fillColor);
            circle.setColor(fillColor);

            add(circle);

        }

    }

    /* Create an instance variable for the random number generator */
    private RandomGenerator rand = new RandomGenerator();

}
