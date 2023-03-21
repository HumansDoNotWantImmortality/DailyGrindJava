package codewars.kyu7;

import java.util.ArrayList;

public class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.parallelStream().mapToInt((int[] stop) -> stop[0] - stop[1]).sum();
    }
}
