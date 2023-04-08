package projectEuler;

public class SmallestMultiple {

    private int bruteForce(int num) {
        while (true) {
            boolean isDivisible = true;
            for (int i = 1; i <= 20; i++) {
                if (num % i != 0) {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                return num;
            }
            num++;
        }
    }
}
