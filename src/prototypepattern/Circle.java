package prototypepattern;

/**
 * Created by Sean Keane on 23/03/2016.
 */
class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
