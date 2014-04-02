
import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class House extends GraphicsProgram {

    public void run() {
        add(new GRect(100, 100, 600, 400));
        add(new GLine(100, 100, 400, 50));
        add(new GLine(400, 50, 700, 100));
        drawSmallWindow(225, 200);
        drawSmallWindow(525, 200);
        drawLargeWindow(200, 400);
        drawLargeWindow(525, 400);
        drawDoor(375, 400);
    }

    private void drawSmallWindow(double x, double y) {
        add(new GRect(x, y, 50, 50));
        add(new GLine(x + 25, y, x + 25, y + 50));
        add(new GLine(x, y + 25, x + 50, y + 25));
    }

    private void drawLargeWindow(double x, double y) {
        add(new GRect(x, y, 75, 50));
        add(new GLine(x, y + 25, x + 75, y + 25));
        add(new GLine(x + 25, y, x + 25, y + 50));
        add(new GLine(x + 50, y, x + 50, y + 50));
    }

    private void drawDoor(double x, double y) {
        add(new GRect(x, y, 50, 100));
        add(new GOval(x + 50 - 10, y + 52, 5, 5));
    }

}
