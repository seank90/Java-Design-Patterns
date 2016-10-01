package builderpattern;

/**
 * Created by Sean Keane on 14/03/2016.
 */
class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
