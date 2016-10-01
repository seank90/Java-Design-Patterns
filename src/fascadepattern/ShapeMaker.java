package fascadepattern;

/**
 * Created by Sean Keane on 30/03/2016.
 */
class ShapeMaker {
    private Square square;
    private Circle circle;
    private Rectangle rectangle;

    public ShapeMaker() {
        this.square = new Square();
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
