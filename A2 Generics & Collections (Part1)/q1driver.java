package Assignment2;

import java.util.ArrayList;
import java.util.List;

class student<T extends Number> {
    private String name;
    private T rollNumber;
    private int age;

    public student(String name, T rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(T rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student " +"name: " + name + ", rollNumber: " + rollNumber +", age: " + age;
    }
}
public class q1driver{
    public static void main(String[] args) {
        List<student> students = new ArrayList<>();
        students.add(new student<>("Alice", 1, 20));
        students.add(new student<>("Bob", 2, 22));

        for (student student : students) {
            System.out.println(student.toString());
        }
    }
}