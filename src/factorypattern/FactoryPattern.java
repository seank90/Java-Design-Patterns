package factorypattern;

/**
 * By using the factory method we can package protect the classes allowing us to only use
 * the factory in order to retrieve the shapes.
 *
 * Created by Sean Keane on 09/03/2016.
 */
public class FactoryPattern {

    public void runFactoryDemo() {
        System.out.println("******************************************************************");
        System.out.println("FACTORY PATTERN DEMO");
        System.out.println("******************************************************************");

        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        //get an object of Square and call its draw method.
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        //get an object of Rectangle and call its draw method.
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

    }
}
