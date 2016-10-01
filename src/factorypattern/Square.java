package factorypattern;

/**
 * Created by Sean Keane on 09/03/2016.
 */
class Square implements Shape {


    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
