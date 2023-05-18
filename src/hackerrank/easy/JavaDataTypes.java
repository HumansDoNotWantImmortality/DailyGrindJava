package hackerrank.easy;

import java.util.Scanner;

public class JavaDataTypes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {

            try {

                long number = scanner.nextLong();

                System.out.println(number + " can be fitted in:");

                if (number >= -128 && number <= 127) {
                    System.out.println("* byte");
                }

                if (number >= -32_768 && number <= 32_767) {
                    System.out.println("* short");
                }

                if (number >= -2_147_483_648 && number <= 2_147_483_647) {
                    System.out.println("* int");
                }

                if (number >= -9_223_372_036_854_775_808L && number <= 9_223_372_036_854_775_807L) {
                    System.out.println("* long");
                }
            } catch (Exception e) {

                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}
