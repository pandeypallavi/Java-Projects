package com.bayamp.trainning.java.basicfundamental;

public class PrintPattern2 {

	/*
	 * * * *
	 * * *
	 * *
	 * 
	 */

	static void printPattern(int n) {
		// outer loop
		for (int i = 0; i <= n; i++) {
			// inner loop
			for (int j = n; j >= i; j--) {
				System.out.print("* ");

			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern(12);

	}

}
