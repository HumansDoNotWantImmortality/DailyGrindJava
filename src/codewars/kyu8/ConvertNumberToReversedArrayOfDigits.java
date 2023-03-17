package codewars.kyu8;

public class ConvertNumberToReversedArrayOfDigits {

    public static int[] digitize(long n) {

        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
