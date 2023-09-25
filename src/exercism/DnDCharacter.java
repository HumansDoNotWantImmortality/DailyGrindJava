package exercism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class DnDCharacter {

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;

    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitpoints = 10 + modifier(getConstitution());
    }

    int ability(List<Integer> scores) {
        if (scores.size() != 4) throw new IllegalArgumentException("You have to roll 4 times");

        List<Integer> copy = new ArrayList<>(scores);
        copy.remove(Collections.min(copy));

        return copy.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    List<Integer> rollDice() {
        int min = 1;
        int max = 6;

        return ThreadLocalRandom.current()
                .ints(4, min, max + 1)
                .boxed()
                .toList();
    }

    int modifier(int input) {
        return (int) Math.floor((double) (input - 10) /2);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
