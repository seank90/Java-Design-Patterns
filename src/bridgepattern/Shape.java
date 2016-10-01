package bridgepattern;

/**
 * Created by Sean Keane on 24/03/2016.
 */
abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
