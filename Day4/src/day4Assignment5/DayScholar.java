package day4Assignment5;

class DayScholar extends PostGradStudent {
    private String residentialAddress;
    private double fees;

    // Constructor
    public DayScholar(int pCourseId, String pCourseName, double pCourseFees, int sid, String sType, String sName, String rAddress) {
        super(pCourseId, pCourseName, pCourseFees, sid, sType, sName);
        this.residentialAddress = rAddress;
    }

    
    public void calculateFees() {
        this.fees = super.pCourseFees / 6;
    }

    // Getter methods to display fees details
    public void displayFeesDetails() {
        System.out.println("Residential Address: " + residentialAddress);
        System.out.println("Calculated Fees: " + fees);
    }
}
