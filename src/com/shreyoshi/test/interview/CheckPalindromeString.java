package com.shreyoshi.test.interview;

public class CheckPalindromeString {
	
	public static void main(String[] args) {
		
		String str = "aba";
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = str.length()-1; i >= 0; i--) {
			
			builder.append(str.charAt(i));
		}
		
		if(builder.toString().equals(str))
			System.out.println("is palindrome");
		else
			System.out.println("not palindrome");
	}

}
