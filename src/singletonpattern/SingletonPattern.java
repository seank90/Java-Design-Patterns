package singletonpattern;

/**
 * Created by Sean Keane on 11/03/2016.
 *
 *
 */
public class SingletonPattern {

    public void generate() {
        System.out.println("******************************************************************");
        System.out.println("SINGLETON PATTERN DEMO");
        System.out.println("******************************************************************");

        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
    }

}
