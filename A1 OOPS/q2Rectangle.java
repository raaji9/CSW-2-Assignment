package Assignment1;

class RectangleTester {
    private double length;
    private double width;

    public void Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class q2Rectangle{
    public static void main(String[] args) {
        RectangleTester rectangle = new RectangleTester();
        rectangle.setLength(7);
        rectangle.setWidth(12);

        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}