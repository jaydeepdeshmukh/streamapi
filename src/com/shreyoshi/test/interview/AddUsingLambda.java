package com.shreyoshi.test.interview;

public class AddUsingLambda {
	
	public static void main(String[] args) {
		
		Addition sum = (a,b) -> {int result = a+b;
								 System.out.println("After adding result is:: "+result);
		};
		
		sum.add(3, 4);
	}

}

@FunctionalInterface
interface Addition {
	
	public void add(int a, int b);
	
	//gives below compile time error in main method
	//The target type of this expression must be a functional interface
	//to avoid this we use @FunctionalInterface
	//public void subtract(int a, int b);
}
