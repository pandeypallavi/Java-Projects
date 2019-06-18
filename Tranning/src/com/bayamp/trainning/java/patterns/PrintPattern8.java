package com.bayamp.trainning.java.patterns;

public class PrintPattern8 {

	static void printPattern() {
		// outer loop
		int lineCount = 5;
		for (int i = 0; i <= lineCount; i++) {
			// inner loop first two lines

			if (i == 1 || i == 5) {
				System.out.print("     *   ");
			} if(i == 2 || i == 4) {
				System.out.print("  *  *  *  ");
			}
			if (i==3) {
				System.out.println("* * * * *");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern();
	}

}