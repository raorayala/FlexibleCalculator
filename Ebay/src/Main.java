// Main Class with Testing
public class Main {
    public static void main(String[] args) {
        // Basic Calculation Tests
        System.out.println("Basic Calculation Tests:");
        System.out.println("Add: " + Calculator.calculate(Operation.ADD, 2, 3));
        System.out.println("Subtract: " + Calculator.calculate(Operation.SUBTRACT, 5, 3));
        System.out.println("Multiply: " + Calculator.calculate(Operation.MULTIPLY, 4, 2));
        System.out.println("Divide: " + Calculator.calculate(Operation.DIVIDE, 10, 2));
       
        // Chaining Operations Test
        System.out.println("\nChaining Operations Test:");
        Operation[] operations = {Operation.ADD, Operation.MULTIPLY, Operation.SUBTRACT};
        double[] values = {5, 2, 3};
        double initialValue = 10;
        System.out.println("Chained Result: " + Calculator.chainOperations(initialValue, operations, values));
    }
}
