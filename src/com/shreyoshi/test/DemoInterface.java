package com.shreyoshi.test;


interface Phone
{
	void call();
	
	default void message() {
		
		System.out.println("Sent");
	}
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		
		System.out.println("Calling");
	}
	
}

public class DemoInterface {
	
	public static void main(String[] args) {
		
		Phone p = new AndroidPhone();
		p.call();
		p.message();
		
	}

}
