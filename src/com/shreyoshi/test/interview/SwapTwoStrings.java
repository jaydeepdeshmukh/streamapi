package com.shreyoshi.test.interview;

public class SwapTwoStrings {

	public static void main(String[] args) {
		
		String str = "shreyoshi";
		String str1 = "chakraborty";
		
		System.out.println("Before swapping:: "+str+" "+str1);
		
		str = str + str1; //abcdef
		
		str1 = str.substring(0, str.length() - str1.length()); //str.substring(0, 5-3) i.e., (0, 2)
		str = str.substring(str1.length()); //str.substring(3) i.e., starting from 3
		
		System.out.println("After swapping:: "+str+" "+str1);

	}

}
