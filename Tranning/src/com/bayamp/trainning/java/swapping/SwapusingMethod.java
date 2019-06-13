package com.bayamp.trainning.java.swapping;

public class SwapusingMethod {

	static int a ;
	static int b ;
	
	static public void swapNumbers(int a ,int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The value of a is now (inside the method) : "+ a);
		System.out.println("The value of b is now (inside the method) : "+ b);
	}
	public static void main(String[] args) {
		 a = 20 ;
		 b = 40;
		System.out.println("The value of a : "+ a);
		System.out.println("The value of b : "+ b);
		swapNumbers(a, b);
		System.out.println("The value of a is now : "+ a);
		System.out.println("The value of b is now : "+ b);
	}

}
