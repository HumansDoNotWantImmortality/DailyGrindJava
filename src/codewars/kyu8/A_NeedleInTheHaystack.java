package codewars.kyu8;

public class A_NeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
    }
}
