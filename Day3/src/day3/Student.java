package day3;

public class Student {
    
	char stdype;
	String Stdname;
	 static int stid=550;
	
	public Student() {
		this.stid++;
		
	}
	public Student(char stdype,String fname,String lname) {
		this.stid++;
		this.Stdname=fname + lname;
		this.stdype = stdype;
	}
	public  void displaydetails(Student obj) {
		System.out.println("the id of student"+obj.stid);
		System.out.println("the name of student"+" "+ obj.Stdname);
		System.out.println("the type  of student"+ " "+obj.stdype);
		
		
	}
	public static void main(String[] args) {
		Student std1 =new Student('d',"bony","thomas");
		std1.displaydetails(std1);
		Student std2 =new Student('H',"daniel","thomas");
		std1.displaydetails(std2);
	}
	

}
