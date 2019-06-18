package com.bayamp.trainning.java.basicfundamental;

class calc {
	
	int num1;
	int num2;
	int result;
	
	public void perform() {
		result = num1 + num2;
		
	}
}


	
	


public class RoughtWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// calc obj;  // reference
// obj = new calc(); // object

calc obj = new calc();
obj.num1 = 6;
obj.num2 = 6;

obj.perform();
System.out.println(obj.result);





}
	
}
