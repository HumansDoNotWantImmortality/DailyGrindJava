package codewars.kyu5;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> str1CountedChars = countLetters(str1);
        Map<Character, Integer> str2CountedChars = countLetters(str2);

        for (Character letter : str2CountedChars.keySet()) {
            Integer number = str1CountedChars.get(letter);
            if (number == null || number < str2CountedChars.get(letter)) {
                return false;
            }
        }

        return true;
    }

    private static Map<Character, Integer> countLetters(String str) {
        Map<Character, Integer> countedLetters = new HashMap<>();

        for (char letter : str.toCharArray()) {
            countedLetters.merge(letter, 1, Integer::sum);
        }

        return countedLetters;
    }
}
