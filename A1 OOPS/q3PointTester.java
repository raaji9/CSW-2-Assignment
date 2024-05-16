package Assignment1;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x; 
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x=" + x +"; y=" + y;
    }
}
public class q3PointTester {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(p1);

        System.out.println("point p1: " + p1);
        System.out.println("point p2: " + p2);

        p1.setX(5);
        p1.setY(6);

        System.out.println("new point p1: " + p1);
        System.out.println("old point p2: " + p2);
    }
}
