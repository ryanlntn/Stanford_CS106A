import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class HalloweenPumpkin extends GraphicsProgram {

    public void run() {
        drawStem();
    }

    private void drawStem() {
        GRect stem = new GRect(getWidth() / 2 - 2, 20, getWidth() / 2 + 2, 25);
        stem.setFilled(true);
        stem.setFillColor(Color.BLACK);
        add(stem);
    }

}
