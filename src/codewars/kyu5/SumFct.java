package codewars.kyu5;

import java.math.BigInteger;

public class SumFct {

    public static BigInteger perimeter(BigInteger n) {

        BigInteger a;
        BigInteger b = BigInteger.ONE;
        BigInteger temp = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = temp;
            temp = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(5)));
    }
}
