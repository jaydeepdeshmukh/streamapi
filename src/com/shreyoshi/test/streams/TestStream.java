package com.shreyoshi.test.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** print all employees who are having city starting with P **/
public class TestStream {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Address addr = new Address();
		List<Address> addrList = new ArrayList<Address>();
		
		addr.setCity("Kolkata");
		addr.setState("West Bengal");
		addr.setCountry("India");
		addrList.add(addr);
		
		e.setId(1);
		e.setName("Roshan");
		e.setAddrList(addrList);
//		System.out.println("e "+e.toString());
//		System.out.println();
		
		Employee e1 = new Employee();
		Address addr1 = new Address();
		List<Address> addrList1 = new ArrayList<Address>();
		
		addr1.setCity("Mumbai");
		addr1.setState("Maharashtra");
		addr1.setCountry("India");
		addrList1.add(addr1);
		
		e1.setId(2);
		e1.setName("Rima");
		e1.setAddrList(addrList1);
		
//		System.out.println("e1 "+e1.toString());
//		System.out.println();
		
		Employee e2 =  new Employee();
		Address addr2 = new Address();
		List<Address> addrList2 = new ArrayList<Address>();
		
		addr2.setCity("Kolkata");
		addr2.setState("West Bengal");
		addr2.setCountry("India");
		addrList2.add(addr2);
		
		e2.setId(3);
		e2.setName("Rahul");
		e2.setAddrList(addrList2);
		
//		System.out.println("e2 "+e2.toString());
//		System.out.println();
		
		Employee e3 = new Employee();
		Address addr3 = new Address();
		List<Address> addrList3 = new ArrayList<Address>();
		
		addr3.setCity("Mumbai");
		addr3.setState("Maharashtra");
		addr3.setCountry("India");
		addrList3.add(addr3);
		
		e3.setId(4);
		e3.setName("Ruhi");
		e3.setAddrList(addrList3);
		
//		System.out.println("e3 "+e3.toString());
//		System.out.println();
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		//System.out.println(Arrays.asList(empList));
		
		//List finalList = empList.stream().filter(employee -> employee.getAddrList().stream().anyMatch(adr -> addr.getCity().startsWith("K"))).collect(Collectors.toList());
		//Map map=  empList.stream().filter(employee -> employee.getAddrList().stream().allMatch(adr -> addr.getCity().contentEquals("Kolkata"))).collect(Collectors.groupingBy(Employee::getAddrList));
		//Map map=  empList.stream().filter(employee -> employee.getAddrList().stream().allMatch(adr -> addr.getCity().contentEquals("Kolkata"))).map(Employee::getName).collect(Collectors.groupingBy(Employee::getAddrList));
		//System.out.println("List of Employees living in city starting with K is:: "+map);
		
	}

}
