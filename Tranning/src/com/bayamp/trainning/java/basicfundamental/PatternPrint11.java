package com.bayamp.trainning.java.basicfundamental;

public class PatternPrint11 {
	/* patter
	 * 1 2 3 4
	 * 1 2 3 
	 * 1 2
	 * 1
	 */
	 static void printPatter(int n) {

		// outer loop for n rows
		for (int i = 0; i < n; i++) {
			// inner loop
			for (int j = 1; j <= i; j++) {
				System.out.print(j +" " );
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		printPatter(12);

	}

}
