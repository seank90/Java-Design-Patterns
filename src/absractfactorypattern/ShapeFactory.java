package absractfactorypattern;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

/**
 * Created by Sean Keane on 10/03/2016.
 *
 * A factory that can return a shape
 */
class ShapeFactory extends AbstractFactory {

    @Nullable
    @Override
    Color getColor(@NotNull String color) {
        return null;
    }

    @Nullable
    @Override
    Shape getShape(@NotNull String shape) {
        switch (shape.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
