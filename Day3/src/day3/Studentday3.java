package day3;

public class Studentday3 {
	final static int studentCount = 10;
	char stdype;
	String Stdname;
	static int stid=550+studentCount;
	
	public Studentday3() {
		stid++;
		
	}
	public Studentday3(char stdype,String fname,String lname) {
		this();
		this.Stdname=fname +" "+ lname;
		this.stdype = stdype;
	}
	public static int  getstudentcount(){
		return studentCount;
	}
	public  void displaydetails(Studentday3 obj) {
		System.out.println("the id of student "+stid);
		System.out.println("the name of student"+" "+ obj.Stdname);
		System.out.println("the type  of student"+ " "+obj.stdype);
	}
	public static void main(String[] args) {
		Studentday3 std1 =new Studentday3('D',"bony","thomas");
		std1.displaydetails(std1);
		Studentday3 std2 =new Studentday3('H',"daniel","thomas");
		std1.displaydetails(std2);
	}
}


