package com.shreyoshi.test.interview;

public class FunctionalInterfaceTest {
	
	public static void main(String[] args) {
		
		PostMan pm = new PostMan() {

			@Override
			public void letter() {
				
				System.out.println("I got a letter from my friend");		
			}
		};
		
		pm.letter();
		System.out.println();
		
		pm.deilveryStatus();
		System.out.println();
		
		pm.letterQuantity();
		System.out.println();
		
		PostMan.deliveredBy();
	}

}

@FunctionalInterface
interface PostMan {
	
	public void letter();
	
	default void deilveryStatus() {
		
		System.out.println("Letter delivered");
	}
	
	default void letterQuantity() {
		
		System.out.println("Letter quantity is 1");
	}
	
	static void deliveredBy() {
		
		System.out.println("Letter delivered by Post Man");
	}
	
	//Gives below compile time error on top of interface name
	//Invalid '@FunctionalInterface' annotation; PostMan is not a functional interface
	//the annotation ensures only one abstract method per interface
	//public void letterQuantity();
	
}
