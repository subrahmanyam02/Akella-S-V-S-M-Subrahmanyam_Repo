package day4Assignment5;

class PostGradStudent extends Student {
    private int pCourseId;
    protected String pCourseName;
    protected double pCourseFees;

    // Constructor
    public PostGradStudent(int pCourseId, String pCourseName, double pCourseFees, int sid, String sType, String sName) {
        super(sid, sType, sName);
        this.pCourseId = pCourseId;
        this.pCourseName = pCourseName;
        this.pCourseFees = pCourseFees;
    }

    // Getter methods to display PostGraduation Student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Type: " + studentType);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course ID: " + pCourseId);
        System.out.println("Course Name: " + pCourseName);
        System.out.println("Course Fees: " + pCourseFees);
    }
}