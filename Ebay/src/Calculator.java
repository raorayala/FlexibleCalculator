// Operation Enum

public class Calculator {

    // Basic Calculation Method
    public static double calculate(Operation op, double num1, double num2) {
        switch (op) {
            case ADD:
                return num1 + num2;
            case SUBTRACT:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            case DIVIDE:
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return num1 / num2;
            default:
                throw new UnsupportedOperationException("Operation not supported.");
        }
    }

    // Chaining Operations
    public static double chainOperations(double initialValue, Operation[] operations, double[] values) {
        if (operations.length != values.length) {
            throw new IllegalArgumentException("Operations and values length mismatch.");
        }

        double result = initialValue;
        for (int i = 0; i < operations.length; i++) {
            result = calculate(operations[i], result, values[i]);
        }
        return result;
    }
}
