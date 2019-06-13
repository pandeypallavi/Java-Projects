package com.bayamp.trainning.java.basic;

import java.util.Scanner;

public class Utilities {
	// Simple Factorial
	static  int simplefactorial(int num) {

		int i;
		int fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	// Factorial via user input
	static void factorialviainput() {
		Scanner number = new Scanner(System.in);

		System.out.print("Enter the number : ");

		int num = number.nextInt();

		int i;
		double fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of " + num + " is : " + fact);
		number.close();

	}

	// Addition via user inputs
	static int addNumbersmethod2() {
		Scanner num = new Scanner(System.in);
		System.out.print("Enter the first number : ");

		int num1 = num.nextInt();

		System.out.print("Enter the second number : ");
		int num2 = num.nextInt();
		int total = num1 + num2;
		num.close();
		return total;
	}

	// Simple addition
	static int simpleAddition(int a, int b) {
		// int a = 20;
		// int b = 200;

		int total = a + b;
		// System.out.println(total);
		return total;
	}
}
