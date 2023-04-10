package projectEuler;

public class LargestPalindromeProduct {

    // start == smallest n-digit number, end == highest n-digit number
    public static int findLargestPalindrome(int start, int end) {
        int max = 0;
        for (int i = end; i >= start; i--) {
            if (i * i < max) {
                break;
            }
            for (int j = i; j >= start; j--) {
                int product = i * j;
                if (product < max) {
                    break;
                }
                if (isPalindrome(product) && product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
