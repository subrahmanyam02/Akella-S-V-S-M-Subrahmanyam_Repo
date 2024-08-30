package day4Assignment6;

public class Student {
	protected int studentID;
	protected char studentType;
	protected String studentName;
	
	public Student(int studentID, char studentType, String studentName, int semesterFee) {
		super();
		this.studentID = studentID;
		this.studentType = studentType;
		this.studentName = studentName;
		
	
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
	public void getDetails() {
		System.out.println(studentID);
		System.out.println(studentType);
	}
	
}
