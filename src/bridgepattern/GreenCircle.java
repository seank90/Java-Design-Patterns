package bridgepattern;

/**
 * Created by Sean Keane on 24/03/2016.
 */
class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle [color:green, radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
