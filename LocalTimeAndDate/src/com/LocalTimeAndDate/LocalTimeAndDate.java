package com.LocalTimeAndDate;

import java.time.LocalDateTime;

public class LocalTimeAndDate {

	
	public static void main(String[] args) {
		

		LocalDateTime local=LocalDateTime.now();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Before"+local);
		
		LocalDateTime one= local.plusMinutes(1);
		System.out.println(one);
		
		
		
	}
}

