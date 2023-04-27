package codewars.kyu6;

public class MorseCodeDecoder {

    public static String decode(String morseCode) {

        if (morseCode.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        for (String word : morseCode.trim().split(" {3}")) {
            for (String letter : word.split(" ")) {
//                result.append(MorseCode.get(letter));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}
