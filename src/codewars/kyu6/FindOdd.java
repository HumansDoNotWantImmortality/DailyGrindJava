package codewars.kyu6;

public class FindOdd {

    public static int findIt(int[] a) {

        int odd = 0;
        for (int number : a) {
            odd ^= number;
        }

        return odd;
    }
}
