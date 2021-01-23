package com.shreyoshi.test;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
	
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		System.out.println("array is:: "+values);
		System.out.println("");
		
		//outside collections so its external loop
		for(int i : values) 
		{
			System.out.println("using external loop:: "+i);
		}
		
		System.out.println("");
		
		//internal loops in Java 8
		values.forEach(i -> System.out.println("using internal loop:: "+i)); //this is a lambda expression and it is an implementation of Consumer interface
		
		System.out.println("");
	}

}
