package com.bayamp.trainning.java.arrays;

public class SumTheElement {
	
	
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	  int sum = 0;
	  int n = arr.length;
	 // System.out.println(n);
	  for (int i =0;i<n;i++) {
		  sum = sum + arr[i];
		  
	  }
	  System.out.println("The sum of elements of array is :" + sum);
	
}
}

