package com.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class StringToLocal {
	
	
	public static void main(String[] args) {
		
		
	//	LocalDate today = LocalDate.now();
//
	//	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E,dd MMMM yyyy");
//		String formattedDate = today.format(dateTimeFormatter);
	
//	System.out.print(formattedDate);
	
	
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm");
	LocalDateTime dateTime2 = LocalDateTime.now();
	DateTimeFormatter dtf1=     DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
	LocalDateTime localDate3 = LocalDateTime.now();
	DateTimeFormatter dtf=    DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss.SSS");

	
	System.out.println( dateTime.format(dtf2));
	System.out.println( dateTime2.format(dtf1));
	System.out.println( localDate3.format(dtf));
	
	}

}
