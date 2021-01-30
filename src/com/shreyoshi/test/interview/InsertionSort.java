package com.shreyoshi.test.interview;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, -1, -2, 4};
		
		System.out.println("Before Insertion sort:: "+Arrays.toString(arr));
		
		int n = arr.length;
		
		//take each element from the array with for loop starting from 1
		//from here we will get the 1st index element which needs to be swapped
		//this will be the current element i.e., the key
		for (int i = 1; i < n; i++) {
			
			//store each element in key which is the current value
			 int key = arr[i];
			 
			 //j will hold the previous index value
			 //This will be used for swapping
	         int j = i - 1; //j = 1-1, i.e., 0
	         
	         //Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position
	         //Swapping will be done between consecutive index elements
	         while (j >= 0 && arr[j] > key) { 
	                arr[j + 1] = arr[j]; //arr[1] = arr[0]
	                j = j - 1; //j = 0-1, i.e., -1
	         }
	         //The element in 1st index has been moved to 0th index
	         //The element originally in 0th index (current element) which is the key has been moved to the 1st index
	         arr[j + 1] = key; // arr[-1+1] = key, i.e., arr[0] = key
		}
		
		System.out.println("After Insertion Sort:: "+Arrays.toString(arr));
		
	}

}
