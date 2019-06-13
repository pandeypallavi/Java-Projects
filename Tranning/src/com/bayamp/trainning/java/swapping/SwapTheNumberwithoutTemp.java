package com.bayamp.trainning.java.swapping;

public class SwapTheNumberwithoutTemp {

	public static void main(String[] args) {
		int x = 5;
		int y = 15;
		
		System.out.println("value of x is " + x);
		System.out.println("value of y is " + y);
		
		x = x + y; // x = 20
		y = x - y; // x = 5
		x = x - y; // 20 - 5
		
		System.out.println("value of x is now  " + x);
		System.out.println("value of y is no " + y);

	}

}
