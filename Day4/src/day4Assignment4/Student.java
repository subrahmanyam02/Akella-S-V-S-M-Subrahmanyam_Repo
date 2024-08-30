package day4Assignment4;

public class Student {
	protected int studentID;
	protected char studentType;
	protected String studentName;
	protected int semesterFee;
	protected int feePerMonth;
	public Student(int studentID, char studentType, String studentName, int semesterFee) {
		super();
		this.studentID = studentID;
		this.studentType = studentType;
		this.studentName = studentName;
		this.semesterFee = semesterFee;
		this.feePerMonth = feePerMonth;
	}
	void displayDetails() {
		// TODO Auto-generated method stub
		
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getSemesterFee() {
		return semesterFee;
	}
	public void setSemesterFee(int semesterFee) {
		this.semesterFee = semesterFee;
	}
	public int getFeePerMonth() {
		return feePerMonth;
	}
	public void setFeePerMonth(int feePerMonth) {
		this.feePerMonth = feePerMonth;
	}
	

}
