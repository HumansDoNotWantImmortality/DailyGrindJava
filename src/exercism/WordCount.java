package exercism;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class WordCount {
    public Map<String, Integer> phrase(String input) {
        return Arrays.stream(input
                        .toLowerCase()
                        .replaceAll("[^a-z0-9' ]", " ")
                        .trim()
                        .split("\\s+"))
                .map(word -> word.replaceAll("^'|'$", ""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, word -> word.getValue().intValue()));
    }
}
