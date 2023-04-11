package projectEuler;

public class Prime10001st {

    private int nthPrime(int n) {
        int count = 1;
        int num = 3;
        while (count < n) {
            if (isPrime(num)) {
                count++;
            }
            num += 2;
        }
        return num - 2;
    }

    private boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}