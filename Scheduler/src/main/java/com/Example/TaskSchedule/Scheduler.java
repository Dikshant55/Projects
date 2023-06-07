package com.Example.TaskSchedule;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Component

public class Scheduler {
	
	public void scheduler () throws InterruptedException{
		
		LocalDateTime current =LocalDateTime.now();
		DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
		
		String formatedDateTime=current.format(format);
		log.info("Scheduler time"+ formatedDateTime);
		
		
	}
}
