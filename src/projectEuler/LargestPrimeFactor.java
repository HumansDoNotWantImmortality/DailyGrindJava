package projectEuler;

public class LargestPrimeFactor {

    private long largestPrimeFactor(long number) {
        long largestFactor = 1L;

        while (number % 2 == 0) {
            largestFactor = 2;
            number /= 2;
        }

        for (long i = 3L; i * i <= number; i += 2) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }

        if (number > 2) {
            largestFactor = number;
        }

        return largestFactor;
    }
}
