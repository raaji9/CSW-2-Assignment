package Assignment3;

import java.util.Iterator;
import java.util.TreeMap;

class Address {
    private String plotNo;
    private String at;
    private String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    public String getPlotNo() {
        return plotNo;
    }

    public String getAt() {
        return at;
    }

    public String getPost() {
        return post;
    }
}

public class q07TreeMapWithAddress {
    public static void main(String[] args) {

        TreeMap<String, Address> addressMap = new TreeMap<>();

        addressMap.put("John", new Address("A-101", "Street 1", "City A"));
        addressMap.put("Alice", new Address("B-202", "Street 2", "City B"));
        addressMap.put("Bob", new Address("C-303", "Street 3", "City C"));

        System.out.println("Contents of TreeMap:");
        Iterator<String> iterator = addressMap.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            Address address = addressMap.get(name);

            System.out.println("Name: " + name +
                    ", Plot No: " + address.getPlotNo() +
                    ", At: " + address.getAt() +
                    ", Post: " + address.getPost());
        }
    }
}
