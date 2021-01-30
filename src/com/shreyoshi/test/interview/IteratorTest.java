package com.shreyoshi.test.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Shreyoshi");
		list.add("Jaydeep");
		list.add("Hemant");
		list.add("Vaibhav");
		list.add("Vishal");
		
		Iterator<String> itr = list.iterator();
		
		System.out.println("Elements are::: ");
		System.out.print("[");
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");		
		}
		
		System.out.print("]");
	}

}
