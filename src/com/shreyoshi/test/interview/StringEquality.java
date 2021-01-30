package com.shreyoshi.test.interview;

public class StringEquality {
	
	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Hello";
		
		if(str1==str2) {
			
			System.out.println("References are equal");
		}
		else {
			
			System.out.println("Not same");
		}
		System.out.println();
		
		//The given statements output will be “false” because in java + operator precedence is more than == operator. 
		//So the given expression will be evaluated to “s1 == s2 is:: Hello” == “Hello” i.e false.
		//Meaning "s1 == s2 is:: Hello" is considered as one whole string i.e., str1 which is compared to
		//"Hello" which is the second string
		System.out.println("str1 == str2 is:: "+str1 == str2);
	}

}
