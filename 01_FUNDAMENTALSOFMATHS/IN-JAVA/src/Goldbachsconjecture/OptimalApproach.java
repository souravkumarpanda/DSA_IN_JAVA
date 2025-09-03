package Goldbachsconjecture;
import java.util.*;
public class OptimalApproach {
    // Method to generate a boolean array for primes using the Sieve of Eratosthenes
    private static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Initialize all numbers as prime
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }

    // Method to find and print the prime pair for a given even number
    public static void goldbachPair(int n) {
        if (n < 4 || n % 2 != 0) {
            System.out.println("Goldbach's conjecture is only valid for even numbers >= 4.");
            return;
        }

        // Step 1: Generate prime numbers up to n
        boolean[] isPrime = sieveOfEratosthenes(n);

        // Step 2: Find the first prime pair (the smallest minimum value)
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                System.out.println(i + " " + (n - i));
                return;
            }
        }
    }
    public static void main(String[] args) {
        int n = 74;
        goldbachPair(n);
    }
}
