package Assignment3;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private int modalNo;
    private String name;
    private int stock;

    public Car(int modalNo, String name, int stock) {
        this.modalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }

    public int getModalNo() {
        return modalNo;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.getStock());
    }
}

public class q03CarApp {
    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(2013, "Creta", 10));
        carList.add(new Car(2020, "MG", 13));
        carList.add(new Car(2018, "Kia", 20));
        carList.add(new Car(2017, "Audi", 45));
        carList.add(new Car(2015, "BMW", 55));

        Collections.sort(carList);

        System.out.println("List of Sorted Car Objects:");
        for (Car car : carList) {
            System.out.println(car.getModalNo() + " " + car.getName() + " " + car.getStock());
        }
    }
}
