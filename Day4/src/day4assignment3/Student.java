package day4assignment3;

//Student.java
abstract class Student {
 protected int studentId;
 protected char studentType;
 protected String studentName;
 protected double feesPerMonth;
 
 public abstract void displayDetails();

 // Default constructor
 public Student() {
     // Initialize with default values
     this.studentId = 0;
     this.studentType = 'U'; // Assuming 'U' stands for Unknown
     this.studentName = "";
     this.feesPerMonth = 0.0;
 }

 // Parameterized constructor
 public Student(int id, char type, String firstName, String lastName) {
     this.studentId = id;
     this.studentType = type;
     this.studentName = firstName + " " + lastName;
     this.feesPerMonth = 0.0;
 }

 // Setters
 public void setStudentId(int id) {
     this.studentId = id;
 }

 public void setStudentType(char type) {
     this.studentType = type;
 }

 public void setStudentName(String firstName, String lastName) {
     this.studentName = firstName + " " + lastName;
 }

 public void setFeesPerMonth(double fees) {
     this.feesPerMonth = fees;
 }

 // Getters
 public int getStudentId() {
     return studentId;
 }

 public char getStudentType() {
     return studentType;
 }

 public String getStudentName() {
     return studentName;
 }

 public double getFeesPerMonth() {
     return feesPerMonth;
 }
}
