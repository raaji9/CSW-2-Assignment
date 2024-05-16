interface FactlCalc {
    int calculate(int n);
}

public class q7 {
    public static void main(String[] args) {
        FactlCalc FactlCalc = calculateFactorial();
        
        int number = 5;
        int factorial = FactlCalc.calculate(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    private static FactlCalc calculateFactorial() {
        FactlCalc finalFactlCalc = n -> {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial().calculate(n - 1);
            }
        };
        return finalFactlCalc;
    }
}
