package absractfactorypattern;

/**
 * Created by Sean Keane on 10/03/2016.
 */
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
