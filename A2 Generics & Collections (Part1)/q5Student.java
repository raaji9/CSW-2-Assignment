package Assignment2;

import java.util.Comparator;

public class q5Student implements Comparable<q4Student> {
    private String name;
    private Object rn;
    private int totalMark;

    public q5Student(String name, Object rn, int totalMark) {
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

    public static Comparator<q4Student> RN_COMPARATOR = new Comparator<q4Student>() {
        @Override
        public int compare(q4Student o1, q4Student o2) {
            if (o1.getRn() instanceof Integer && o2.getRn() instanceof Integer) {
                return Integer.compare((int) o1.getRn(), (int) o2.getRn());
            } else if (o1.getRn() instanceof String && o2.getRn() instanceof String) {
                return ((String) o1.getRn()).compareTo((String) o2.getRn());
            } else {
                throw new IllegalArgumentException("Cannot compare roll numbers of different types.");
            }
        }
    };

    public static void bubbleSort(q4Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    q4Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        q4Student[] students = new q4Student[3];
        students[0] = new q4Student("Student1", 1, 80);
        students[1] = new q4Student("Student2", "2", 85);
        students[2] = new q4Student("Student3", 3, 75);

        bubbleSort(students);
        System.out.println("Sorted students by roll number:");
        for (q4Student student : students) {
            System.out.println(student.toString());
        }
    }
}