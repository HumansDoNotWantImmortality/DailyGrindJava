package exercism;

import java.util.Objects;

public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (Objects.isNull(operation)) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        try {
            return switch (operation) {
                case "+" -> operand1 + " + " + operand2 + " = " + (operand1 + operand2);
                case "*" -> operand1 + " * " + operand2 + " = " + (operand1 * operand2);
                case "/" -> operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                default -> throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            };
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
