package javaprogrammingexamples;

import java.util.Scanner;

public class ProgramtoAddTwoBinaryStrings {

	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Enter First Binary String");
		String str1 = sc.nextLine();

		System.out.println("Enter second Binary String");
		String str2 = sc.nextLine();

		System.out.println("Result is : " + addBinaryString(str1, str2));

	}

	static String addBinaryString(String x, String y) {

		int num1 = Integer.parseInt(x, 2);

		int num2 = Integer.parseInt(x, 2);

		int sum = num1 + num2;

		String res = Integer.toBinaryString(sum);

		return res;

	}

}
