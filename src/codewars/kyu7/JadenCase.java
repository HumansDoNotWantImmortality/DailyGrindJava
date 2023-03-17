package codewars.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public String toJadenCase(String phrase) {

        if (null == phrase || phrase.length() == 0) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                .collect(Collectors.joining(" "));
    }
}
