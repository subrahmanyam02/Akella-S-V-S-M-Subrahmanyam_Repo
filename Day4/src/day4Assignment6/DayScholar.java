package day4Assignment6;

class DayScholar extends Student {
    private String residentialAddress;

    // Constructor
    public DayScholar(int studentId, char studentType, String studName, int semFees, String residentialAddress) {
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
    public void getDetails() {
    	super.getDetails();
    	System.out.println("Student Details: "+studentName);
    	System.out.println("Registration Details: "+residentialAddress);
        
    }
}
