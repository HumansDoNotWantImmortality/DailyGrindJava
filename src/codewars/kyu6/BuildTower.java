package codewars.kyu6;

public class BuildTower {

    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        String spacePadding;

        for (int i = 0; i < nFloors; i++)
            tower[i] = (spacePadding =
                    " ".repeat(nFloors - i - 1))
                    + "*".repeat(i + i + 1)
                    + spacePadding;

        return tower;
    }
}
