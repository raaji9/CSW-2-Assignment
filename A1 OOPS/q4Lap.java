package Assignment1;

class Laptop {
    private String model;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "model: " + model +"; price: " + price;
    }
}
public class q4Lap {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
        laptop.setModel("Asus TUF-F15");
        laptop.setPrice(1500.0);
        System.out.println("Laptop: " + laptop);
	}

}
