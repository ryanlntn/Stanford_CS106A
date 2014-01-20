/**
 * The head. The head is a big rectangle whose dimensions are given by the named
 constants HEAD_WIDTH and HEAD_HEIGHT. The interior of the head is gray, although it
 should be framed in black.
 • The eyes. The eyes should be cricles whose radius in pixels is given by the named
 constant EYE_RADIUS. The centers of the eyes should be set horizontally a quarter of
 the width of the head in from either edge, and one quarter of the distance down from
 the top of the head. The eyes are yellow.
 • The mouth. The mouth should be centered with respect to the head in the x-dimension
 and one quarter of the distance up from the bottom of the head in the y-dimension.
 The dimensions of the mouth are given by the named constants MOUTH_WIDTH and
 MOUTH_HEIGHT. The mouth is white.
 */

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

import java.awt.*;

public class RobotFace extends GraphicsProgram {
    private static final int HEAD_WIDTH = 300;
    private static final int HEAD_HEIGHT = 400;
    private static final int EYE_RADIUS = 10;
    private static final int MOUTH_WIDTH = 250;
    private static final int MOUTH_HEIGHT = 30;

    public void run() {
        drawHead();
        drawEyes();
        drawMouth();
    }

    private void drawHead() {
        GRect head = new GRect((getWidth() - HEAD_WIDTH) / 2,
                               (getHeight() - HEAD_HEIGHT) / 2,
                               HEAD_WIDTH,
                               HEAD_HEIGHT);
        head.setFilled(true);
        head.setFillColor(Color.GRAY);
        add(head);
    }

    private void drawEyes() {
        drawYellowCircle(((getWidth() - HEAD_WIDTH) / 2) + (HEAD_WIDTH / 4),
                         ((getHeight() - HEAD_HEIGHT) / 2) + (HEAD_HEIGHT / 4),
                         EYE_RADIUS);
        drawYellowCircle(((getWidth() - HEAD_WIDTH) / 2) + (3 * HEAD_WIDTH / 4),
                         ((getHeight() - HEAD_HEIGHT) / 2) + (HEAD_HEIGHT / 4),
                         EYE_RADIUS);
    }

    private void drawMouth() {
        GRect mouth = new GRect((getWidth() - MOUTH_WIDTH) / 2,
                                3 * (getHeight() - MOUTH_HEIGHT) / 4,
                                MOUTH_WIDTH,
                                MOUTH_HEIGHT);
        mouth.setFilled(true);
        mouth.setFillColor(Color.WHITE);
        mouth.setColor(Color.WHITE);
        add(mouth);
    }

    private void drawYellowCircle(int x, int y, int radius) {
        GOval circle = new GOval(x - radius, y - radius, radius * 2, radius * 2);
        circle.setFilled(true);
        circle.setFillColor(Color.YELLOW);
        circle.setColor(Color.YELLOW);
        add(circle);
    }
}
