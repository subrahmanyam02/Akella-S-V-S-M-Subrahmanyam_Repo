package day4Assignment7;



	public class DynamixEx {

	    public static void main(String[] args) {
	        // Create an object of DayScholar
	        DayScholar dayScholar = new DayScholar(1000, 'B', "Tharun Kumar", "23/51, Mydukur");

	        // Set values using setter methods
	        dayScholar.setStudentID(1000);
	        dayScholar.setStudentName("Tharun Kumar");
	        dayScholar.setStudentType('B');
	        dayScholar.setResidentialAddress("23/51, Mydukur");

	        // Calculate fees
	        dayScholar.calculateFees();

	        // Display details of DayScholar and Student
	        dayScholar.displayDetails();
	    }
	}


