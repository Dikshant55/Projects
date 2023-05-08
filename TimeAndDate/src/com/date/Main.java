package com.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] ars) {
		
		
		LocalDate ob=LocalDate.now();
		String obd1=ob.format(DateTimeFormatter.ISO_DATE);
		
		LocalTime T=LocalTime.now();
		String Td2=T.format(DateTimeFormatter.ISO_TIME);
		
		System.out.println("Today's Date: "+ob);
		System.out.println(" String Date: "+obd1);
		System.out.println("Current Time: "+T);
		System.out.println("String Time: "+Td2);
		
		
		LocalDateTime dt= LocalDateTime.now();
		System.out.println(dt);
		
		
		
	}

}
