package absractfactorypattern;

/**
 * Created by Sean Keane on 10/03/2016.
 */
class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
