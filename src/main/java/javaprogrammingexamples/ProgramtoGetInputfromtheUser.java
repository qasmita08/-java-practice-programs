package javaprogrammingexamples;

import java.io.*;
import java.util.Scanner;

public class ProgramtoGetInputfromtheUser {

	static Scanner sc;

	public static void main(String[] args) throws IOException {

		// using BufferedReader Class

		System.out.println("Get Input from User using BufferedReader Class");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String");

		String str = br.readLine();

		System.out.println("Entered String is : " + str);

		System.out.println("Enter the Integer");

		Integer num = Integer.parseInt(br.readLine());

		System.out.println("Entered String is : " + num);

		System.out.println("******************************************************************");

		// using Scanner Class

		System.out.println("Get Input from User using Scanner Class");

		sc = new Scanner(System.in);

		System.out.println("Enter the String");

		String str2 = sc.nextLine();

		System.out.println("Entered String Using Scanner class " + str2 + "\n");

		System.out.println("******************************************************************");

		// demonstrate working of System.console()
		// Using Console to input data from user
		String name = System.console().readLine();

		System.out.println("You entered string " + name);
	}
}
