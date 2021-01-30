package com.shreyoshi.test.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValues {
	
	public static void main(String[] args) {
		
		//HashMap is unordered
		//sorting entries of hashMap is useless
		//sort entries based on value and store in LinkedHashMap
		//LinkedHashMap maintains order of insertion
		Map<String, Integer> scores = new HashMap<String, Integer>();
		
		scores.put("David", 95);
		scores.put("Jane", 50);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);
		
		System.out.println("Unordered hashmap:: "+scores);
		System.out.println();
		
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		
		//A map entry (key-value pair). 
		//The Map.entrySet method returns a collection-view of the map, whose elements are of this class. 
		Set<Entry<String, Integer>> entrySet = scores.entrySet();
		System.out.println("Unordered set containing hashMap values is:: "+entrySet);
		System.out.println();
		
		//Sorting of set to be done on ordered list
		List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		System.out.println("Ordered List is:: "+entryList);
		System.out.println();
		
		entryList.sort((x,y) -> x.getValue().compareTo(y.getValue())); //Comparator
		System.out.println("After sorting the list:: "+entryList);
		System.out.println();
		
		//copying the sorted ordered list values to linkedHashMap
		for(Entry<String, Integer> e : entryList) {
			
			sortedMap.put(e.getKey(), e.getValue());
		}
		System.out.println("Sorted ordered LinkedHashMap is:: "+sortedMap);
	}

}
