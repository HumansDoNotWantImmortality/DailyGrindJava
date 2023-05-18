package hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine().trim());

        reader.close();

        for (int i = 1; i <= 10; i++) {
            int product = N * i;
            System.out.printf("%d x %d = %d%n", N, i, product);
        }
    }
}
