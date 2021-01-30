package com.shreyoshi.test.interview;

public class DiamondProblemInterface {

	public static void main(String[] args) {

		BlackBird bb = new BlackBird();
		bb.canFly();
		System.out.println();
		bb.canSing();
		System.out.println();
		bb.hasBeak();
		System.out.println();
		
		//Gives Below compile error:::
		//The field bb.color is ambiguous
	    //System.out.println("Color of Cuckoo bird is:: "+bb.color);
		
		System.out.println("Color of Cuckoo bird is:: "+Cuckoo.color);
		System.out.println("Color of Crow bird is:: "+Crow.color);
		System.out.println("Color of BlackBird is:: "+bb.color);
	}

}

interface Cuckoo {
	
	String color = "black";

	public void canFly();

	default void canSing() {

		System.out.println("Cuckoo bird sings beautifully");
	}

	static void hasBeak() {

		System.out.println("Cuckoo bird has beak");
	}
}

interface Crow {
	
	String color = "black";

	public void canFly();

	default void canSing() {

		System.out.println("Crow bird can't sing");
	}

	static void hasBeak() {

		System.out.println("Crow bird has beak");
	}
}

//Gives below compile time error if we do not override the same default methods of interface::::
//Duplicate default methods named canSing 
//with the parameters () and () are inherited from the types Crow and Cuckoo
//This is Diamond Problem in interfaces
class BlackBird implements Cuckoo, Crow {
	
	String color = "BLACK";

	@Override
	public void canFly() {

		System.out.println("BlackBird can fly");

	}

	//Have to give own implementation
	@Override
	public void canSing() {
		
		Cuckoo.super.canSing();
		Crow.super.canSing();
	}

	//does not give any error and also No need to override this as its static method of interface
	public void hasBeak() {

		Cuckoo.hasBeak();
		Crow.hasBeak();
	}
}