package com.shreyoshi.test.interview;

import java.util.ArrayList;

public class CkeckOddInList {
	
	public static void main(String[] args) {
		
		boolean isOdd = true;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
//		list.add(9);
//		list.add(3);
//		list.add(13);
		list.add(2);
		
		
		
		for(Integer i : list) {
			
			if(i%2 == 0) {
	
				isOdd=false;
				break;
			}				
		}
		
		if(isOdd)
			System.out.println("Contains only odd numbers");
		else
			System.out.println("Contains even numbers");
		System.out.println("");
		
		//using stream
		System.out.println(list.stream().anyMatch(n -> n%2 !=0)); //anyMatch is a terminal operation and returns true as soon as any element matches the condition
	}

}
