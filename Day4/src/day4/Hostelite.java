package day4;

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
}
