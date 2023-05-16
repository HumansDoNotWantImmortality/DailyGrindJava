package hackerrank.medium;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(in.hasNext()){

            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

        in.close();
    }

    private static class MyRegex {

        private final String pattern = "((2[0-5][0-5]|[01]?\\d{1,2})\\.){3}(2[0-5][0-5]|[01]?\\d{1,2})";
    }
}
