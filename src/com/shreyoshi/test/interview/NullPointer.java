package com.shreyoshi.test.interview;

public class NullPointer {
	
	public static void main(String[] args) {
		
		String str = null;
		
		try {
			
			str.trim();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
