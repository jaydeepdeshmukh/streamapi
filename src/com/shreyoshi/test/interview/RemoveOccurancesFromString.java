package com.shreyoshi.test.interview;

public class RemoveOccurancesFromString {
	
	public static void main(String[] args) {
	
		String str = "abcdABCDabcdABCD";
		char ch = 'a';
		
		str = removeOccurrences(str,ch);
		System.out.println(str);
				
	}
	
	public static String removeOccurrences(String str, char ch) {
		
		if(str.length() == 0)
			return "";
		
		if(str.charAt(0) == ch)
			return removeOccurrences(str.substring(1),ch);
		
		return str.charAt(0) + removeOccurrences(str.substring(1),ch);
	}
}
