package dengandi.calculator;

public class Calculator {

    private Operation operation;

    // Dependency di-inject lewat constructor
    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public void calculate(int a, int b) {
        int result = operation.execute(a, b);
        System.out.println("Result: " + result);
    }
}
