package com.shreyoshi.test.interview;

import java.util.HashSet;

//The size of the shortSet will be 100. 
//Java Autoboxing feature has been introduced in JDK 5, 
//so while adding the short to HashSet<Short> it will automatically convert it to Short object. 
//Now “i-1” will be converted to an int while evaluation 
//and after that it will be autoboxed to Integer object 
//but there is no Integer object in the HashSet, 
//so it will not remove anything from the HashSet and finally its size will be 100.
public class TestRemoveAutoboxingInHashSet {
	
	public static void main(String[] args) {
		
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
//			shortSet.remove((short) ((short)i-1));
		}
		System.out.println(shortSet.size());
	}

}
