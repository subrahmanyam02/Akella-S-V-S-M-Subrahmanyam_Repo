package day4assignment3;

public class DayScholar extends Student{
	private String residentialAddress;
	

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public DayScholar(String residentialAddress) {
		super();
		this.residentialAddress = residentialAddress;
	}
	public DayScholar(int id, char type, String firstName, String lastName, double fees, String residentialAddress) {
	     super(id, type, firstName, lastName);
	     setFeesPerMonth(fees);
	     this.residentialAddress=residentialAddress;
	   
	 }

	
	@Override

	public void displayDetails() {
	    System.out.println("Student ID: " + getStudentId());
	    System.out.println("Student Type: " + getStudentType());
	    System.out.println("Student Name: " + getStudentName()); // Assuming you have getter methods for first and last names
	    System.out.println("Fees per Month: $" + getFeesPerMonth());
	    
	    System.out.println("Residential Address: " + getResidentialAddress());
	}

	

}
