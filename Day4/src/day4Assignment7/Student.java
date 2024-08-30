package day4Assignment7;

public abstract class Student {
    protected int studentID;
    protected char studentType;
    protected String studentName;
    protected final int semesterFees = 12000; // Fixed semester fee

    // Constructor
    public Student(int studentID, char studentType, String studentName) {
        this.studentID = studentID;
        this.studentType = studentType;
        this.studentName = studentName;
    }

    // Getters and Setters
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Abstract method to be implemented by subclasses
    public abstract void calculateFees(double semesterFee);

    // Display Details method (to be overridden)
    protected void displayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Type: " + studentType);
    }
}
