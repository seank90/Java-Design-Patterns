package absractfactorypattern;

/**
 * Created by Sean Keane on 10/03/2016.
 */
abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
