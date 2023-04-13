package projectEuler;

public class LargestProducInASeries {

    public static long findGreatestProduct(String number, int adjacentDigits) {
        long maxProduct = 0;

        for (int i = 0; i <= number.length() - adjacentDigits; i++) {
            long product = 1;
            for (int j = i; j < i + adjacentDigits; j++) {
                product *= Character.getNumericValue(number.charAt(j));
            }
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        return maxProduct;
    }
}
