package builderpattern;

/**
 * Created by Sean Keane on 14/03/2016.
 */
abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
