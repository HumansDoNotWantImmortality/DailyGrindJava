package exercism;

public class Scrabble {

    private final String word;

    Scrabble(String word) {

        if (word == null) {
            throw new IllegalArgumentException("Input word cannot be null.");
        }

        this.word = word;
    }

    int getScore() {

        int score = 0;
        String uppperString = word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {

            switch (uppperString.charAt(i)) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> score += 1;
                case 'D', 'G' -> score += 2;
                case 'B', 'C', 'M', 'P' -> score += 3;
                case 'F', 'H', 'V', 'W', 'Y' -> score += 4;
                case 'K' -> score += 5;
                case 'J', 'X' -> score += 8;
                case 'Q', 'Z' -> score += 10;
            }
        }

        return score;
    }
}
