package hackerrank.medium;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("MD5");
        m.reset();
        m.update(input.nextLine().getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
        input.close();
        System.out.println();
    }
}
