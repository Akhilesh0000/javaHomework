/**
 * Student
 */
class Student {

    String name;
    int sID;
    private int marks;

    public void setMarks(int sMarks) {
        if (marks < 0) {
            System.out.println("Marks must be positive");
        } else {
            marks = sMarks;
        }
    }

    public int getMarks() {
        return marks;
    }

    public char calGrade() {
        if (marks >= 75) {
            return 'A';
        } else if (marks >= 65) {
            return 'B';
        } else if (marks >= 35) {
            return 'C';
        } else {
            return 'F';
        }
    }

}

/**
 * StudentDemo
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Lokesh";
        st1.setMarks(90);
        System.out.println("Marks : " + st1.getMarks() + "\nGrade : " + st1.calGrade());
    }
}