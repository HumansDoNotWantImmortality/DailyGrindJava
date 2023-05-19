package hackerrank.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JavaMap {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();

        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();

            phoneBook.put(name, phone);
        }

        while(in.hasNext()) {
            String s = in.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));;
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
