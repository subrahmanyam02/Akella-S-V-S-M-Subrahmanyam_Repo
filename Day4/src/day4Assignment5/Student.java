package day4Assignment5;

public class Student {
    private static int studentCount = 0;
    protected int studentId;
    protected String studentType;
    protected String studentName;

    // Default constructor to increment studentId
    public Student() {
        studentCount++;
        this.studentId = studentCount;
    }

    // Parameterized constructor
    public Student(int sid, String sType, String sName) {
        this();
        this.studentId = sid;
        this.studentType = sType;
        this.studentName = sName;
    }
}
