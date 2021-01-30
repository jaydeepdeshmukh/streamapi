package com.shreyoshi.test.interview;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int temp = 0;
		
		System.out.println("Given array:: "+Arrays.toString(arr));
		System.out.println("Length of given array is:: "+arr.length);
		System.out.println();
		
		Random rand = new Random();
		
		for(int i=0;i<arr.length;i++) {
			
			int randIndex = rand.nextInt(arr.length);
			
			temp = arr[randIndex];
			arr[randIndex] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("Shuffled array is:: "+Arrays.toString(arr));
		System.out.println("Length of shuffled array is:: "+arr.length);
	}

}
