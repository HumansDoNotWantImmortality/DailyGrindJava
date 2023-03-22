package codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {

    public static String reverseWords(final String original) {

        return Arrays.stream(original.split("(?<=\\s) | (?=\\s+)"))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining());
    }
}
