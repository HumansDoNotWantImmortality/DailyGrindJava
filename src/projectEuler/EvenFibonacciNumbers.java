package projectEuler;

public class EvenFibonacciNumbers {

    private int calculateEvenFibonacciSum(int limit) {
        int sum = 0;
        int a = 1;
        int b = 1;
        int c = a + b;

        while (c <= limit) {
            if (c % 2 == 0) {
                sum += c;
            }

            a = b + c;
            b = c + a;
            c = a + b;
        }

        return sum;
    }
}
