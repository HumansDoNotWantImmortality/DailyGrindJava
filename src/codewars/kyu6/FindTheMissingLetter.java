package codewars.kyu6;

public class FindTheMissingLetter {

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    }

    public static char findMissingLetter(char[] array) {
        char expectedLetter = array[0];
        for (char l : array) {
            if (l != expectedLetter) break;
            expectedLetter++;
        }
        return expectedLetter;
    }
}
