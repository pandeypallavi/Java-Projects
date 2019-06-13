package com.bayamp.trainning.java.swapping;

public class Swap3Numbers {

	public static void main(String[] args) {
		int x = 5;
		int y = 15;
		int z = 20 ;
		
		System.out.println("value of x is " + x);
		System.out.println("value of y is " + y);
		System.out.println("value of y is " + z);
       
		x = x + y +z;
		
		y = x - (y + z);
		z = x - (y + z);
		x = x - (y + z);
		System.out.println("");
		System.out.println("value of x is now " + x);
		System.out.println("value of y is now " + y);
		System.out.println("value of z is now " + z);
	}

}
