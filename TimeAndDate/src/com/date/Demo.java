package com.date;

import java.time.LocalDateTime;

public class Demo {
public static void main(String[] args) {
 String dateStr = "2022-02-16T10:22:15";
	        LocalDateTime localDateTime = LocalDateTime.parse(dateStr);
	        System.out.println("LocalDateTime obj: "+localDateTime);
		
		
		
	}
}
