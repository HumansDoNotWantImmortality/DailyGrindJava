package codewars.kyu6;

import java.util.Arrays;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {

        double[] firstNElements = Arrays.copyOf(s, n);
        for (int i = 3; i < n; i++) {
            firstNElements[i] = firstNElements[i - 1] + firstNElements[i - 2] + firstNElements[i - 3];
        }

        return firstNElements;
    }
}
