package exercism;

import java.util.List;

public class BinarySearch {
    private final List<Integer> items;

    BinarySearch(List<Integer> items) {
        this.items = items;
    }

    int indexOf(int item) throws ValueNotFoundException {
         int result = items.indexOf(item);
         if (result == -1) throw new ValueNotFoundException("Value not in array");
         return result;
    }
}
