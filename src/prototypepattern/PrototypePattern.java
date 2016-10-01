package prototypepattern;

/**
 * Created by Sean Keane on 23/03/2016.
 */
public class PrototypePattern {

    public void run(){
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());

        clonedShape = ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape.getType());

        clonedShape = ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape.getType());
    }
}
