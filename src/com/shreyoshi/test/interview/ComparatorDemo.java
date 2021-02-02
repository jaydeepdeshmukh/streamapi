package com.shreyoshi.test.interview;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(-1);
		t.add(50);
		t.add(50);
		t.add(100);
		
		System.out.println(t);
		
		TreeSet t1 = new TreeSet(new MyStringComparator());
		t1.add("D");
		t1.add("A");
		t1.add("Z");
		t1.add("E");
		
		System.out.println(t1);
		
		TreeSet t2 = new TreeSet(new MyHeteroComaparator());
		t2.add("D");
		t2.add("A");
		t2.add("Z");
		t2.add(new StringBuffer("E"));
		t2.add(new StringBuilder("F"));
		t2.add('S');
		
		System.out.println(t2);
	}

}

class MyComparator implements Comparator {
	//logic for descending order
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
//		if(i1 < i2)
//			return 1; 
//		else if(i1 > i2)
//			return -1;
//		else
//			return 0;
		return -i1.compareTo(i2);
	}
	
}

class MyStringComparator implements Comparator {
	//logic for descending order
	@Override
	public int compare(Object o1, Object o2) {
		String i1 = (String) o1;
		String i2 = (String) o2;
		return -i1.compareTo(i2);
	}
	
}

class MyHeteroComaparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}
	
}
