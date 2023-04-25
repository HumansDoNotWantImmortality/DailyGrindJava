package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIfElse {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine().trim());

        reader.close();

        if (N % 2 != 0 || (N >= 6 && N <= 20)) {
            System.out.println("Weird");
        } else if ((N >= 2 && N <= 5) || N > 20) {
            System.out.println("Not Weird");
        }
    }
}
