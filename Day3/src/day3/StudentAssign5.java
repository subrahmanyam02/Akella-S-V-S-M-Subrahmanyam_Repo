package day3;

public class StudentAssign5 {
     char stdype;
     String Stdname;
     int stid;

   public StudentAssign5() {
	}
public StudentAssign5(int stid,char stdype,String fname,String lname) {
	this.stid=stid;
	this.Stdname=fname + lname;
	this.stdype = stdype;
}
public char getStdype() {
	return stdype;
}
public void setStdype(char stdype) {
	this.stdype = stdype;
}
public String getStdname() {
	return Stdname;
}
public void setStdname(String stdname) {
	Stdname = stdname;
}
public int getStid() {
	return stid;
}
public void setStid(int stid) {
	this.stid = stid;
}
public static void main(String[] args) {
	StudentAssign5 s1=new StudentAssign5(101, 'f',"veda","harshitha" );
	/*s1.setStid(10);
	s1.setStdype('f');
	s1.setStdname("radha");*/
	System.out.println(s1.getStid());
	System.out.println(s1.getStdype());
	System.out.println(s1.getStdname());
	s1.setStid(102);
	s1.setStdype('p');
	s1.setStdname("radharam");
	System.out.println(s1.getStid());
	System.out.println(s1.getStdype());
	System.out.println(s1.getStdname());
}


}

