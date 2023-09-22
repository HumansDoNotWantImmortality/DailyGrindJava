package exercism;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Robot {
    private static final Set<String> usedNames = new HashSet<>();
    private static final Random random = new Random();

    private String name;

    public Robot() {
        this.name = createRobotName();
    }

    private String createRobotName() {
        String name;
        do {
            name = generateName();
        } while (usedNames.contains(name));
        usedNames.add(name);
        return name;
    }

    private String generateChars(char from, char to, int len) {
        return random.ints(from, to + 1)
                .limit(len)
                .mapToObj(ch -> Character.toString((char) ch))
                .collect(Collectors.joining());
    }

    private String generateName() {
        return generateChars('A', 'Z', 2) + generateChars('0', '9', 3);
    }


    void reset() {
        usedNames.remove(this.name);
        this.name = createRobotName();
    }

    public String getName() {
        return name;
    }
}
