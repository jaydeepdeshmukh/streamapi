package com.shreyoshi.test.interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountNumberOfWordsInFile {
	
	public static void main(String[] args) throws IOException {
		
		int count = 0;
		String line="";
		
		FileReader file = new FileReader("D:\\Docs\\test.txt");
		BufferedReader br = new BufferedReader(file);
		
		while((line = br.readLine())!=null) {
			
			String words[] = line.split(" ");
			count = count + words.length;
		}
		
		System.out.println("Number of words present in the file:: "+count);
		br.close();
	}

}
