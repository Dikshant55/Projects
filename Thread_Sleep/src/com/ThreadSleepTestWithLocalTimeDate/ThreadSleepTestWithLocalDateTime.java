package com.ThreadSleepTestWithLocalTimeDate;

import java.time.LocalDateTime;

public class ThreadSleepTestWithLocalDateTime {
	
	
	public static void main(String[] args) {
		
		LocalDateTime local=LocalDateTime.now();
        System.out.println(local);

        LocalDateTime local1=LocalDateTime.now().plusMinutes(1);
        System.out.println(local1);
        
        
       
        
        
	}

}
