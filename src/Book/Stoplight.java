import java.awt.*;

/**
 * This class represents a simple implementation of a stoplight.
 * The client can determine the current state of the stoplight by
 * calling stoplight.getState() and change it to the next color
 * in the sequence (GREEN -> YELLOW -> RED -> GREEN) by calling
 * stoplight.advance().
 */

public class Stoplight {

    /** Constant indicating the color GREEN */
    public static final Color GREEN = Color.GREEN;

    /** Constant indicating the color YELLOW */
    public static final Color YELLOW = Color.YELLOW;

    /** Constant indicating the color RED */
    public static final Color RED = Color.RED;

    /**
     * Creates a new Stoplight object, which is initially GREEN.
     */
    public Stoplight() {
        state = GREEN;
    }

    /**
     * Returns the current state of the stoplight.
     * @return The state of the stoplight (GREEN, YELLOW, or RED)
     */
    public Color getState() {
        return state;
    }

    /**
     * Advances the stoplight to the next state.
     */
    public void advance() {
        if (state == RED) {
            state = GREEN;
        } else if (state == YELLOW) {
            state = RED;
        } else if (state == GREEN) {
            state = YELLOW;
        }
    }

    /* Private instance variable */
    private Color state;

}