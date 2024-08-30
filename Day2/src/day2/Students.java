package day2;

public class Students {
	private String stdname;
	public Students(int stdid, String stdtype) {
		super();
		this.stdid = stdid;
		this.stdtype = stdtype;
	
	}
	public int stdid;
	public String stdtype;
	@Override
	public String toString() {
		return "Students [stdid=" + stdid + ", stdtype=" + stdtype + "]";
	}

}
