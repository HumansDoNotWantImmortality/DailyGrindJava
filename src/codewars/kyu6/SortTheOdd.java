package codewars.kyu6;

import java.util.Arrays;

public class SortTheOdd {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));
    }

    public static int[] sortArray(int[] array) {
        int[] sortedOdd = Arrays.stream(array)
                .filter(i -> i % 2 != 0)
                .sorted()
                .toArray();

        for (int i = 0, j = 0; j < sortedOdd.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = sortedOdd[j++];
            }
        }

        return array;
    }
}
