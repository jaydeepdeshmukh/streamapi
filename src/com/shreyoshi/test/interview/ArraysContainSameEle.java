package com.shreyoshi.test.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class ArraysContainSameEle {

	public static void main(String[] args) {

		Integer[] arr1 = {1,2,3,4,5,6,7};
		Integer[] arr2 = {1,4,6,8,10,12,17,20,50};
		

		for(int i=0;i<arr1.length-1;i++) {
			
			boolean isSame=false;
			
			for(int j=0;j<arr2.length-1;j++) {
				
				if(arr1[i]==arr2[j]) {
					
					isSame=true;
					break;
					
				}
			}
			
			if(isSame) {
				System.out.println("Both arrays contain same element "+arr1[i]);
			}
//			else {
//				System.out.println("Both arrays are unique");
//			}
		}
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("Using collections");
		
		Set<Object> sameElements1 = new HashSet<>(Arrays.asList(arr1));
		Set<Object> sameElements2 = new HashSet<>(Arrays.asList(arr2));
		
		for(Object obj : sameElements1) {
			
			if(sameElements2.contains(obj)) {
				
				System.out.println("Both arrays have same element:: "+obj);
			}
//			else {
//				System.out.println("Both arrays do not have same element");
//			}	
		}
		
		System.out.println();
		ArrayList<Object> list = new ArrayList<>();
		list.add(arr1);
		list.add(arr2);
		
		IntStream.range(0, arr1.length).filter(i -> arr1[i] == arr2[i]).map(i -> arr1[i]).forEach(System.out::println);
		
	}

}
