package codewars.kyu8;

import java.util.Arrays;

public class InvertValues {
    public static int[] invert(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);

        for(int i = 0; i < copy.length; i++) {
            copy[i] *= -1;
        }

        return copy;
    }
}
