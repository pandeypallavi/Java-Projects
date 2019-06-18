package com.bayamp.trainning.java.basic;

public class FactorialUsingMethodPassingArguments {

	public static void main(String[] args) {
		int fact;
		int input = 5;
		fact = com.bayamp.junebatch.Utils.Utilities.simplefactorial(input);
		System.out.println("The factorial of " + input + " is " + fact);
		input = 10;
		fact = com.bayamp.junebatch.Utils.Utilities.simplefactorial(input);
		System.out.println("The factorial of " + input + " is " + fact);

	}

}
