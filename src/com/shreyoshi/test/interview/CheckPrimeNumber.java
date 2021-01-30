package com.shreyoshi.test.interview;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		int n = 17;
		
		boolean checkPrime = isPrime(n);
		
		if(checkPrime)
			System.out.println(n+" is a Prime Number");
		else
			System.out.println(n+" is not a Prime Number");
		
//		System.out.println(5%2); //gives remainder
//		System.out.println(5/2); //gives quotient
	}
	
	static boolean isPrime(int num) {
		
		boolean isPrime = false;
		
		if(num == 0 || num == 1) {
			
			return isPrime;
		}
		
//		if(num == 2) {
//			
//			return isPrime;
//		}
		
		for(int i = 2; i <= num/2; i++) { //imagine for loop to be a number line and each number is to be compared with the input
			
			System.out.println("================================");
			System.out.println("i is:: "+i);
			System.out.println("Modulo is:: "+num%i);
			
			if(num%i == 0) {
				System.out.println("divisible");
				System.out.println("============================");
				System.out.println();
				return false;
			}
			
			System.out.println("not divisible");
			System.out.println("============================");
			System.out.println();
		}
		
		 isPrime=true;
		return isPrime;
	}
}
