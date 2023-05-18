package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            list.add(scanner.tokens()
                    .limit(d)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList()));
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int y = scanner.nextInt() - 1;
            int x = scanner.nextInt() - 1;

            if (list.isEmpty() || x >= list.get(y).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(list.get(y).get(x));
            }
        }
    }
}
