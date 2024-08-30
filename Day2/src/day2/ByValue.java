package day2;

public class ByValue {
	public static void main(String[] args) {
		int sId=35;
		ByValue b1=new ByValue();
		Students student=new Students(10,"veda");
		System.out.println("orginal"+sId);
		b1.ByValMethod(sId);
		System.out.println("sid after method call"+sId);
		b1.ByValueMethod(40,'A');
	}
	
		public void ByValMethod(int sId) {
			sId=10;
			System.out.println("the inside  sid"+sId);}
			
		
		public void ByValueMethod(int stdid, char stdtype) {
		System.out.println("insi ethe method call"+stdid+stdtype);
		}

}
