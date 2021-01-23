package com.shreyoshi.test.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmp {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(1, "Jaydeep", "Thane");
		Employee1 e2 = new Employee1(2, "Hemant", "Mumbai");
		Employee1 e3 = new Employee1(3, "Shreyoshi", "Thane");
		Employee1 e4 = new Employee1(4, "Vishal", "Mumbai");
		
		List<Employee1> list = new ArrayList<Employee1>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Employee1::getCity, Collectors.counting()));
		System.out.println(map);
		
		
		Map<String, List<Employee1>> map1 = list.stream().collect(Collectors.groupingBy(Employee1::getCity,Collectors.toCollection(ArrayList::new)));
		System.out.println(map1);
		
		ArrayList<Employee1> finalList = (ArrayList<Employee1>) list.stream().filter(e -> e.getCity().equalsIgnoreCase("Thane")).collect(Collectors.toList());
		System.out.println(finalList);
		
	}

}
