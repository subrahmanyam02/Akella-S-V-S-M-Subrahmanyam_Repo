package day4assignment3;

//Hostelite.java
public class Hostelite extends Student {
 private String hostelName;
 private int roomNumber;

 // Default constructor
 public Hostelite() {
     super();
     this.hostelName = "";
     this.roomNumber = 0;
 }

 // Parameterized constructor
 public Hostelite(int id, char type, String firstName, String lastName, double fees, String hostelName, int roomNumber) {
     super(id, type, firstName, lastName);
     setFeesPerMonth(fees);
     this.hostelName = hostelName;
     this.roomNumber = roomNumber;
 }

 // Getters
 public String getHostelName() {
     return hostelName;
 }

 public int getRoomNumber() {
     return roomNumber;
 }

@Override

	public void displayDetails() {
	    System.out.println("Student ID: " + getStudentId());
	    System.out.println("Student Type: " + getStudentType());
	    System.out.println("Student Name: " + getStudentName()); // Assuming you have getter methods for first and last names
	    System.out.println("Fees per Month: $" + getFeesPerMonth());
	    System.out.println("Hostel Name: " + getHostelName());
	    System.out.println("Room Number: " + getRoomNumber());
	    
	    System.out.println("-----------------------------------------------------------------");
	}

	
	
}

