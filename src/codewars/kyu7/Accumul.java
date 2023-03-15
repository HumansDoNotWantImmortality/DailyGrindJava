package codewars.kyu7;

public class Accumul {
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        for(char ch : s.toCharArray()) {
            if(i > 0) {
                sb.append('-');
            }
            sb.append(Character.toUpperCase(ch));
            for(int j = 0; j < i; j++) {
                sb.append(Character.toLowerCase(ch));
            }
            i++;
        }

        return sb.toString();
    }
}
