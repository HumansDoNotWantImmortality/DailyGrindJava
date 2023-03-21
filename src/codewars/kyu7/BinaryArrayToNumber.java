package codewars.kyu7;

import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        StringBuilder sb = new StringBuilder(binary.size());

        for(int num : binary)
            sb.append(num);

        return Integer.parseInt(sb.toString(),2);
    }
}
