package codewars.kyu8;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean present : arrayOfSheeps) {
            if (Boolean.TRUE.equals(present)) {
                counter += 1;
            }
        }
        return counter;
    }
}
