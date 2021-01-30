package com.shreyoshi.test.interview;

public class CheckPalindromeNumber {
	
	public static void main(String[] args) {
		
		int temp, r, sum=0;
		int n = 121;
		temp =n;
		
		//reverse number
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if(sum==temp) {
			
			System.out.println("is palindrome");
		}
		else {
			
			System.out.println("not palindrome");
		}
	}

}
