
import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class FilledHeart extends GraphicsProgram {

    public void run() {
        GCompound heart = new GCompound();

        GPoint[] points = {
            new GPoint(getWidth() / 2, (100 / Math.sqrt(2)) + 60),
            new GPoint((getWidth() / 2) + (100 / Math.sqrt(2)), 200),
            new GPoint(getWidth() / 2, 200 + (100 / Math.sqrt(2))),
            new GPoint((getWidth() / 2) - (100 / Math.sqrt(2)), 200)
        };

        GPolygon polygon = new GPolygon(points);
        polygon.setFilled(true);
        polygon.setFillColor(Color.RED);
        polygon.setColor(Color.RED);

        GArc leftArc = new GArc((getWidth() / 2) - (100 / Math.sqrt(2)) - 15, 115, 100, 100, 45, 180);
        leftArc.setFilled(true);
        leftArc.setFillColor(Color.RED);
        leftArc.setColor(Color.RED);

        GArc rightArc = new GArc((getWidth() / 2) - 15, 115, 100, 100, 315, 180);
        rightArc.setFilled(true);
        rightArc.setFillColor(Color.RED);
        rightArc.setColor(Color.RED);

        heart.add(leftArc);
        heart.add(rightArc);
        heart.add(polygon);
        add(heart);
    }

}