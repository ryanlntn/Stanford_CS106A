/*
 * File: SimpleCalendar.java
 * Name: Ryan Linton
 * Section Leader: N/A
 * ---------------------------
 * This program draws a calendar.
 */

import acm.program.*;
import acm.graphics.*;

public class SimpleCalendar extends GraphicsProgram {

    /* The number of days in the month */
    private static final int DAYS_IN_MONTH = 31;

    /* The day of the week on which the month starts */
    /* (Sunday = 0, Monday = 1, Tuesday = 2, and so on) */
    private static final int DAY_MONTH_STARTS = 5;

    /* The width in pixels of a day on the calendar */
    private static final int DAY_WIDTH = 40;

    /* The height in pixels of a day on the calendar */
    private static final int DAY_HEIGHT = 30;

    public void run() {
        int current_day = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                add(new GRect(j * DAY_WIDTH, i * DAY_HEIGHT, DAY_WIDTH, DAY_HEIGHT));
                if (i == 0 && j == DAY_MONTH_STARTS) current_day = 1;
                if (current_day > 0 && current_day < DAYS_IN_MONTH) {
                    add(new GLabel("" + current_day, j * DAY_WIDTH + (DAY_WIDTH / 8), i * DAY_HEIGHT + (DAY_HEIGHT / 2)));
                    current_day++;
                }
            }
        }
    }

}
