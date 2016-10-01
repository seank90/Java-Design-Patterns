package builderpattern;

/**
 * Created by Sean Keane on 14/03/2016.
 */
abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
