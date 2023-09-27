package exercism;

import java.util.Arrays;
import java.util.List;

public class ResistorColorDuo {

    private final List<String> colorsIndex =
            Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");

    int value(String[] colors) {
        return colorsIndex.indexOf(colors[0]) * 10 + colorsIndex.indexOf(colors[1]);
    }
}
