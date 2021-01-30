package com.shreyoshi.test.interview;

public class Factorial {
	
	public static void main(String[] args) {
		
		//int n = 0; //gives StackOverflowException
		int n = 5;
		System.out.println("Factorial of "+n+" is:: "+findFactorial(n));
		
	}
	
	static int findFactorial(int num) {
		
		if(num == 1) {
			
			return num;
		}
		else {
			
			return num * findFactorial(num - 1); //recursion
		}
	}

}
