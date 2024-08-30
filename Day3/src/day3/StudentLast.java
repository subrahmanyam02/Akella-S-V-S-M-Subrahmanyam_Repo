package day3;

import java.util.Scanner;

public class StudentLast {
	int stdid;
	String stdname;
	String resedentialStatus;
	long  feespermonth;
	Scanner scanner=new Scanner(System.in);
	public StudentLast() {
		super();
	}
	
	public StudentLast(int stdid, String stdname, String resedentialStatus, long feespermonth) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.resedentialStatus = resedentialStatus;
		this.feespermonth = feespermonth;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid() {
		System.out.println("enter stdid:");
		this.stdid = scanner.nextInt();
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname() {
		System.out.println("enter stdname");
		this.stdname = scanner.next();
	}

	public String getResedentialStatus() {
		return resedentialStatus;
	}

	public void setResedentialStatus() {
		System.out.println("resedential status");
		this.resedentialStatus=scanner.next();	}

	public long getFeespermonth() {
		return feespermonth;
	}

	public void setFeespermonth() {
		System.out.println("enetr the acedemic fee");
		int academicFee=scanner.nextInt();
		int hostelfee=0;
		if (resedentialStatus.equalsIgnoreCase("hostel")) {
			System.out.println("enter the hostel fee");
			hostelfee=scanner.nextInt();
		}
		this.feespermonth = academicFee+hostelfee;
	}
	public static void main(String[] args) {
		StudentLast s1= new StudentLast();
		s1.setStdid();
		s1.setStdname();
		s1.setResedentialStatus();
		s1.setFeespermonth();
		System.out.println("id is"+s1.getStdid());
		System.out.println("name is"+s1.getStdname());
		System.out.println("resedential status  is"+s1.getResedentialStatus());
		System.out.println("feespermont is"+s1.getFeespermonth());
	}
	
}

