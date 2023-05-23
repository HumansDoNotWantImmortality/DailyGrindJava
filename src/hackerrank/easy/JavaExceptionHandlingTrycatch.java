package hackerrank.easy;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTrycatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException | ArithmeticException e) {
            if (e instanceof InputMismatchException)
                System.out.println("java.util.InputMismatchException");
            else System.out.println(e);
        }

        sc.close();
    }
}
