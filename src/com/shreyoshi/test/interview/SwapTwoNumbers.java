package com.shreyoshi.test.interview;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int a = 121;
		int b = 678;
		
		System.out.println("Before Swapping:: "+a+" "+b);
		
		a = a + b; //total of say 1 + 2 = 3, i.e., a = 3
		b = a - b; //3 - 2 = 1, i.e., b = 1
		a = a - b; // 3 - 1 = 2, i.e., a = 2
		
		System.out.println("After Swapping:: "+a+" "+b);
		
	}

}
