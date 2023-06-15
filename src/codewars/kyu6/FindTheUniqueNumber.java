package codewars.kyu6;

public class FindTheUniqueNumber {

    public static double findUniq(double arr[]) {
        double match = arr[0] == arr[1] ? arr[0] : arr[2];
        for (double d : arr)
            if (match != d) return d;
        return 0;
    }
}
