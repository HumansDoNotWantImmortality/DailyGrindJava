package hackerrank.easy;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        System.out.println(findDay(month, day, year));
    }

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
}
