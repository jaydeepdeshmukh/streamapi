package com.shreyoshi.test.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/** Problem: Most working experience in the organization
 * *********************************************************
 * Solution:
 * sort employeeList by yearOfJoining in natural order
 * first employee will have most working experience in the organization **/
public class MostWorkExpInOrg {

	public static void main(String[] args) {

		List<Associate> associateList = new ArrayList<Associate>();

		associateList.add(new Associate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		associateList.add(new Associate(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		associateList.add(new Associate(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		associateList.add(new Associate(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		associateList.add(new Associate(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		associateList.add(new Associate(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		associateList.add(new Associate(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		associateList.add(new Associate(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		associateList.add(new Associate(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		associateList.add(new Associate(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		associateList.add(new Associate(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		associateList.add(new Associate(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		associateList.add(new Associate(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		associateList.add(new Associate(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		associateList.add(new Associate(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		associateList.add(new Associate(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		associateList.add(new Associate(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		Optional<Associate> oldestAssociaterapper = associateList.stream().sorted(Comparator.comparingInt(Associate::getYearOfJoining)).findFirst();
		Associate oldestAssociate = oldestAssociaterapper.get();
		
		System.out.println("Senior Most Employee Details :");
        
		System.out.println("----------------------------");
		         
		System.out.println("ID : "+oldestAssociate.getId());
		         
		System.out.println("Name : "+oldestAssociate.getName());
		         
		System.out.println("Age : "+oldestAssociate.getAge());
		         
		System.out.println("Gender : "+oldestAssociate.getGender());
		         
		System.out.println("Age : "+oldestAssociate.getDepartment());
		         
		System.out.println("Year Of Joinging : "+oldestAssociate.getYearOfJoining());
		         
		System.out.println("Salary : "+oldestAssociate.getSalary());
	}

}
