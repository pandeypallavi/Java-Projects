package com.bayamp.trainning.java.basicfundamental;

public class MultiDimensionArray {

	public static void main(String[] args) {
		int[][] myArray = {{1,2,3,4},{4,5,6,7,8}};
		System.out.println("3rd element of second array member" + myArray[1][2]);

		// Display all the elements 
		
		int i = 0;
		int n = myArray[0].length;
		System.out.println("length of first array : " + n);
		
		int m = myArray[i].length;
		System.out.println("length of second array : " + m);
		
		for (i=0;i<n;i++) {
			for (int j= 0;j<m;j++)
			{
				System.out.println(myArray[i][j]);
			}
			
		}
	}

}
