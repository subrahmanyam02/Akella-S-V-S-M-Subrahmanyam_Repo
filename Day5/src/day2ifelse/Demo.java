package day2ifelse;

public class Demo {
public static void main(String[] args) {
	{
		int amt=0;
		Travel t=new Travel();
		
		t.setModeOfTravel('F');
		t.setNoOfTickets(3);
		if(t.getModeOfTravel()=='F')
		{
			amt=500*(t.getNoOfTickets());
		}
//		while(t.getModeOfTravel()=='T')
//		{
//			amt=100*(t.getNoOfTickets());
//		}
//		while(t.getModeOfTravel()=='B')
//		{
//			amt=50*(t.getNoOfTickets());
//		}
	System.out.println(amt);
	}
}
}
