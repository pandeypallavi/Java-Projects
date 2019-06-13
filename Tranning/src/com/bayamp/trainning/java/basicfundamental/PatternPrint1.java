package com.bayamp.trainning.java.basicfundamental;

public class PatternPrint1 {
	/* patter
	 * * * *
	 * * *
	 * *
	 */
	 static void printPatter(int n) {

		// outer loop for n rows
		for (int i = 0; i < n; i++) {
			// inner loop
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		printPatter(6);

	}

}
