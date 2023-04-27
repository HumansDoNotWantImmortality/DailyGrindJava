package hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.printf("%d %s%n", counter, line);
            counter++;
        }

        scanner.close();
    }
}
