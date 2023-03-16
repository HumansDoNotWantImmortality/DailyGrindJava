package codewars.kyu7;

public class isogram {
    public static boolean  isIsogram(String str) {
        return str.toLowerCase().matches("(?:([a-z])(?!.*\\1))*");
    }
}
