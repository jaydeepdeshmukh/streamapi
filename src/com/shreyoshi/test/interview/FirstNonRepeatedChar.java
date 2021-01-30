package com.shreyoshi.test.interview;

public class FirstNonRepeatedChar {
	
	public static void main(String[] args) {
		
		String str = "gibblegabbler";	
		
		for(int i=0;i<str.length();i++) {
			
			boolean isRepeated=false;
			
			for(int j=0;j<str.length();j++) {
				
				if(i!=j && str.charAt(i) == str.charAt(j)) {
					
					isRepeated=true;
					break;
				}
			}
			
			if(!isRepeated) { //check isRepeated = true for repeating characters
				
				System.out.println("First non-repeated character is:: "+str.charAt(i));
				break;				 
			}
		}
		
		
	}

}
