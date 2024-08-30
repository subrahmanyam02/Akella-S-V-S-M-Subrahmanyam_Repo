package day4Assignment4;

class DayScholar extends Student {
    private String residentialAddress;

    // Constructor
    DayScholar(int studentId, char studentType, String studName, int semFees, String residentialAddress) {
        super(studentId, studentType, studName, semFees);
        this.residentialAddress = residentialAddress;
    }

    // Getter for residentialAddress
    public String getResidentialAddress() {
        return residentialAddress;
    }

    // Setter for residentialAddress
    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    // Implementation of displayDetails method
    @Override
    void displayDetails() {
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Student Type: " + getStudentType());
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Semester Fees: " + getSemesterFee());
        System.out.println("Residential Address: " + residentialAddress);
    }
}
