package com.bayamp.trainning.java.swapping;

public class SwapTheNumber {

	public static void main(String[] args) {
		int x = 5;
		int y = 15;
		
		System.out.println("value of x is " + x);
		System.out.println("value of y is " + y);
		
		int temp = x ;
		x = y;
		y = temp;
		
		System.out.println("value of x is now " + x);
		System.out.println("value of x is now " + y);
		
	}

}
