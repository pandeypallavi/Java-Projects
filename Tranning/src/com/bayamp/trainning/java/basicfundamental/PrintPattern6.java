package com.bayamp.trainning.java.basicfundamental;
/*
 * A B C
 * A B 
 * A
 * 
 * 
 */
public class PrintPattern6 {

	static void printPattern(int lineCount) {
		// outer loop
	
		for (int i = 0; i <= lineCount; i++) {
			// inner loop first two lines
			 outerloop:
			for (char ch = 'A';ch <= 'Z';ch++) {
				for(int j=0;j<i;j++) 
					
				
				System.out.print(ch + " ");
				break  outerloop;
			}
			
			 System.out.println();
		}

}


public static void main(String[] args) {
	// TODO Auto-generated method stub
 
	printPattern(4);
}
} 