package day2ifelse;

public class MinAccountValidation {
	
	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccAmount(600);
		if(acc.accAmount <=500)
		{
			System.out.println("The balance is below minimum value");
		}
		else
		{
			System.out.println(acc.accAmount);
		}
	}

}
