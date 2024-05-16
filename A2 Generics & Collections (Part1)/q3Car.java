package Assignment2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class q3Car implements Comparable<q3Car> {
    private String model;
    private String color;
    private int speed;

    public q3Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(q3Car other) {
        return Integer.compare(this.speed, other.speed);
    }

    public static Comparator<q3Car> SPEED_COMPARATOR = new Comparator<q3Car>() {
        @Override
        public int compare(q3Car o1, q3Car o2) {
            return Integer.compare(o1.getSpeed(), o2.getSpeed());
        }
    };

    public static void main(String[] args) {
        q3Car car1 = new q3Car("Car1", "Red", 60);
        q3Car car2 = new q3Car("Car2", "Blue", 80);

        if (car1.compareTo(car2) > 0) {
            System.out.println(car1.toString() + " has a higher speed than " + car2.toString());
        } else if (car1.compareTo(car2) < 0) {
            System.out.println(car2.toString() + " has a higher speed than " + car1.toString());
        } else {
            System.out.println("The cars have the same speed.");
        }

        q3Car fasterCar = Collections.max(List.of(car1, car2), q3Car.SPEED_COMPARATOR);
        System.out.println("The faster car is: " + fasterCar.toString());
    }
}