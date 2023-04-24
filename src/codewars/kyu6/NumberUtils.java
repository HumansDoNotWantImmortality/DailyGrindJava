package codewars.kyu6;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        char[] digits = String.valueOf(number).toCharArray();

        int sum = 0;
        for (char digit : digits) {
            sum += Math.pow(digit - '0', digits.length);
        }

        return sum == number;
    }
}
