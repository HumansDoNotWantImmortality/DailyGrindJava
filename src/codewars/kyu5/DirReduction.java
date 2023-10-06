package codewars.kyu5;

import java.util.Stack;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {

        final Stack<String> dirs = new Stack<>();

        for (final String direction : arr) {

            final String lastElement = dirs.size() > 0 ? dirs.lastElement() : null;

            switch (direction) {
                case "NORTH" -> {
                    if ("SOUTH".equals(lastElement)) {
                        dirs.pop();
                    } else {
                        dirs.push(direction);
                    }
                }
                case "SOUTH" -> {
                    if ("NORTH".equals(lastElement)) {
                        dirs.pop();
                    } else {
                        dirs.push(direction);
                    }
                }
                case "EAST" -> {
                    if ("WEST".equals(lastElement)) {
                        dirs.pop();
                    } else {
                        dirs.push(direction);
                    }
                }
                case "WEST" -> {
                    if ("EAST".equals(lastElement)) {
                        dirs.pop();
                    } else {
                        dirs.push(direction);
                    }
                }
            }
        }

        return dirs.toArray(String[]::new);
    }
}
