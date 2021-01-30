package com.shreyoshi.test.interview;

public class CheckIfVowelsPresent {
	
	public static void main(String[] args) {
		
		String str = "Apple";
		
		if(str.matches(".*[aeiou].*"))
			System.out.println("String contains vowels");
		else
			System.out.println("String does not contain vowels");
	}

}
