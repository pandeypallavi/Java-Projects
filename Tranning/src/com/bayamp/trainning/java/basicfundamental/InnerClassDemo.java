package com.bayamp.trainning.java.basicfundamental;

class Outer {
	int a;

	public void show() {
		System.out.println("I AM IN OUTER CLASS");
	}

	class inner {
		public void display() {
			System.out.println("i am inside the inner class");
		}
	}

}

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj = new Outer();
		obj.show();
		Outer.inner obj1 = obj.new inner();
		obj1.display();

		// Outer.inner obj1 = new Outer.inner();
		// obj1.display(); when the inner class
		// is static we you use call name to call the method

	}

}
