package com.shreyoshi.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


//class ConsumerImpl implements Consumer<Integer>
//{
//	@Override
//	public void accept(Integer i) {
//		
//		System.out.println(i);
//	}
//	
//}

public class ConsumerForEachMethod {
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		//Consumer<Integer> c = new ConsumerImpl();
		
//		Consumer<Integer> c = new Consumer<Integer>() {
//			
//			public void accept(Integer i) {
//				
//				System.out.println(i);
//			}
//		};
		
//		Consumer<Integer> c = i -> System.out.println(i);
//		
//		values.forEach(c); //fetches values from list and passes values one by one to the ConsumerImpl obj
		
		values.forEach(i -> System.out.println(i)); //line 34 + 36
	}

}


