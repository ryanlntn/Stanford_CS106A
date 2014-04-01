import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class HalloweenPumpkin extends GraphicsProgram {

    public void run() {
        drawStem();
        drawBody();
        GPoint[] leftEyePoints = {
            new GPoint((getWidth() / 2) - 20, 55),
            new GPoint((getWidth() / 2) - 25, 50),
            new GPoint((getWidth() / 2) - 15, 50)
        };
        GPoint[] rightEyePoints = {
            new GPoint((getWidth() / 2) + 20, 55),
            new GPoint((getWidth() / 2) + 25, 50),
            new GPoint((getWidth() / 2) + 15, 50)
        };
        GPoint[] nosePoints = {
            new GPoint((getWidth() / 2), 60),
            new GPoint((getWidth() / 2) + 5, 65),
            new GPoint((getWidth() / 2) - 5, 65)
        };
        drawTriangle(leftEyePoints);
        drawTriangle(rightEyePoints);
        drawTriangle(nosePoints);
        drawMouth();
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

    private void drawTriangle(GPoint[] points) {
        GPolygon triangle = new GPolygon(points);
        triangle.setFilled(true);
        triangle.setFillColor(Color.BLACK);
        add(triangle);
    }

    private void drawMouth() {
        GPoint[] points = {
            new GPoint((getWidth() / 2) - 25, 80),
            new GPoint((getWidth() / 2) - 20, 75),
            new GPoint((getWidth() / 2) - 15, 80),
            new GPoint((getWidth() / 2) - 10, 75),
            new GPoint((getWidth() / 2) - 5, 80),
            new GPoint((getWidth() / 2), 75),
            new GPoint((getWidth() / 2) + 25, 80),
            new GPoint((getWidth() / 2) + 20, 90),
            new GPoint((getWidth() / 2) + 15, 85),
            new GPoint((getWidth() / 2) + 10, 90),
            new GPoint((getWidth() / 2) + 5, 85),
        };
        GPolygon mouth = new GPolygon(points);
        mouth.setFilled(true);
        mouth.setFillColor(Color.BLACK);
        add(mouth);
    }

}
