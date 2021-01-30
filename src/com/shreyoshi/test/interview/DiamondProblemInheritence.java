package com.shreyoshi.test.interview;

public class DiamondProblemInheritence {
	
	public static void main(String[] args) {
		
		Chicken chk = new Chicken();
		System.out.println("Inside main to call Ckicken class method");
		System.out.println();
		chk.display();		
	}
}

class Bird {
	
	public void demo() {
		
		System.out.println("This is Bird class method");
		System.out.println();
	}
}

class Hen {
	
	public void demo() {
		
		System.out.println("This is Hen class method");
		System.out.println();
	}
}


class Chicken extends Hen/** , Bird **/ {
	
	public void display() {
		
		System.out.println("Inside Chicken class");
		System.out.println("=================================================================");	
		System.out.println("I was trying to implement multiple inheritence");
		System.out.println("I got confused as to which demo() method to invoke as both my parents have same methods");
		System.out.println("It was ambiguous");
		System.out.println("This is diamond problem");
		System.out.println("I realised JAVA does not allow inheriting two classes by one subclass");
		System.out.println("=================================================================");
		System.out.println();
		System.out.println("So I will call Hen parent class method");
		Chicken.super.demo();
		
	}
	
}