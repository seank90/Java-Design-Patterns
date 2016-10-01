package singletonpattern;

/**
 * Created by Sean Keane on 11/03/2016.
 */
class SingletonObject {

    private static SingletonObject singletonObject = new SingletonObject();

    //private to prevent the object from being recreated.
    private SingletonObject() {

    }

    public static SingletonObject getInstance() {
        if (singletonObject == null){
            return new SingletonObject();
        } else {
            return singletonObject;
        }
    }

    public void showMessage() {
        System.out.println("Called from singleton object");
    }
}
