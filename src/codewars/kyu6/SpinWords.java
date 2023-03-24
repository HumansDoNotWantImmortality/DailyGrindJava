package codewars.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(word -> word.length() > 4 ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }
}
