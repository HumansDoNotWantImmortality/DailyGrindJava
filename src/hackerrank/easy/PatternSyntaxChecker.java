package hackerrank.easy;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tests = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < tests; i++) {
            try {
                Pattern pattern = Pattern.compile(sc.nextLine());
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}
