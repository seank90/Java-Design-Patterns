package bridgepattern;

/**
 * Created by Sean Keane on 24/03/2016.
 */
class RedCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle [color:red, radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
