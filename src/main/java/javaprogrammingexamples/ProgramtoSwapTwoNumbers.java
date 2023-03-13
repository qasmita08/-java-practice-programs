package javaprogrammingexamples;

import java.util.Scanner;

public class ProgramtoSwapTwoNumbers {

	static Scanner sc;

	public static void main(String[] args) {

		/*
		 * // Using third variable
		 * 
		 * int temp;
		 * 
		 * sc = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the first number"); int num1 = sc.nextInt();
		 * 
		 * System.out.println("Enter the second number"); int num2 = sc.nextInt();
		 * 
		 * temp = num1; num1 = num2; num2 = temp;
		 * 
		 * System.out.println("Value of first number : " + num1);
		 * System.out.println("Value of second number : " + num2);
		 */

		// Using without using third variable


		sc = new Scanner(System.in);

		System.out.println("Enter the first number");
		int num1 = sc.nextInt();

		System.out.println("Enter the second number");
		int num2 = sc.nextInt();

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2 ;  
		System.out.println("Value of first number : " + num1);
		System.out.println("Value of second number : " + num2);

	}

}
