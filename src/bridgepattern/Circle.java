package bridgepattern;

import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 24/03/2016.
 */
class Circle extends Shape{

    private int x, y, radius;

    public Circle(int x, int y, int radius, @NotNull DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(x, y, radius);
    }
}
