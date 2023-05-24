package hackerrank.easy;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        BitSet bitSet1 = new BitSet(N);
        BitSet bitSet2 = new BitSet(N);

        for (int i = 0; i < M; i++) {
            String command = sc.next();
            int operand1 = sc.nextInt();
            int operand2 = sc.nextInt();
            boolean flag = operand1 == 1;

            switch (command) {
                case "AND" -> {
                    if (flag) bitSet1.and(bitSet2);
                    else bitSet2.and(bitSet1);
                }
                case "OR" -> {
                    if (flag) bitSet1.or(bitSet2);
                    else bitSet2.or(bitSet1);
                }
                case "XOR" -> {
                    if (flag) bitSet1.xor(bitSet2);
                    else bitSet2.xor(bitSet1);
                }
                case "FLIP" -> {
                    if (flag) bitSet1.flip(operand2);
                    else bitSet2.flip(operand2);

                }
                case "SET" -> {
                    if (flag) bitSet1.set(operand2);
                    else bitSet2.set(operand2);
                }
                default -> System.out.println("Wrong command");
            }

            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }

        sc.close();
    }
}
