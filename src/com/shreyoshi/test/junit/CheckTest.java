package com.shreyoshi.test.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CheckTest {
	
	TestOperation op = new TestOperation();
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("This method will excecute only once before all JUNIT TEST CASES have been executed");
		System.out.println();
	}
	
	@Before
	public void before() {
		
		System.out.println("This method will execute before every test method");
	}
	
	@Test
	public void testAdd() {
		
		System.out.println("Inside testAdd method");
		
		assertEquals(3, op.add(1, 2));
	}
		
	@Test(expected=NegativeNumberException.class)
	public void testSubtract() throws NegativeNumberException {
		
		System.out.println("Inside testSubtract method");
		
		assertEquals(1, op.subtract(2, 3));
	}
	
	@Ignore
	@Test
	public void testMultiply() {
		
		System.out.println("Inside testMultiply method");
		
		assertEquals(6, op.multiply(2, 3));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		
		System.out.println("Inside testDivide method");
		
		assertEquals(0, op.divide(2, 0));
	}
	
	@After
	public void after() {
		
		System.out.println("This method will execute after every test method");
		System.out.println();
	}
	
	@AfterClass
	public static void afterClass() {
		
		System.out.println("This method will excecute only once after all JUNIT TEST CASES have been executed");
		System.out.println();
	}

}
