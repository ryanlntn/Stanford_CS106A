/*
 * File: FancyHello.java
 * ---------------------
 * This program displays a fancier "hello, world" message.
 */


import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class FancyHello extends GraphicsProgram {

    public void run() {
        GLabel label = new GLabel("hello, world");
//        label.setFont("London-36");
        label.setColor(Color.MAGENTA);
        double x = (getWidth() - label.getWidth()) / 2;
        double y = (getHeight() + label.getAscent()) / 2;
        add(label, x, y);
    }

}