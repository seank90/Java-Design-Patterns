package absractfactorypattern;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

/**
 * Created by Sean Keane on 10/03/2016.
 *
 * Returns the Shape and Color factory
 */
public class FactoryProducer {

    @Nullable
    public static AbstractFactory getFactory(@NotNull String factory) {
        switch (factory.toUpperCase()) {
            case "COLOR":
                return new ColorFactory();
            case "SHAPE":
                return new ShapeFactory();
            default:
                return null;
        }
    }

}
