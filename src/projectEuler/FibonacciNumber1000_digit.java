package projectEuler;

import java.math.BigInteger;

public class FibonacciNumber1000_digit {

    private static int fibonacciNumberIndex(int numberOfDigits) {

        int index = 12;
        BigInteger a = BigInteger.valueOf(89);
        BigInteger b = BigInteger.valueOf(144);

        while (true) {
            index++;
            BigInteger c = a.add(b);
            if (c.toString().length() >= numberOfDigits) {
                return index;
            }
            a = b;
            b = c;
        }
    }
}
