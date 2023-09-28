package exercism;

import java.util.HashSet;

public class IsogramChecker {

    boolean isIsogram(String phrase) {
        return phrase.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .allMatch(new HashSet<>()::add);
    }
}
