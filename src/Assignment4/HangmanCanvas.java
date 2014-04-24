/*
 * File: HangmanCanvas.java
 * ------------------------
 * This file keeps track of the Hangman display.
 */

import acm.graphics.*;

public class HangmanCanvas extends GCanvas {

    /** Resets the display so that only the scaffold appears */
	public void reset() {
        removeAll();

        add(new GLine(ORIGIN_X, ORIGIN_Y, ORIGIN_X, ORIGIN_Y + ROPE_LENGTH));
        add(new GLine(ORIGIN_X, ORIGIN_Y, ORIGIN_X - BEAM_LENGTH, ORIGIN_Y));
        add(new GLine(ORIGIN_X - BEAM_LENGTH, ORIGIN_Y, ORIGIN_X - BEAM_LENGTH, ORIGIN_Y + SCAFFOLD_HEIGHT));
	}

    /**
     * Updates the word on the screen to correspond to the current
     * state of the game.  The argument string shows what letters have
     * been guessed so far; unguessed letters are indicated by hyphens.
     */
	public void displayWord(String word) {
		/* You fill this in */
	}

    /**
     * Updates the display to correspond to an incorrect guess by the
     * user.  Calling this method causes the next body part to appear
     * on the scaffold and adds the letter to the list of incorrect
     * guesses that appears at the bottom of the window.
     */
	public void noteIncorrectGuess(char letter) {
		/* You fill this in */
	}

    private void drawHead() {
        add(new GOval(ORIGIN_X - HEAD_RADIUS,
                      ORIGIN_Y + ROPE_LENGTH,
                      HEAD_RADIUS * 2,
                      HEAD_RADIUS * 2));
    }

    private void drawBody() {
        int offsetY = ORIGIN_Y + ROPE_LENGTH + (HEAD_RADIUS * 2);
        add(new GLine(ORIGIN_X,
                      offsetY,
                      ORIGIN_X,
                      offsetY + BODY_LENGTH));
    }

    private void drawArm(String side) {
        int offsetY = ORIGIN_Y + ROPE_LENGTH + (HEAD_RADIUS * 2) + ARM_OFFSET_FROM_HEAD;

        if (side.toLowerCase() == "left") {
            add(new GLine(ORIGIN_X, offsetY, ORIGIN_X - UPPER_ARM_LENGTH, offsetY));
            add(new GLine(ORIGIN_X - UPPER_ARM_LENGTH,
                          offsetY,
                          ORIGIN_X - UPPER_ARM_LENGTH,
                          offsetY + LOWER_ARM_LENGTH));
        } else {
            add(new GLine(ORIGIN_X, offsetY, ORIGIN_X + UPPER_ARM_LENGTH, offsetY));
            add(new GLine(ORIGIN_X + UPPER_ARM_LENGTH,
                          offsetY,
                          ORIGIN_X + UPPER_ARM_LENGTH,
                          offsetY + LOWER_ARM_LENGTH));
        }
    }

    private void drawLeg(String side) {
        int offsetY = ORIGIN_Y + ROPE_LENGTH + (HEAD_RADIUS * 2) + BODY_LENGTH;

        if (side.toLowerCase() == "left") {
            add(new GLine(ORIGIN_X, offsetY, ORIGIN_X - HIP_WIDTH, offsetY));
            add(new GLine(ORIGIN_X - HIP_WIDTH,
                    offsetY,
                    ORIGIN_X - HIP_WIDTH,
                    offsetY + LEG_LENGTH));
        } else {
            add(new GLine(ORIGIN_X, offsetY, ORIGIN_X + HIP_WIDTH, offsetY));
            add(new GLine(ORIGIN_X + HIP_WIDTH,
                    offsetY,
                    ORIGIN_X + HIP_WIDTH,
                    offsetY + LEG_LENGTH));
        }
    }

    private void drawFoot(String side) {
        int offsetY = ORIGIN_Y + ROPE_LENGTH + (HEAD_RADIUS * 2) + BODY_LENGTH + LEG_LENGTH;

        if (side.toLowerCase() == "left") {
            add(new GLine(ORIGIN_X - HIP_WIDTH, offsetY, ORIGIN_X - HIP_WIDTH - FOOT_LENGTH, offsetY));
        } else {
            add(new GLine(ORIGIN_X + HIP_WIDTH, offsetY, ORIGIN_X + HIP_WIDTH + FOOT_LENGTH, offsetY));
        }
    }

    /* Constants for the simple version of the picture (in pixels) */
    private static final int ORIGIN_X = 200;
    private static final int ORIGIN_Y = 50;
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 36;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 72;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 36;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;

}
