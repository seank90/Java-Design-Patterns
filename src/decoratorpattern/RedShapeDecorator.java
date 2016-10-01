package decoratorpattern;

import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 30/03/2016.
 */
class RedShapeDecorator extends ShapeDectorator {

    public RedShapeDecorator(@NotNull Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorderRed(decoratedShape);
    }

    private void setBorderRed(@NotNull Shape decoratedShape) {
        System.out.println("Border Color : Red");
    }
}
