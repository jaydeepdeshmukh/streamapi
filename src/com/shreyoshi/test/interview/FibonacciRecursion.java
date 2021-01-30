package com.shreyoshi.test.interview;

public class FibonacciRecursion {
	
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(fibonacci(n)); //prints fibonacci number of the nth position and here n is 10
	}
	
	public static int fibonacci(int n) {
		
		if (n <= 1)
			return n;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
