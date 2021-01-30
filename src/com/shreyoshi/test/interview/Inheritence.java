package com.shreyoshi.test.interview;

public class Inheritence {
	
	public static void main(String[] args) {
		
		Animal ani = new Animal();
		ani.eyes();
		System.out.println("Animal:: "+ani.color);
		System.out.println();
		
		Dog dog = new Dog();	
		dog.eyes();
		System.out.println("Dog:: "+dog.color);
		dog.fur();
		System.out.println();
		
		Animal animal = new Dog();
		animal.eyes();
		System.out.println("Animal with dog obj:: "+animal.color);
		animal.fur();
		System.out.println();
		
		//Exception in thread "main" java.lang.ClassCastException: 
		//com.shreyoshi.test.interview.Animal cannot be cast to com.shreyoshi.test.interview.Dog
		//Dog dg = (Dog) new Animal(); 
		//System.out.println(dg.color);
	}

}

class Animal {
	
	String color = "Green";
	
	public void eyes() {
		
		System.out.println("Animals have eyes");
	}
	
	public void fur() {
		
		System.out.println("Animals have fur");
	}
}

class Dog extends Animal {
	
	String color = "black";
	
	public void eyes() {
		
		System.out.println("Dogs have eyes");
		System.out.println();
		
		System.out.println("Animal class function:: ");
		Dog.super.fur(); //calls parent class function
	}
	
}
