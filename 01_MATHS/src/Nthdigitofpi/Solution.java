package Nthdigitofpi;
import java.math.BigDecimal;
import java.math.MathContext;

public class Solution {
    // Function to get the N-th digit of Pi
    public static int nthDigOfPi(int N) {
        // Calculate Pi to N digits using BigDecimal and MathContext
        BigDecimal pi = computePi(N + 1); // We need N + 1 digits to get the N-th digit
        String piStr = pi.toPlainString(); // Convert Pi to string

        // Handle the case where N = 1 (integer part before decimal point)
        if (N == 1) {
            return piStr.charAt(0) - '0';
        }

        // Return the N-th digit after the decimal point
        return piStr.charAt(N + 1) - '0';
    }

    // Helper function to compute Pi to a given precision using BigDecimal
    public static BigDecimal computePi(int precision) {
        MathContext mc = new MathContext(precision + 5); // Extra precision for accuracy
        BigDecimal pi = BigDecimal.ZERO;
        BigDecimal sixteen = new BigDecimal(16);

        for (int k = 0; k < precision; k++) {
            BigDecimal term = BigDecimal.ONE.divide(sixteen.pow(k), mc)
                    .multiply(new BigDecimal(4).divide(new BigDecimal(8 * k + 1), mc)
                            .subtract(new BigDecimal(2).divide(new BigDecimal(8 * k + 4), mc))
                            .subtract(new BigDecimal(1).divide(new BigDecimal(8 * k + 5), mc))
                            .subtract(new BigDecimal(1).divide(new BigDecimal(8 * k + 6), mc)));
            pi = pi.add(term);
        }

        return pi.round(new MathContext(precision));
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(nthDigOfPi(1)); // Output: 3
        System.out.println(nthDigOfPi(2)); // Output: 1
    }
}
