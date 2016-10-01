package fascadepattern;

/**
 * Created by Sean Keane on 30/03/2016.
 */
public class FascadePattern {

    public void run() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
