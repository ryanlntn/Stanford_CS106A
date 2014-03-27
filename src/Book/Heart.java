import acm.graphics.GArc;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class Heart extends GraphicsProgram {

    public void run() {
        add(new GArc((getWidth() / 2) - 100, 100, 100, 100, 45, 180));
        add(new GArc((getWidth() / 2), 100, 100, 100, 315, 180));
        add(new GLine((getWidth() / 2) - 100, 200, getWidth() / 2, 300));
        add(new GLine((getWidth() / 2) + 100, 200, getWidth() / 2, 300));
    }

}
