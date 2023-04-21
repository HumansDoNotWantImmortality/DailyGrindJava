package projectEuler;

import java.math.BigInteger;

public class FactorialDigitSum {

    public static void main(String[] args) {
        System.out.println(factorialDigitsSum(100));
    }

    private static int factorialDigitsSum(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input number must be non-negative");
        }

        BigInteger product = BigInteger.ONE;
        int sum = 0;

        for (int i = 2; i <= number; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }

        String factorial = product.toString();
        for (int j = 0; j < factorial.length(); j++) {
            sum += factorial.charAt(j) - '0';
        }

        return sum;
    }
}
