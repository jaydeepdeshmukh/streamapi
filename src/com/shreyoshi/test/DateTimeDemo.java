package com.shreyoshi.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		
		//localdate gives machine specific date
		LocalDate d = LocalDate.now(); //now() prints only date and not time
		System.out.println(d);
		
		LocalDate c = LocalDate.of(1994, 4, 30);
		System.out.println(c); //of() gives the date we want to print
		
		//The above code can create a confusion if starting month is considered 0 or 1
		LocalDate b = LocalDate.of(1994, Month.APRIL, 30);
		System.out.println(b); //Month.APRIL used instead of 4
		
//		LocalDate a = LocalDate.of(1994, Month.FEBRUARY, 29);
//		System.out.println(a); //gives exception as 1994 was not a leap year
		
		//gives local time
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		//to get specific time
		LocalTime s = LocalTime.of(12, 35, 10, 900);
		System.out.println(s);
		
		//print zone id
		for(String q : ZoneId.getAvailableZoneIds()) { //getAvailableZoneIds returns set so does not maintain order
			
			//System.out.println(q);
		}
		
		LocalTime p = LocalTime.now(ZoneId.of("America/Cuiaba"));
		//System.out.println(p);
		
		
		LocalTime o = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(o);
		
		Instant i = Instant.now();
		System.out.println(i); //gives date and GMT
		
		LocalDateTime n = LocalDateTime.now(ZoneId.of("GMT"));
		System.out.println(n);
		
	}

}
