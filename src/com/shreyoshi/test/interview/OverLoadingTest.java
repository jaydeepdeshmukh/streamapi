package com.shreyoshi.test.interview;

public class OverLoadingTest {
	
	public static void main(String[] args) {
		
		Overload ov = new Overload();
		
		ov.add(1, 2);
		System.out.println();
		
		String c = ov.add("Shrey", "Deep");
		System.out.println();
		
		ov.add("G", "O", "D");
		
	}

}

class Overload {
	
	public void add(int a, int b) {
		
		System.out.println("Integer:: "+(a+b));
	}
	
	public String add(String a, String b) {
		
		String c = a+b;
		System.out.println("String "+c);
		return c;
	}
	
	public void add(String a, String b, String c) {
		System.out.println("String 3 params:: "+a+b+c);
		
	}
}