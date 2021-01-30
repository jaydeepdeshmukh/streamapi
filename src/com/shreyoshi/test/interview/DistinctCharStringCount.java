package com.shreyoshi.test.interview;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharStringCount {
	
	public static void main(String[] args) {
		
		String str = "abcdABCDabcd";
		
		char[] chArr = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c : chArr) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
			
		}
		System.out.println("Distinct character count in string:: "+map);
	}

}
