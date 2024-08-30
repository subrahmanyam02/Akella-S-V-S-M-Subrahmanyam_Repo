package day4Assignment7;

public class DayScholar extends Student {
    private String residentialAddress;
    private double feesPerMonth;

    // Constructor
    public DayScholar(int studentID, char studentType, String studentName, String residentialAddress) {
        super(studentID, studentType, studentName);
        this.residentialAddress = residentialAddress;
    }

    // Getter and Setter for residentialAddress
    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    // Implement abstract method
    @Override
    public void calculateFees(double semesterFee) {
        feesPerMonth = semesterFee / 6.0;
        System.out.println("Fees per month for DayScholar: " + feesPerMonth);
    }

    // Override displayDetails method to display DayScholar specific details
    @Override
    protected void displayDetails() {
        super.displayDetails(); // Display base class details
        System.out.println("Student Name: " + getStudentName());
        System.out.println("Residential Address: " + residentialAddress);
    }

	public void calculateFees() {
		// TODO Auto-generated method stub
		
	}
}
