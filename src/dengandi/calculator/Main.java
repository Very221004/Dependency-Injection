package dengandi.calculator;

public class Main {
    public static void main(String[] args) {

        // Pakai tambah
        Calculator calc1 = new Calculator(new Addition());
        calc1.calculate(5, 3); // Result: 8

        // Ganti ke kali
        Calculator calc2 = new Calculator(new Multiplication());
        calc2.calculate(5, 3); // Result: 15

        // Ganti ke kurang
        Calculator calc3 = new Calculator(new Subtraction());
        calc3.calculate(5, 3); // Result: 2
    }
}
