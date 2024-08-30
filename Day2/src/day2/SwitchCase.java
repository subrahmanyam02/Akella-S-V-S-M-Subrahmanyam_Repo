package day2;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
    	Scanner obj= new Scanner(System.in);
    	System.out.println("Enter the grade");
		char grade;
		grade=obj.next().charAt(0);
		System.out.println("you entered"+grade);
		
		switch (grade) {
		case ('A'):
			System.out.println("80-100");
			break;
		case ('B'):
			System.out.println("73-79");
			break;
		case ('C'):
			System.out.println("65-72");
			break;
		case ('D'):
			System.out.println("55-64");
			break;
		case ('E'):
			System.out.println("<55");
			break;

		default:
			
			;
		}
	}
}
