package hackerrank.easy;

import java.io.IOException;
import java.util.Scanner;

public class Java1DArray {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.nextLine());
        }

        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
