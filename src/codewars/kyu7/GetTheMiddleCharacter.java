package codewars.kyu7;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {

        int length = word.length();
        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
    }
}
