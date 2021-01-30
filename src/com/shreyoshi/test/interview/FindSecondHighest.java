package com.shreyoshi.test.interview;

import java.util.Arrays;

public class FindSecondHighest {
	
	public static void main(String[] args) {
		
		int[] arr = {10,67,7,99,1,56,4};
		int temp=0;
		
		System.out.println("Given array:: "+Arrays.toString(arr));
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length-i;j++) {
				
				if(arr[j-1] > arr[j]) {
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is:: "+Arrays.toString(arr));
		System.out.println();
		
		int n = arr.length-2;
		System.out.println("Second highest number in the array is:: "+arr[n]);
		
	}

}
