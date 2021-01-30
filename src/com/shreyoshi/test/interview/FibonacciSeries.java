package com.shreyoshi.test.interview;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int a = 0; //fixed
		int b = 1; //fixed
		int c = 0; //has to be sum of a and b always
		
		for(int i = 0; i< 10; i++) {
			
			if(i > 1) {
				
				c = a+b;
				System.out.print(" "+c);
				
				//shifting latest value of b in a and c in b
				a=b;
				b=c;
			}
			else {
				
				System.out.print(i+" ");
			}
		}
	}
}
