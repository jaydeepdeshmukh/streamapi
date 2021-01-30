package com.shreyoshi.test.interview;

public class NumberOfOcurranceInString {
	
	public static void main(String[] args) {
		
		String str = "Find Number Of ocurrances of a word in String";
		String word = "Number";
		
		String[] arr = str.split(" ");
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(word.equals(arr[i])) {
				
				count++;				
			}				
		}
		
		System.out.println("Count of word ("+word+") in the given string is:: "+count);		
	}

}
