package com.bayamp.trainning.java.basicfundamental;
/*
 * 1 2 3 4 5 6
 * 1 2 3 4 5 
 * 1 2 3 4 
 * 1 2 3
 * 1 2
 * 1
 */
public class PrintPattern4 {
static void printPattern(int n) {
	//outer loop
	for (int i=0;i<=n;n++) {
		//inner loop
		for(int j=n;j>=i;j--) {
			// loop for number print
			for (int k = 1;k<=n;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}

}
