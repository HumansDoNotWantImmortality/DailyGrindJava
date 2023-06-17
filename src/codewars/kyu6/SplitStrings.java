package codewars.kyu6;

import java.util.Arrays;

public class SplitStrings {

    public static String[] solution(String s) {
        s = (s.length() % 2 == 0) ? s : s + "_";
        return s.split("(?<=\\G.{2})");
    }
}
