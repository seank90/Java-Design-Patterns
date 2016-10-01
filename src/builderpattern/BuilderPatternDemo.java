package builderpattern;

/**
 * Created by Sean Keane on 14/03/2016.
 */
public class BuilderPatternDemo {

    public void run(){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Veg Meal total cost : " + vegMeal.getCosts());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Non Veg Meal total cost : " + nonVegMeal.getCosts());
    }

}
