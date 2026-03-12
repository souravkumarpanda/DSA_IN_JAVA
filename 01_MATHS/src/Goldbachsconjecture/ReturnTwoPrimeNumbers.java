package Goldbachsconjecture;
import java.util.*;

public class ReturnTwoPrimeNumbers {
    static List<Integer> primeDivision(int n) {
        // Step 1: Create a boolean array to mark primes using the Sieve of Eratosthenes
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime

        // Step 2: Apply the Sieve of Eratosthenes
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Step 3: Find the prime pair whose minimum value is the smallest
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                // Return the pair as a list
                return Arrays.asList(i, n - i);
            }
        }

        // No valid pair found (though for the given constraints, this shouldn't happen)
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int n = 74; // Example input
        List<Integer> result = primeDivision(n);
        System.out.println(result.get(0) + " " + result.get(1));
    }
}
