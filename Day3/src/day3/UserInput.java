package day3;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		int num=scanner.nextInt();
		System.out.println("enter iterations");
		int  iterations=scanner.nextInt();
		for(int i=0;i<iterations;i++) {
			System.out.println(num+"*"+(i+1)+"="+num*(i+1));
		}
		System.out.println("enter name");
		String name=scanner.next();
		System.out.println(name.length());
		System.out.println("hello"+" "+name);
		System.out.println(name.toLowerCase());
				}
       

}
