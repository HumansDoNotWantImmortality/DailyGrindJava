package hackerrank.easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];
        Set<String> persons = new HashSet<>();

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            persons.add(pair_left[i].concat(" ").concat(pair_right[i]));
            System.out.println(persons.size());
        }
    }
}
