package codewars.kyu5;

import java.awt.Color;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", validate(r), validate(g), validate(b));
    }

    private static int validate(int i) {
        return i > 0 ? Math.min(255, i) : 0;
    }
}
