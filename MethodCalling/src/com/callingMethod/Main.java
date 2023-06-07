package com.callingMethod;

import java.time.format.DateTimeFormatter;

class Main{
	
	
	public static void valDate(String date) {
		
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyyMMdd");
		
		try {
			
			formatter.parse(date);
			System.out.println("Valid");
		}
		catch (Exception e) {
			
			System.out.println("Invalid");
		}
		
		
	}
	
	
	
	public static void main(String[] ags) {
		
		String input="20231515";
		
		valDate(input);
	}
}