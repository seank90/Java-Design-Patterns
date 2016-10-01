package decoratorpattern;

/**
 * Created by Sean Keane on 30/03/2016.
 */
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape : Rectangle");
    }
}
