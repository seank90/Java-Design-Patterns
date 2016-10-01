package primenum;

/**
 * Created by Sean Keane on 10/03/2016.
 *
 */
public class PrimeThread extends PrimeNumberGenerator implements Runnable {

    int numToCheck;

    PrimeThread(int num){
        numToCheck = num;
    }

    @Override
    public void run() {
        PrimeNumberGenerator.checkForPrime(numToCheck);
    }
}
