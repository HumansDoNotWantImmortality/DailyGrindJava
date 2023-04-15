package projectEuler;

import java.math.BigInteger;

public class PowerDigitSum {

    public static int sumOfDigits(BigInteger number, int power) {
        BigInteger num = number.pow(power);

        int sum = 0;
        while (!num.equals(BigInteger.ZERO)) {
            sum += num.mod(BigInteger.TEN).intValue();
            num = num.divide(BigInteger.TEN);
        }

        return sum;
    }
}
