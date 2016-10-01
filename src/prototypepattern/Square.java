package prototypepattern;

/**
 * Created by Sean Keane on 23/03/2016.
 */
class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
