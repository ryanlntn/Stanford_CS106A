import acm.graphics.*;
import acm.program.GraphicsProgram;

public class PeaceSymbol extends GraphicsProgram {

    public void run() {
        drawPeaceSymbol(0, 0, 100);
    }

    private void drawPeaceSymbol(double x, double y, double r) {
        double d = r * 2;
        double cx = x + r;
        double cy = y + r;
        GCompound peaceSymbol = new GCompound();
        peaceSymbol.add(new GOval(x, y, d, d));
        peaceSymbol.add(new GLine(cx, y, cx, y + d));
        peaceSymbol.add(new GLine(cx,
                                  cy,
                                  cx + r * Math.cos(45 * (Math.PI / 180)),
                                  cy + r * Math.sin(45 * (Math.PI / 180))));
        peaceSymbol.add(new GLine(cx,
                                  cy,
                                  cx + r * Math.cos(135 * (Math.PI / 180)),
                                  cy + r * Math.sin(135 * (Math.PI / 180))));
        add(peaceSymbol);
    }

}

