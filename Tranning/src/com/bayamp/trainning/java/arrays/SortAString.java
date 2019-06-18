package com.bayamp.trainning.java.arrays;

public class SortAString {
public static void main(String[] args) {
	// String name1 = "bayamp";
	String name1 = new String("bayamp");
	
	
	char[] allCharOfName1 = name1.toCharArray();
	 
	Arrays.sort(allCharOfName1);
}

}
