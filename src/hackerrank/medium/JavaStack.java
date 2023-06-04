package hackerrank.medium;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            System.out.println(isBalanced(sc.next()));
        }
        sc.close();
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (stack.empty()) {
                return false;
            } else {
                char last = stack.pop();
                if ((last == '{' && ch != '}')
                        || (last == '[' && ch != ']')
                        || (last == '(' && ch != ')')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
