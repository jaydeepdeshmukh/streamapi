package com.shreyoshi.test.interview;

public class LambdaUsingRunnable {
	
	public static void main(String[] args) {
		
		Runnable rn = () ->  System.out.println("Thread is running");
		
		new Thread(rn).start();
		System.out.println("End of main");
	}

}
