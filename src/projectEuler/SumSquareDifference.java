package projectEuler;

public class SumSquareDifference {

    private int optimized(int limit) {
        int sum = limit * (limit + 1) / 2;
        int sq = (2 * limit + 1) * (limit + 1) * limit / 6;
        return (sum * sum) - sq;
    }
}
