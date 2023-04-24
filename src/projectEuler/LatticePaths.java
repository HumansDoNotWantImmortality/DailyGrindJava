package projectEuler;

import java.math.BigInteger;

public class LatticePaths {

    // Method to calculate binomial coefficient
    private static BigInteger binomialCoefficient(int n, int k) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            result = result.multiply(BigInteger.valueOf(n - i));
            result = result.divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }

    // Method to calculate number of routes in a grid
    public static BigInteger calculateRoutes(int n) {
        // Since the numbers can be large, we use BigInteger to handle large factorials
        // Formula: C(2n, n)
        return binomialCoefficient(2 * n, n);
    }
}
