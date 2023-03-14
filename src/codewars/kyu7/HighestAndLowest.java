package codewars.kyu7;

import static java.util.Arrays.stream;

public class HighestAndLowest {
    static String highAndLow(String numbers) {
        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }
}
