package projectEuler;

public class MultiplesOf3Or5 {

    private int multiplesOf3Or5(int number) {
        int sum = 0;
        for (int i = 3; i < number; i += 3) {
            sum += i;
        }
        for (int i = 5; i < number; i += 5) {
            if (i % 3 == 0) continue;
            sum += i;
        }

        return sum;
    }
}
