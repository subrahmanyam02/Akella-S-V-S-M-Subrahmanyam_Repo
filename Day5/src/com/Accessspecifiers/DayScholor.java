package com.Accessspecifiers;

public class DayScholor extends Student {
	
	private String residentialAddress;
	public void setResAddress(String resAddress)
	{
		this.residentialAddress=resAddress;
	}
	public void getDetails()
	{
		System.out.println("Student Id :"+studentId);
		System.out.println("Student Type :"+studentType);
		System.out.println("Studet Name :"+studentname);
		
		
	}

}
