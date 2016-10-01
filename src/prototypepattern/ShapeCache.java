package prototypepattern;

import com.sun.istack.internal.NotNull;

import java.util.Hashtable;

/**
 * Created by Sean Keane on 23/03/2016.
 */
class ShapeCache {

    private static Hashtable<String, Shape> shapeTable = new Hashtable<>();

    public static Shape getShape(@NotNull String shapeId){
        Shape cacheShape = shapeTable.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeTable.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeTable.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeTable.put(rectangle.getId(), rectangle);
    }
}
