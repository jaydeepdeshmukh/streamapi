package com.shreyoshi.test.interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateInFormat {
	
	public static void main(String[] args) throws ParseException {
		
		String strDate = "04/30/1994";
		SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");
		
		Date date = sf.parse(strDate);
		System.out.println("Date is:: "+date);
		System.out.println();
		
		String printDate = sf.format(date);
		System.out.println("Date in String is:: "+printDate);
		
		
	}

}
