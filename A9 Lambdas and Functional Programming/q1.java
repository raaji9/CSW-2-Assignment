interface Calc {
    double operate(double a, double b);
}

public class q1 {
    public static void main(String[] args) {
        Calc addition = (a, b) -> a + b;
        Calc subtraction = (a, b) -> a - b;
        Calc multiplication = (a, b) -> a * b;
        Calc division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.operate(10, 5));
        System.out.println("Subtraction: " + subtraction.operate(10, 5));
        System.out.println("Multiplication: " + multiplication.operate(10, 5));
        System.out.println("Division: " + division.operate(10, 5));
    }
}
