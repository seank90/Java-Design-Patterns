package primenum;

/**
 * Created by Sean Keane on 10/03/2016.
 *
 */
public class PrimeNumberGenerator {

    private static final int MAX = 10000000;

    public void generate() {

        for (int i = 0; i < MAX; i++) {
            Thread t = new Thread(new PrimeThread(i));
            t.start();
        }
    }

    static void checkForPrime(int i) {
        boolean isPrime = true;
        //check to see if the number is prime
        for(int j=2; j < i ; j++){
            if(i % j == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(i);
        }
    }
}
