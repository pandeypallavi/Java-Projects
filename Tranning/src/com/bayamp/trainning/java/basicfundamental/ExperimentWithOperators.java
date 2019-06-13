package com.bayamp.trainning.java.basicfundamental;

public class ExperimentWithOperators {

	public static void main(String[] args) {
	int n = 8,m =5;
	
	System.out.println("value n1: " +n);
	System.out.println("value m1: " +m);

	// n++; //post increment
	// ++n ; //pre increment
	//m = ++n; // this first increment the value of n and than assign to m
	m= n++; // this first assign the value and than increment the value of n
	System.out.println("value n2: " +n);
	System.out.println("value m2: " +m);
	}

}
