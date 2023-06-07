package com.LocalTimeAndDate;

import java.time.LocalDateTime;

public class LocalTimeAndDate {

	
	public static void main(String[] args) {
		

		LocalDateTime local=LocalDateTime.now();
		System.out.println("Before"+local);
		
		LocalDateTime one= local.plusMinutes(1);
		System.out.println(one);
		
		
		
	}
}

