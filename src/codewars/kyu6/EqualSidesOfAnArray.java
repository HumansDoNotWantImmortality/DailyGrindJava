package codewars.kyu6;

public class EqualSidesOfAnArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,100,50,-51,1,1};
        System.out.println(findEvenIndex(arr));
    }

    public static int findEvenIndex(int[] arr) {
        int rightSum = 0;
        int leftSum = 0;

        for (int j : arr) {
            rightSum += j;
        }

        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
}
