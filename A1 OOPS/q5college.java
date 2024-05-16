package Assignment1;

class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }

    public void setCollegeLoc(String collegeLoc) {
        this.collegeLoc = collegeLoc;
    }

    @Override
    public String toString() {
        return "college Name: '" + collegeName + '\'' +"\ncollege Location: '" + collegeLoc + '\'' + "\n";
    }
}
class Student1 {
    private int studentId;
    private String studentName;
    private College college;

    public Student1(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College: " + college);
    }
}
public class q5college {

	public static void main(String[] args) {
		College col1 = new College("ITER", "BBSR, Odisha");
        College col2 = new College("ABIT", "Cuttck, Odisha");

        Student1 stu1 = new Student1(16203, "Ranjit", col1);
        Student1 stu2 = new Student1(16206, "Bala", col2);

        System.out.println("Colleges:\n");
        System.out.println(col1);
        System.out.println(col2);

        System.out.println("\nStudents:\n");
        stu1.displayStudentInfo();
        stu2.displayStudentInfo();

	}

}
