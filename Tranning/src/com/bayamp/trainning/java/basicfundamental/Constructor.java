package com.bayamp.trainning.java.basicfundamental;

class Calc {
	
	int num1;
	int num2;
	int result;
	public Calc() {
		num1 = 12;
		num2 = 8;
		result = num1 + num2;

		
	}
	public Calc(int n) {
		num1 = 3;
		num2 = 6;
		result = num1 + num2;	
	}
	public Calc(double d) {
		num1 = (int) d;
		num2 = (int) d;
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Calc obj = new Calc(); // constructor 
  System.out.println(obj.result);
 Calc obj1 = new Calc(7);
 System.out.println(obj1.result);
 Calc obj2 = new Calc(7.5);
 System.out.println(obj2.num1);
	}

}
