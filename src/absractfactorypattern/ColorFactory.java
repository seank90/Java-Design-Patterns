package absractfactorypattern;

import com.sun.istack.internal.Nullable;
import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 10/03/2016.
 *
 * A factory that can return a color object
 */
class ColorFactory extends AbstractFactory {

    @Nullable
    @Override
    Color getColor(@NotNull String color) {
        switch (color.toUpperCase()) {
            case "RED":
                return new Red();
            case "BLUE":
                return new Blue();
            case "GREEN":
                return new Green();
            default:
                return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
