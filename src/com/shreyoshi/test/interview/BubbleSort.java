package com.shreyoshi.test.interview;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, -1, -2, 4};
		
		System.out.println("Before Bubble sort:: "+Arrays.toString(arr));
		
		int n = arr.length;
		int temp =0;
		
		//to take one element at a time
		for(int i = 0; i < n; i++) {
			
			//to compare each element with whole array
			for(int j = 1; j < (n-i); j++) {
				
				 if(arr[j-1] > arr[j]) {
					 
					 temp = arr[j-1];
					 arr[j-1] = arr[j];
					 arr[j] = temp;
				 }
			}
		}
		
		System.out.println("After Bubble Sort:: "+Arrays.toString(arr));
	}

}
