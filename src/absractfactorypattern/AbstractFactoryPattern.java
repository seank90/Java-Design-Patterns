package absractfactorypattern;

/**
 * Created by Sean Keane on 10/03/2016.
 *
 * Demo the use of the abstract factory pattern
 */
public class AbstractFactoryPattern {

    private static final String SHAPE = "SHAPE";
    private static final String COLOR = "COLOR";

    private static final String CIRCLE = "CIRCLE";
    private static final String SQUARE = "SQUARE";
    private static final String RECTANGLE = "RECTANGLE";

    private static final String RED = "RED";
    private static final String BLUE = "BLUE";
    private static final String GREEN = "GREEN";

    public void runAbstractFactoryDemo() {
        System.out.println("******************************************************************");
        System.out.println("ABSTRACT FACTORY PATTERN DEMO");
        System.out.println("******************************************************************");

        AbstractFactory shapeFactory = FactoryProducer.getFactory(SHAPE);
        Shape circle = shapeFactory.getShape(CIRCLE);
        circle.draw();
        Shape square = shapeFactory.getShape(SQUARE);
        square.draw();
        Shape rectangle = shapeFactory.getShape(RECTANGLE);
        rectangle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory(COLOR);
        Color red = colorFactory.getColor(RED);
        red.fill();
        Color blue = colorFactory.getColor(BLUE);
        blue.fill();
        Color green = colorFactory.getColor(GREEN);
        green.fill();
    }

}
