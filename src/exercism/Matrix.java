package exercism;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.range;

class Matrix {

    private final int rows;
    private final int columns;
    private final int[] rowsMax;
    private final int[] columnsMin;

    Matrix(List<List<Integer>> values) {
        this.rows = values.size();
        this.columns = rows > 0 ? values.get(0).size() : 0;

        this.rowsMax = values.stream()
                .mapToInt(row -> row.stream()
                        .mapToInt(Integer::intValue)
                        .max().orElseThrow())
                .toArray();

        this.columnsMin = range(0, columns)
                .map(column -> range(0, rows)
                        .map(i -> values.get(i)
                                .get(column)).min()
                        .orElseThrow())
                .toArray();
    }

    Set <MatrixCoordinate> getSaddlePoints() {
        return range(0, rows).boxed()
                .flatMap(row -> range(0, columns)
                        .filter(column -> rowsMax[row] == columnsMin[column])
                        .mapToObj(column -> new MatrixCoordinate(row + 1, column + 1)))
                .collect(Collectors.toSet());
    }
}
