package com.shreyoshi.test.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfOcurranceInFile {
	
	public static void main(String[] args) throws IOException {
		
		String word = "Kolkata";
		String line="";
		int count = 0;
		
		FileReader file = new FileReader("D:\\Docs\\test.txt");
		BufferedReader br = new BufferedReader(file);
		
		while((line = br.readLine())!=null) {
			
			String[] str = line.split(" ");
			
			for(int i = 0;i<str.length;i++) {
				
				if(word.equals(str[i])) {
					count++;
				}
			}			
		}
		System.out.println("Number of ocurrances of word ("+word+") in the file is:: "+count);
		br.close();
	}	
}
