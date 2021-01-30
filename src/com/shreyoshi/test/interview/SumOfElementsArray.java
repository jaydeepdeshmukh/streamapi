package com.shreyoshi.test.interview;

public class SumOfElementsArray {

	public static void main(String[] args) {
		
		int[] arr = {1,4,7,9,12,56,78};
		int sum=0;
		
		for(int i : arr) {
			
			sum+= i;
		}
		System.out.println("Sum is:: "+sum);
	}
}
