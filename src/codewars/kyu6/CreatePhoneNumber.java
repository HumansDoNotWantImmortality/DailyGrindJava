package codewars.kyu6;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {

        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }
}
