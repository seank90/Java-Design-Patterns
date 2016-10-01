package absractfactorypattern;

/**
 * Created by Sean Keane on 10/03/2016.
 */
class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
