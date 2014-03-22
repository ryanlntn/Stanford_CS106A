/*
 * File: Breakout.java
 * -------------------
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

    /** Width and height of application window in pixels */
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 600;

    /** Dimensions of game board (usually the same) */
    private static final int WIDTH = APPLICATION_WIDTH;
    private static final int HEIGHT = APPLICATION_HEIGHT;

    /** Dimensions of the paddle */
    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;

    /** Offset of the paddle up from the bottom */
    private static final int PADDLE_Y_OFFSET = 30;

    /** Number of bricks per row */
    private static final int NBRICKS_PER_ROW = 10;

    /** Number of rows of bricks */
    private static final int NBRICK_ROWS = 10;

    /** Separation between bricks */
    private static final int BRICK_SEP = 4;

    /** Width of a brick */
    private static final int BRICK_WIDTH =
            (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

    /** Height of a brick */
    private static final int BRICK_HEIGHT = 8;

    /** Radius of the ball in pixels */
    private static final int BALL_RADIUS = 10;

    /** Offset of the top brick row from the top */
    private static final int BRICK_Y_OFFSET = 70;

    /** Offset of the top brick row from the left */
    private static final int BRICK_X_OFFSET =
            (WIDTH - (NBRICKS_PER_ROW * (BRICK_WIDTH + BRICK_SEP)) + BRICK_SEP) / 2;

    /** Number of turns */
    private static final int NTURNS = 3;

    private GRect paddle;

    public void run() {
        setupBricks();
        drawPaddle((WIDTH - PADDLE_WIDTH) / 2);
        addMouseListeners();
    }

    public void mouseMoved(MouseEvent e) {
        remove(paddle);
        drawPaddle(e.getX() - PADDLE_WIDTH / 2);
    }

    private void setupBricks() {
        double y = BRICK_Y_OFFSET;
        for (int i = 0; i < NBRICK_ROWS; i++) {
            drawRow(y, rowColor(i));
            y += BRICK_HEIGHT + BRICK_SEP;
        }
    }

    private void drawRow(double y, Color color) {
        double x = BRICK_X_OFFSET;
        for (int i = 0; i < NBRICKS_PER_ROW; i++) {
            drawBrick(x, y, color);
            x += BRICK_WIDTH + BRICK_SEP;
        }
    }

    private void drawBrick(double x, double y, Color color) {
        GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
        brick.setFilled(true);
        brick.setFillColor(color);
        brick.setColor(color);
        add(brick);
    }

    private void drawPaddle(double x) {
        double y = HEIGHT - (PADDLE_Y_OFFSET + PADDLE_HEIGHT);
        paddle = new GRect(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
        paddle.setFilled(true);
        paddle.setFillColor(Color.BLACK);
        paddle.setColor(Color.BLACK);
        add(paddle);
    }

    private Color rowColor(int n) {
        switch (n) {
            case 0: return Color.RED;
            case 1: return Color.RED;
            case 2: return Color.ORANGE;
            case 3: return Color.ORANGE;
            case 4: return Color.YELLOW;
            case 5: return Color.YELLOW;
            case 6: return Color.GREEN;
            case 7: return Color.GREEN;
            case 8: return Color.CYAN;
            case 9: return Color.CYAN;
            default: return Color.BLACK;
        }
    }
}
