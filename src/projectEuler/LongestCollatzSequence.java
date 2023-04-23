package projectEuler;

import java.util.ArrayList;
import java.util.List;

public class LongestCollatzSequence {

    private long startingNumberWithLongestChain(long number) {

        long numberWithLongestChain = 0;
        List<Long> longestSequence = new ArrayList<>();

        for (long i = 1; i < number; i++) {

            List<Long> sequence = collatzSequence(i);
            if (sequence.size() > longestSequence.size()) {
                longestSequence = sequence;
                numberWithLongestChain = i;
            }
        }

        return numberWithLongestChain;
    }

    private List<Long> collatzSequence(long number) {

        List<Long> numbers = new ArrayList<>();
        numbers.add(number);

        while (number > 1) {

            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = (number * 3) + 1;
            }
            numbers.add(number);
        }

        return numbers;
    }
}
