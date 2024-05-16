package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class q9CourseEnroll {
    private String id;
    private String name;

    public q9CourseEnroll(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

interface Course {
    boolean enrollStudent(q9CourseEnroll student);
    boolean dropStudent(q9CourseEnroll student);
    void displayEnrollmentDetails();
}

class Enrollment implements Course {
    private List<q9CourseEnroll> students;
    private String courseName;

    public Enrollment(String courseName) {
        this.students = new ArrayList<>();
        this.courseName = courseName;
    }

    @Override
    public boolean enrollStudent(q9CourseEnroll student) {
        if (students.contains(student)) {
            System.out.println(student.getName() + " is already enrolled in " + courseName);
            return false;
        }
        students.add(student);
        System.out.println(student.getName() + " has been enrolled in " + courseName);
        return true;
    }

    @Override
    public boolean dropStudent(q9CourseEnroll student) {
        if (!students.contains(student)) {
            System.out.println(student.getName() + " is not enrolled in " + courseName);
            return false;
        }
        students.remove(student);
        System.out.println(student.getName() + " has been dropped from " + courseName);
        return true;
    }

    @Override
    public void displayEnrollmentDetails() {
        System.out.println("Enrollment details for " + courseName + ":");
        System.out.println("Students enrolled: ");
        for (q9CourseEnroll student : students) {
            System.out.println(student.getId() + " " + student.getName());
        }
    }
}

class EnrollmentSystem {
    public void enrollStudent(Course course, q9CourseEnroll student) {
        course.enrollStudent(student);
    }

    public void dropStudent(Course course, q9CourseEnroll student) {
        course.dropStudent(student);
    }

    public void displayEnrollmentDetails(Course course) {
        course.displayEnrollmentDetails();
    }
}

class Main {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new EnrollmentSystem();

        Course course1 = new Enrollment("Java Programming");
        q9CourseEnroll student1 = new q9CourseEnroll("1", "John");
        q9CourseEnroll student2 = new q9CourseEnroll("2", "Jane");

        enrollmentSystem.enrollStudent(course1, student1);
        enrollmentSystem.enrollStudent(course1, student2);
        enrollmentSystem.displayEnrollmentDetails(course1);

        enrollmentSystem.dropStudent(course1, student1);
        enrollmentSystem.displayEnrollmentDetails(course1);

        enrollmentSystem.enrollStudent(course1, student1);
        enrollmentSystem.displayEnrollmentDetails(course1);
    }
}