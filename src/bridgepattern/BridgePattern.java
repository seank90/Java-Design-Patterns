package bridgepattern;

/**
 * Created by Sean Keane on 24/03/2016.
 */
public class BridgePattern {

    public void run(){
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(150, 150, 20, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
