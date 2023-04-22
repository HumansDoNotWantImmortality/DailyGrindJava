package codewars.kyu6;

import java.util.Arrays;

public class ConvertStringToCamelCase {

    static String toCamelCase(String s) {

        String[] words = s.split("[^\\p{Alpha}]+");
        return Arrays.stream(words, 1, words.length)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .reduce(words[0], String::concat);
    }
}
