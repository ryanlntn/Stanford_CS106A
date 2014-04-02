
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class HouseOfUsher extends GraphicsProgram {

    public void run() {
        add(new GRect(150, 100, 550, 400));
        add(new GLine(150, 100, 450, 50));
        add(new GLine(450, 50, 700, 100));
        drawSmallWindow(225, 200);
        drawSmallWindow(525, 200);
        drawLargeWindow(200, 400);
        drawLargeWindow(525, 400);
        drawDoor(375, 400);
        drawTower(100, 50, 50, 450);
        drawTower(700, 50, 50, 450);
    }

    private void drawSmallWindow(double x, double y) {
        add(new GRect(x, y, 50, 50));
    }

    private void drawLargeWindow(double x, double y) {
        add(new GRect(x, y, 75, 50));
    }

    private void drawDoor(double x, double y) {
        add(new GRect(x, y, 50, 100));
    }

    private void drawTower(double x, double y, double w, double h) {
        add(new GRect(x, y + 50, w, h - 50));
        add(new GLine(x, y + 50, x + w / 2, y));
        add(new GLine(x + w / 2, y, x + w, y + 50));
    }

}
