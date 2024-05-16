package Assignment1;

class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    String getMake() {
        return make;
    }

    void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class q1CarTester {
    public static void main(String[] args) {
        Car Ford = new Car("F-150", "Supercharged V8");
        Car BMW = new Car(null, null);

        System.out.println("make and model of Ford: " + Ford.getMake() + " " + Ford.getModel());
        System.out.println("make and model of BMW: " + BMW.getMake() + " " + BMW.getModel());

        BMW.setMake("iX1");
        BMW.setModel("three-cylinder turbocharged petrol engine");

        System.out.println("new make and model of BMW: " + BMW.getMake() + " " + BMW.getModel());
    }
}