package codewars.kyu6;

import java.util.HashMap;
import java.util.Map;

public class PangramChecker {

    public boolean check(String sentence){
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
}
