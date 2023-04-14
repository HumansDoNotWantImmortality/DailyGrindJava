package projectEuler;

public class SummationOfPrimes {

    //Sieve of Eratosthenes algorithm
    public static long getSumOfPrimesBelowLimit(int limit) {
        boolean[] isComposite = new boolean[limit];
        long sum = 0;

        for (int i = 2; i < limit; i++) {
            if (!isComposite[i]) {
                sum += i;
                for (int j = i * i; j < limit; j += i) {
                    isComposite[j] = true;
                }
            }
        }

        return sum;
    }
}
