package codewars.kyu6;

public class DigPow {

    public static long digPow(int n, int p) {

        char[] digits = String.valueOf(n).toCharArray();

        int sum = 0;
        for (char digit : digits) {
            sum += (int) Math.pow(digit - '0', p);
            p++;
        }

        return sum % n == 0 ? sum / n : -1;
    }
}
