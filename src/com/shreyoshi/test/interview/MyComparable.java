package com.shreyoshi.test.interview;

import java.util.TreeSet;

public class MyComparable {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(5);
		t.add(3); // 3.compareTo(5); -ve
		t.add(4); // 4.compareTo(5); -ve
		t.add(1); // 1.compareTo(5); -ve
		
		System.out.println(t);
		
		TreeSet t1 = new TreeSet();
		t1.add("C");
		t1.add("F"); 
		t1.add("A"); 
		t1.add("Z"); 
		
		System.out.println(t1);
		
		System.out.println("B".compareTo("B"));
	}
}
