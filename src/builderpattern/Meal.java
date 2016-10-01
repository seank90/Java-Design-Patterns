package builderpattern;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sean Keane on 14/03/2016.
 */
class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem (@NotNull Item item) {
        items.add(item);
    }

    public float getCosts() {
        float cost = 0.0f;

        for(Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for(Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

}
