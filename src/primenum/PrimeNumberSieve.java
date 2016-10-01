package primenum;

/**
 * Created by Sean Keane on 11/03/2016.
 */
public class PrimeNumberSieve {

    public void generate() {
        System.out.println("******************************************************************");
        System.out.println("PRIME NUMBER SIEVE DEMO");
        System.out.println("******************************************************************");

        PrimeSieve primeSieve = new PrimeSieve(100);
        primeSieve.calculatePrimes();
    }
}
