package Goldbachsconjecture;
import java.util.Scanner;
public class BruteForceApproach {
    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Brute force method to find the Goldbach pair
    public static void goldbachPair(int n) {
        if (n < 4 || n % 2 != 0) {
            System.out.println("Goldbach's conjecture is only valid for even numbers >= 4.");
            return;
        }

        // Check all pairs (i, n-i) for primality
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(i + " " + (n - i));
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an even number: ");
        int n = sc.nextInt();
        goldbachPair(n);
    }
}
