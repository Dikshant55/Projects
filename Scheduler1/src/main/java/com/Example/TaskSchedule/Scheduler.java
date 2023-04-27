package com.Example.TaskSchedule;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Scheduler {

	@Scheduled(fixedRateString ="PT02S",initialDelay = 1000)
	public void scheduler () throws InterruptedException{
		
		
		LocalDateTime current=LocalDateTime.now();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyy HH-mm-ss");
		String formatedDateTime=current.format(format);
		log.info("Scheduler time"+formatedDateTime);
		Thread.sleep(1000);
	}
}

