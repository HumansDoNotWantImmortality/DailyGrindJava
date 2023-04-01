package codewars.kyu6;

import java.util.HashMap;

public class CountingDuplicates {

    public static int duplicateCount(String text) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : text.toLowerCase().toCharArray()) {
            map.put(ch, map.containsKey(ch) ? 1 : 0);
        }

        return (int) map.values().stream().filter(x -> x > 0).count();
    }
}
