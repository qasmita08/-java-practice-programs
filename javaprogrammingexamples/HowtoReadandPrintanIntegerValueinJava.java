package javaprogrammingexamples;

import java.util.Scanner;

public class HowtoReadandPrintanIntegerValueinJava {
	
	static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int number = sc.nextInt();
				
		System.out.println("Entered number is " + number);				

	}

}
