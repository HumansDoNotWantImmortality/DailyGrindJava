package exercism;

import java.util.Arrays;

public class ResistorColor {
    String[] colors =  new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        return Arrays.asList(colors()).indexOf(color);
    }

    String[] colors() {
        return colors;
    }
}
