package com.shreyoshi.test.interview;

//The given statements output will be �ourn�. 
//First character will be automatically type casted to int. 
//After that since in java first character index is 0, so it will start from �o� and print till �n�.
//Note that in String substring function it leaves the end index.
public class SubstringTest {
	
	public static void main(String[] args) {
		
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));

	}

}
