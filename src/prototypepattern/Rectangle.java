package prototypepattern;

/**
 * Created by Sean Keane on 23/03/2016.
 */
class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
