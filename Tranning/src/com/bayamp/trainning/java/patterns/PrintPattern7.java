package com.bayamp.trainning.java.patterns;

public class PrintPattern7 {

	static void printPattern() {
		// outer loop
		int lineCount = 3;
		for (int i = 1; i <= lineCount; i++) {
			// inner loop first two lines

			if (i == 1 || i == 3) {
				System.out.print("   *   ");
			} else {
				System.out.print("*     *");
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern();
	}

}