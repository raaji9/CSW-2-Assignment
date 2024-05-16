interface Shape {
    double area();
    default void printArea() {
        System.out.println(area());
    }
}

public class q4 {
    public static void main(String[] args) {
        Shape cir = () -> Math.PI * Math.pow(5, 2);
        Shape sq = () -> Math.pow(5, 2);
        Shape rec = () -> 5 * 10;

        System.out.print("Area of Circle : ");
        cir.printArea();
        System.out.print("Area of Square : ");
        sq.printArea();
        System.out.print("Area of Rectangle : ");
        rec.printArea();
    }
}
