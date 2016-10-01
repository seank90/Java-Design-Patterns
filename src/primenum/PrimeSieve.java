package primenum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sean Keane on 11/03/2016.
 * <p/>
 * Used to sieve all the prime numbers up to a given number
 */
public class PrimeSieve {

    private final int limit;

    private List<Integer> primes = new ArrayList<>();

    PrimeSieve(int limitNum) {
        this.limit = limitNum;
    }

    public void calculatePrimes() {
        //initially assume all integers are prime
        boolean[] isPrime = new boolean[limit + 1];

        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        //Mark all non primes
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i; i * j <= limit; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        int countPrimes = 0;
        for (int i = 2; i <= limit; i++) {

            if (isPrime[i]) {
                storePrime(i);
                countPrimes++;
            }
        }

        System.out.println("List of prime numbers: " + primes);
        System.out.println("Amount of prime numbers: " + countPrimes);
    }

    public void storePrime(int prime) {
        primes.add(prime);
    }

}
