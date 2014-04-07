import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class LincolnMemorial extends GraphicsProgram {

    private static final int BUILDING_WIDTH = 600;
    private static final int BUILDING_HEIGHT = 400;

    public void run() {
        drawFoundation();
        drawRoof();
        drawColumns();
        drawCircles();
        drawLincoln();
    }

    private void drawRoof() {
        add(new GRect((getWidth() - BUILDING_WIDTH) / 2 + 50,
                       50,
                       BUILDING_WIDTH - 100,
                       BUILDING_HEIGHT / 6));
        add(new GRect((getWidth() - BUILDING_WIDTH) / 2,
                      50 + BUILDING_HEIGHT / 6,
                      BUILDING_WIDTH,
                      BUILDING_HEIGHT / 6));
    }

    private void drawFoundation() {
        add(new GRect((getWidth() - BUILDING_WIDTH) / 2,
                      50 + (BUILDING_HEIGHT / 6) * 5,
                      BUILDING_WIDTH,
                      BUILDING_HEIGHT / 6));
    }

    private void drawColumns() {
        for (int i = 0; i < 25; i++) {
            add(new GRect((getWidth() - BUILDING_WIDTH) / 2 + ((BUILDING_WIDTH / 25) * i),
                    50 + (BUILDING_HEIGHT / 6) * 2,
                    BUILDING_WIDTH / 25,
                    (BUILDING_HEIGHT / 6) * 3));
        }
    }

    private void drawCircles() {
        for (int i = 0; i < 25; i++) {
            if (i % 2 == 0) {
                add(new GOval((getWidth() - BUILDING_WIDTH) / 2 + ((BUILDING_WIDTH / 25) * i) + 4,
                               50 + BUILDING_HEIGHT / 6 + 30,
                               16,
                               16));
            }
        }
    }

    private void drawLincoln() {
        add(new GRect((getWidth() / 2) - ((BUILDING_WIDTH / 25) - 8) / 2,
                      BUILDING_HEIGHT - 60,
                      (BUILDING_WIDTH / 25) - 8,
                      40));
        add(new GOval((getWidth() / 2) - ((BUILDING_WIDTH / 25) - 8) / 2,
                      BUILDING_HEIGHT - 76,
                      16,
                      16));
    }

}
