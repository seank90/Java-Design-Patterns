package factorypattern;

import com.sun.istack.internal.Nullable;
import com.sun.istack.internal.NotNull;

/**
 * Created by Sean Keane on 09/03/2016.
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    @Nullable
    public Shape getShape(@NotNull String shapeType) {
        if (shapeType == null){
            return null;
        } else {
            switch (shapeType.toUpperCase()) {
                case "SQUARE":
                    return new Square();
                case "RECTANGLE":
                    return new Rectangle();
                case "CIRCLE":
                    return new Circle();
                default:
                    return null;
            }
        }
    }
}
