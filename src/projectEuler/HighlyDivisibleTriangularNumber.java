package projectEuler;

public class HighlyDivisibleTriangularNumber {

    public static void main(String[] args) {
        System.out.println(findFirstTriangleNumberWithOverNDivisors(500));
    }

    private static long findFirstTriangleNumberWithOverNDivisors(int n) {
        long number = 1;
        while (true) {
            long triangleNumber = findTriangleNumber(number);
            int numberOfDivisors = countDivisors(triangleNumber);
            if (numberOfDivisors > n) {
                return triangleNumber;
            }
            number++;
        }
    }

    private static long findTriangleNumber(long number) {
        return (number * (number + 1)) / 2;
    }

    private static int countDivisors(long number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                count += 2;
            }
        }

        if (Math.sqrt(number) * Math.sqrt(number) == number) {
            count--;
        }
        return count;
    }
}
