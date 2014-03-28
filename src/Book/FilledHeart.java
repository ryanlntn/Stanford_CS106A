import acm.graphics.GArc;
import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class FilledHeart extends GraphicsProgram {

    public void run() {
        GCompound heart = new GCompound();
        heart.add(new GArc((getWidth() / 2) - (100 / Math.sqrt(2)) - 15, 115, 100, 100, 45, 180));
        heart.add(new GArc((getWidth() / 2) - 15, 115, 100, 100, 315, 180));
        heart.add(new GLine((getWidth() / 2) - (100 / Math.sqrt(2)), 200, getWidth() / 2, 200 + (100 / Math.sqrt(2))));
        heart.add(new GLine((getWidth() / 2) + (100 / Math.sqrt(2)), 200, getWidth() / 2, 200 + (100 / Math.sqrt(2))));
        add(heart);
    }

}