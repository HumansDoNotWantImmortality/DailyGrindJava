package codewars.kyu7;

public class Maskify {

    public static String maskify(String str) {

        return str.replaceAll(".(?=.{4})", "#");
    }
}
