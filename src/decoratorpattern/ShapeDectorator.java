package decoratorpattern;

import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 30/03/2016.
 */
abstract class ShapeDectorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDectorator(@NotNull Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
