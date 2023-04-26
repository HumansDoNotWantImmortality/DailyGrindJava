package codewars.kyu6;

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;

        int x = 0;
        int y = 0;

        for (char direction : walk) {
            switch (direction) {
                case 'n' -> y++;
                case 's' -> y--;
                case 'w' -> x++;
                case 'e' -> x--;
            }
        }

        return x == 0 && y == 0;
    }
}
