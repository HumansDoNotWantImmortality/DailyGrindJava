package codewars.kyu8;

public class Multiply {
    public static Double multiply(Double a, Double b) {
        if (a == null || b == null) throw new IllegalArgumentException("Not null bro");
        return a * b;
    }
}
