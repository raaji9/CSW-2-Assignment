package Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    // Parameterized constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}

public class q02ArrayListUser {
    public static void main(String[] args) {
        // Creating ArrayList of User objects
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("John", 25));
        userList.add(new User("Alice", 30));
        userList.add(new User("Bob", 22));

        // Retrieving and printing name and age of users
        System.out.println("User List Before Sorting:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }

        // Sorting users based on age
        Collections.sort(userList, Comparator.comparingInt(User::getAge));

        // Printing updated ArrayList after sorting
        System.out.println("\nUser List After Sorting by Age:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}
