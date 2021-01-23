package com.shreyoshi.test.junit;

public class TestOperation {

	int add(int a, int b) {

		return a+b;
	}
	
	int subtract(int a, int b) throws NegativeNumberException {
		
		int res=0;
		res=a-b;
		
		if(res>0)
			return res;
		else 
			throw new NegativeNumberException();
	}
	
	int multiply(int a, int b) {
			return a*b;
	}
	
	int divide(int a, int b) {
			return a/b;
	}
}
