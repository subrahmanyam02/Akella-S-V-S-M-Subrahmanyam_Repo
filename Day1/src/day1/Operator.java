package day1;

public class Operator {
	public static void main(String[] args) {
		int intval=10;
		float floatVal=3.0f;
		boolean bool1 = true;
		boolean bool2 = false;
		boolean bool3 = true;

		// Arithmetic: Modulus operator
		System.out.println("Arithmetic");
		System.out.println(intval + "%" + floatVal + "=" +(intval % floatVal));
		System.out.println();

		// String Concatenation Observe the difference 
		System.out.println("String Concatenation"); 
		System.out.println("Day " + 2 + " Session"); 
		System.out.println("\n" + 2 + 3 +"\n" +(2+3));
		System.out.println();

		// Relational: Equality operator 
		System.out.println("Relational");
		System.out.println(intval + "==" + floatVal + " = " +(intval==floatVal));

		floatVal = 10.0f;

		System.out.println(intval + "==" + floatVal + " = " +(intval==floatVal));

		System.out.println();

		bool2 = false;

		if (bool1 || (bool1 && (bool2=false))) {
			 System.out.println("Success");

		}

		else {
			System.out.println("Failure");

		}
		System.out.println("boo12 value: " + bool2);

		}



}


