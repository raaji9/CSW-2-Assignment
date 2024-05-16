package Assignment2;

import java.util.Arrays;
import java.util.Comparator;

public class q4Student implements Comparable<q4Student> {
    private String name;
    private Object rn;
    int totalMark;

    public q4Student(String name, Object rn, int totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getRn() {
        return rn;
    }

    public void setRn(Object rn) {
        this.rn = rn;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rn=" + rn +
                ", totalMark=" + totalMark +
                '}';
    }

    @Override
    public int compareTo(q4Student other) {
        return Integer.compare(this.totalMark, other.totalMark);
    }

    public static Comparator<q4Student> TOTAL_MARK_COMPARATOR = new Comparator<q4Student>() {
        @Override
        public int compare(q4Student o1, q4Student o2) {
            return Integer.compare(o1.getTotalMark(), o2.getTotalMark());
        }
    };

    public static int linearSearch(q4Student[] students, q4Student target) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        q4Student[] students = new q4Student[3];
        students[0] = new q4Student("Student1", 1, 80);
        students[1] = new q4Student("Student2", "2", 85);
        students[2] = new q4Student("Student3", 3, 75);

        q4Student target = new q4Student("Student2", "2", 85);
        int index = linearSearch(students, target);
        if (index != -1) {
            System.out.println("Found " + target.toString() + " at index " + index);
        } else {
            System.out.println("Could not find " + target.toString());
        }

        q4Student[] sortedStudents = Arrays.stream(students).sorted(q4Student.TOTAL_MARK_COMPARATOR).toArray(q4Student[]::new);
        System.out.println("Sorted students by total mark:");
        for (q4Student student : sortedStudents) {
            System.out.println(student.toString());
        }
    }
}