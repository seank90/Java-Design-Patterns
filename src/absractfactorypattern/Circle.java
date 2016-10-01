package absractfactorypattern;

/**
 * Created by Sean Keane on 10/03/2016.
 */
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
