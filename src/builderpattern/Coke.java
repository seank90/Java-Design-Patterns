package builderpattern;

/**
 * Created by Sean Keane on 14/03/2016.
 */
class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
