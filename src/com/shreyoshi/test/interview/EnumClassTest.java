package com.shreyoshi.test.interview;

public class EnumClassTest {
	
	public static void main(String[] args) {
		
		System.out.println("Different thread life cycles include::::::::");
		System.out.println();
		System.out.println(ThreadState.START.getValue());
		System.out.println(ThreadState.RUNNABLE.getValue());
		System.out.println(ThreadState.RUNNING.getValue());
		System.out.println(ThreadState.STOP.getValue());
		
	}

}

enum ThreadState {

	START("001","Thread Initialized"),
	RUNNABLE("002","Thread Waiting"),
	RUNNING("003","Thread Running"),
	STOP("004","Thread Dead");
	
	private String code;
	private String value;
	
	private ThreadState(String code, String value) {
		
		this.code=code;
		this.value=value;
	}
	public String getCode() {
		return code;
	}
	public String getValue() {
		return value;
	}
	
	
}