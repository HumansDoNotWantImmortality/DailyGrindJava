package codewars.kyu5;

import java.util.Arrays;

public class Max {

    public static int sequence(int[] arr) {
        // Kadane's algorithm
        int max_ending_here = 0;
        int max_so_far = 0;
        for (int number : arr) {
            max_ending_here = Math.max(0, max_ending_here + number);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}
