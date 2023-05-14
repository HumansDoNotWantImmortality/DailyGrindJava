package exercism.triangle;

import java.util.Arrays;

public class Triangle {

    private final double[] sides;

    Triangle(double side1, double side2, double side3) throws TriangleException {

        sides = new double[]{side1, side2, side3};
        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[2]) {
            throw new TriangleException();
        }
    }

    boolean isEquilateral() {

        return sides[0] == sides[1] && sides[1] == sides[2];
    }

    boolean isIsosceles() {

        return sides[0] == sides[1] || sides[1] == sides[2];
    }

    boolean isScalene() {

        return sides[0] != sides[1] && sides[1] != sides[2];
    }
}
