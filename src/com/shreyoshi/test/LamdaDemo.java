package com.shreyoshi.test;

interface A{

	void show(int i);
}


//class Xyz implements A{
//
//	@Override
//	public void show() {
//		
//		System.out.println("I am old way of implementation");
//	}	
//	
//}

public class LamdaDemo {

	public static void main(String[] args) {
		
		A obj;
		
		//obj = new Xyz();
		
//		obj = new A()  //anonymous Inner class
//		{
//			 public void show() {
//				 
//				 System.out.println("I am anonymous inner class");
//			 }
//		};
		
//		obj = () ->{
//			
//			System.out.println("I am Lambda expression");
//		};
		
		//one liner lambda expression as it has only one line in implementation
		//obj = (int i) -> System.out.println("I am one liner lambda expression and i value is:: "+i);
		
		//obj = (i) -> System.out.println("I am one liner lambda expression. I do not need return type of the parameter passed and param value is:: "+i);
		
		obj = i -> System.out.println("I do not need you to write me inside paranthesis as I am a single parameter and param value is:: "+i);
		
		obj.show(6);

	}

}
