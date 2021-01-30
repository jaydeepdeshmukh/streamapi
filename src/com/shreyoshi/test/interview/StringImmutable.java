package com.shreyoshi.test.interview;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = str1;
		int a=3;
		str1.concat("Python"); //performing concatenation does not change the value of str1 in thread class
		a++; //incrementing value changes the value in thread class as well
		
		MyThread1 thread = new MyThread1(str1,a);
		Thread t = new Thread(thread);
		t.start();
		
		if(str1 == str2) {
			
			System.out.println("References are same as both strings point to same object");
			System.out.println("str1:: "+str1);
			System.out.println("str2:: "+str2);
			System.out.println();
		}
		else {
			
			System.out.println("References are different");
			System.out.println();
		}
		
		str1 = "C++";
		
		System.out.println("str1:: "+str1);
		System.out.println();
		
		if(str1 == str2) {
			
			System.out.println("References are same");
			System.out.println();
		}
		else {
			
			System.out.println("References are not same as str1 points to some other object");
			System.out.println("str1:: "+str1);
			System.out.println("str2:: "+str2);
		}
		
	}
}

class MyThread1 implements Runnable{
	
	String str="";
	int a=0;
	

	public MyThread1(String str, int a) {
		
		this.str = str;
		this.a=a;
	}


	@Override
	public void run() {
		System.out.println("Inside Thread======= str:: "+str+" a:: "+a);
		
	}
	
	
}
