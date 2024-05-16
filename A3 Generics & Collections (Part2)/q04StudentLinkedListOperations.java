package Assignment3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double marks;
    
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age &&
                Double.compare(student.marks, marks) == 0 &&
                name.equals(student.name);
    }
}

public class q04StudentLinkedListOperations {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();

        // Adding sample Student objects to the LinkedList
        studentList.add(new Student("John", 20, 85.5));
        studentList.add(new Student("Alice", 22, 90.0));
        studentList.add(new Student("Bob", 21, 78.5));

        displayList(studentList);

        checkStudentExistence(studentList);

        removeStudent(studentList);

        int count = studentList.size();
        System.out.println("\nNumber of Student objects in the list: " + count);

        checkEqualsMethod();

    }

    private static void displayList(List<Student> studentList) {
        System.out.println("List of Students:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() +
                    ", Age: " + student.getAge() +
                    ", Marks: " + student.getMarks());
        }
    }

    private static void checkStudentExistence(List<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter details to check the existence of a Student:");

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        Student studentToCheck = new Student(name, age, marks);

        boolean containsReference = studentList.contains(studentToCheck);
        System.out.println("Does the object exist in the list (using reference)? " + containsReference);

        boolean containsEquals = studentList.stream().anyMatch(student -> student.equals(studentToCheck));
        System.out.println("Does the object exist in the list (using equals method)? " + containsEquals);
    }

    private static void removeStudent(List<Student> studentList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index of the Student to remove: ");
        int indexToRemove = scanner.nextInt();

        if (indexToRemove >= 0 && indexToRemove < studentList.size()) {
            Student removedStudent = studentList.remove(indexToRemove);
            System.out.println("Removed Student: " +
                    "Name: " + removedStudent.getName() +
                    ", Age: " + removedStudent.getAge() +
                    ", Marks: " + removedStudent.getMarks());

            System.out.println("List after removal:");
            displayList(studentList);
        } else {
            System.out.println("Invalid index. No Student removed.");
        }
    }

    private static void checkEqualsMethod() {
        Student student1 = new Student("John", 20, 85.5);
        Student student2 = new Student("John", 20, 85.5);

        boolean areEqual = student1.equals(student2);
        System.out.println("\nDo the two Student objects share all the same values? " + areEqual);
    }
}
