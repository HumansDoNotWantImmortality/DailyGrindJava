package codewars.kyu8;

import java.util.Arrays;

public class SquareNSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(x -> x * x).sum();
    }
}
