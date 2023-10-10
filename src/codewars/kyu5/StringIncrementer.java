package codewars.kyu5;

import java.math.BigInteger;
import java.util.Objects;
import java.util.regex.Pattern;

public class StringIncrementer {

    public static String incrementString(String str) {

        if (Objects.isNull(str)) {
            throw new IllegalArgumentException("Argument can not be null");
        }

        String stringWithIncrementedNumber  = Pattern.compile("(\\d+)$").matcher(str)
                .replaceAll(numericPart  -> String.format("%0" + numericPart.group().length() +"d",
                        new BigInteger(numericPart.group()).add(BigInteger.ONE)));
        return stringWithIncrementedNumber.matches(".*(?<!\\d)")
                ? stringWithIncrementedNumber + 1
                : stringWithIncrementedNumber;
    }
}
