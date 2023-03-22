package codewars.kyu7;

public class NthSeries {

    public static String seriesSum(int n) {

        double sSum = 0;
        for (int i = 0; i < n; i++)
            sSum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sSum);
    }
}
