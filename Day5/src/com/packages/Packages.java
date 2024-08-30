package com.packages;

public class Packages {
	protected int packId;
	protected String Pname;
	
	public int getPackId() {
		return packId;
	}
	public void setPackId(int packId) {
		this.packId = packId;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}

	public void getDetails()
	{
		System.out.println("PackageId:"+ packId);
		System.out.println("Package Name:"+ Pname);
	}
	public static void main(String[] args) {
		Packages p=new Packages();
		p.setPackId(1001);
		p.setPname("Subbu");
		p.getDetails();
	}
	
	

}
