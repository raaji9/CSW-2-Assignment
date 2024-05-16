interface SqFunc {
    int square(int x);
}

public class q6 {
    public static SqFunc getSquareFunction() {
        return x -> x * x;
    }

    public static void main(String[] args) {
        SqFunc squareFunction = getSquareFunction();

        // Demonstrate the use of the returned function to calculate squares
        System.out.println("Square of 5: " + squareFunction.square(5));
        System.out.println("Square of 8: " + squareFunction.square(8));
        System.out.println("Square of -3: " + squareFunction.square(-3));
    }
}
