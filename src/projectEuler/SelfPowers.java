package projectEuler;

import java.math.BigInteger;

public class SelfPowers {

    private static final BigInteger MODULUS = BigInteger.TEN.pow(10);

    // modular arithmetic for better performance (avoid unnecessary calculations on larger numbers)
    private String last10DigitsOfSelfPowerSeries(int power) {

        BigInteger sum = BigInteger.ZERO;

        for (int i = 1; i <= power; i++) {
            BigInteger term = BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), MODULUS);
            sum = sum.add(term).mod(MODULUS);
        }

        return sum.toString();
    }
}
