package javaprogrammingexamples;

import java.util.*;

public class MultiplyTwoFloatingPointNumbers {
	
	static Scanner sc;

	public static void main(String[] args) {
		
		//float multiply;
		
		sc = new Scanner(System.in);
		
		
		System.out.println("Enter the first float number ");
		float num1 = sc.nextFloat();
		
		System.out.println("Enter the first float number ");
		float num2 = sc.nextFloat();
		
		//multiply = num1*num2;
		
		//System.out.println("Multiplication of two floating point numbers is : " +multiply );
		
		System.out.println("Multiplication of two floating point numbers is : " +num1*num2 );
		
		
	}

}
