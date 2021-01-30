package com.shreyoshi.test.interview;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String str = "shreyoshi";
		
		System.out.println("Original string is:: "+str);
		
		StringBuilder builder = new StringBuilder();
		
		char[] charArray = str.toCharArray();
		
		for(int i = charArray.length-1; i>=0; i-- ) 
		{
			builder.append(charArray[i]);
		}
		
		System.out.println("Reversed String is:: "+builder.toString());
	}

}
