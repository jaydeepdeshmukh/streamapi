package com.shreyoshi.test.interview;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("2");
		
		List<String> list3 = new ArrayList<String>();
		list2.add("3");
		
		List<String> mergedList = new ArrayList<String>(list1);
		mergedList.addAll(list2);
		mergedList.addAll(list3);
		
		System.out.println("Merged List is:: "+mergedList);
	}

}
