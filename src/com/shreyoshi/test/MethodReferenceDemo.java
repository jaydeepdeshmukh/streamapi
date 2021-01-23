package com.shreyoshi.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


interface Parser{
	
	String parse(String str);
	
	static String show() {
		
		return "Inside default of interface";
	}
}

class StringParser{
	
	public static String convert(String s) {
		
		if(s.length()>=3)
			s=s.toUpperCase();
		else
			s=s.toLowerCase();
		
		return s;
	}
	
	public String display(String name) {
		
		return "I am non-static method indirectly called by interface implementation";
	}
}

class MyPrinter{
	
	public void print(String str, Parser p) {
		
		str = p.parse(str);
		System.out.println(str);		
	}
	
	public void showName(String str, Parser p) {
		
		System.out.println("I am Non_Staic method and my name is:: showName()");
		str = p.parse(str);
		System.out.println(str);
	}
}

public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		
//		List<String> values = Arrays.asList("Shreyoshi","Jaydeep","Rachel","Joshua");
//		
//		System.out.println("names:: "+values);
//		
//		System.out.println("");
//		
//		values.forEach(str -> System.out.println(str));
//		
//		System.out.println("");
//		
//		Consumer<String> con = new Consumer<String>() {
//			
//			public void accept(String s) //takes value one by one
//			{
//				
//				System.out.println(s);
//			}
//		};
//		
//		values.forEach(con);
//		System.out.println("");
//		
//		//Call By Method in Java
//		//pass function in a function
//		//Higher order function
//		//println is a function that has to be referred with ::
//		//we need to provide type of the function and here it is System.out
//		values.forEach(System.out::println);
//		System.out.println("");
//		
		
		String str = "Shreydeep";
		
		MyPrinter obj = new MyPrinter();
		obj.print(str,new Parser() {
		
			public String parse(String s) {
				
				return StringParser.convert(s);
			}
		});
		
		System.out.println();
		System.out.println("In Lambda");
		obj.print(str, s -> StringParser.convert(s));
		System.out.println();
		
		System.out.println("By Method reference");
		obj.print(str, StringParser :: convert); //convert is static method so we are using class name
		System.out.println();
		
		System.out.println("By Method Reference of non-static method");
		StringParser sp = new StringParser();
		obj.showName(str, sp :: display);
		
		System.out.println(Parser.show());
	}

}
