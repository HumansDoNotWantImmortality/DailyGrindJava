package codewars.kyu6;

public class Persist {

    public static int persistence(long n) {

        int presist = 0;
        while (n >= 10) {
            n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
            presist++;
        }

        return presist;
    }
}
