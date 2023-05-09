package exercism;

public class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {

        int sum = (input * (input + 1)) / 2;
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {

        int sum = (input * (input + 1) * (input * 2 + 1)) / 6;
        return sum;
    }

    int computeDifferenceOfSquares(int input) {

        int squareOfSum = this.computeSquareOfSumTo(input);
        int sumOfSquare = this.computeSumOfSquaresTo(input);
        return squareOfSum - sumOfSquare;
    }

}
