package com.shreyoshi.test.interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckStringPresent {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String str = "preferred";
		boolean isPresent=false;
		
		File file = new File("D:\\Docs\\test.txt");
		
		Scanner reader = new Scanner(file);
		
		while(reader.hasNextLine()) {
			
			String line = reader.nextLine();
			
			if(line.contains(str)) {
				
				isPresent=true;
			}
		}
		
		reader.close();
		
		if(isPresent)
			System.out.println("File contains the string:: "+str);
		
		else 
			System.out.println("File does not contain the string:: "+str);
	}

}
