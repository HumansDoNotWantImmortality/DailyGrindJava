package codewars.kyu7;

import static java.util.Arrays.stream;

public class OddOrEven {

    static String oddOrEven(final int[] array) {

        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
