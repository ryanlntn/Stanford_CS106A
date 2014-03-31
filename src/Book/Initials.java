import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Initials extends GraphicsProgram {

    public void run() {
        drawR();
        drawC();
        drawL();
    }

    private void drawR() {
        GCompound r = new GCompound();
        r.add(new GLine(10, 10, 10, 110));
        r.add(new GLine(10, 10, 45, 10));
        r.add(new GArc(25, 10, 35, 50, 270, 180));
        r.add(new GLine(10, 60, 45, 60));
        r.add(new GLine(10, 60, 60, 110));

        add(r);
    }

    private void drawC() {
        add(new GArc(70, 10, 50, 100, 45, 270));
    }

    private void drawL() {
        GCompound l = new GCompound();
        l.add(new GLine(130, 10, 130, 110));
        l.add(new GLine(130, 110, 180, 110));

        add(l);
    }

}
