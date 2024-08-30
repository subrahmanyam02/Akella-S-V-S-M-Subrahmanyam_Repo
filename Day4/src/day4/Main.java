package day4;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Create a Hostelite object using the parameterized constructor
     Hostelite hostelStudent = new Hostelite(1, 'A', "John", "Doe", 5000.00, "Sunrise Hostel", 101);

     // Display details
     System.out.println("Student ID: " + hostelStudent.getStudentId());
     System.out.println("Student Type: " + hostelStudent.getStudentType());
     System.out.println("Student Name: " + hostelStudent.getStudentName());
     System.out.println("Fees per Month: $" + hostelStudent.getFeesPerMonth());
     System.out.println("Hostel Name: " + hostelStudent.getHostelName());
     System.out.println("Room Number: " + hostelStudent.getRoomNumber());
 }
}
