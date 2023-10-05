package codewars.kyu5;

import java.util.Arrays;

public class ProdFib {

    public static long[] productFib(long prod) {
        long a = 0;
        long b = 1;

        while (a * b < prod) {
            long c = a;
            a = b;
            b = c + b;
        }

        return new long[] {a, b, a * b == prod ? 1 : 0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(4895)));
    }
}
