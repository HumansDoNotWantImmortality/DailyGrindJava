package projectEuler;

public class PythagoreanTriplet {

    public static int pythagoreanTripletProduct(int sum) {
        for (int a = 1; a < sum / 3; a++) {
            for (int b = a + 1; b < sum / 2; b++) {
                int c = sum - a - b;
                if (a*a + b*b == c*c) {
                    return a * b * c;
                }
            }
        }
        return -1;
    }
}
