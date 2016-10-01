package decoratorpattern;

/**
 * Created by Sean Keane on 30/03/2016.
 */
public class DecoratorPattern {

    public void run() {
        Circle circle = new Circle();

        RedShapeDecorator redBorderCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redBorderRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with red border");
        redBorderCircle.draw();

        System.out.println("Rectangle with red border");
        redBorderRectangle.draw();
    }

}
