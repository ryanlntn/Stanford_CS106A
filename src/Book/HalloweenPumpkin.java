import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class HalloweenPumpkin extends GraphicsProgram {

    public void run() {
        drawStem();
        drawBody();
        GPoint[] leftEyePoints = {
            new GPoint((getWidth() / 2) - 20, 50),
            new GPoint((getWidth() / 2) - 25, 55),
            new GPoint((getWidth() / 2) - 15, 55)
        };
        GPoint[] rightEyePoints = {
                new GPoint((getWidth() / 2) + 20, 50),
                new GPoint((getWidth() / 2) + 25, 55),
                new GPoint((getWidth() / 2) + 15, 55)
        };
        drawEye(leftEyePoints);
        drawEye(rightEyePoints);

    }

    private void drawStem() {
        GRect stem = new GRect((getWidth() / 2) - 2, 20, 4, 5);
        stem.setFilled(true);
        stem.setFillColor(Color.BLACK);
        add(stem);
    }

    private void drawBody() {
        GOval body = new GOval((getWidth() / 2) - 50, 25, 100, 100);
        body.setFilled(true);
        body.setFillColor(Color.ORANGE);
        body.setColor(Color.ORANGE);
        add(body);
    }

    private void drawEye(GPoint[] points) {
        GPolygon eye = new GPolygon(points);
        eye.setFilled(true);
        eye.setFillColor(Color.BLACK);
        add(eye);
    }

}
