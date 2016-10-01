package builderpattern;

/**
 * Created by Sean Keane on 14/03/2016.
 */
class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
