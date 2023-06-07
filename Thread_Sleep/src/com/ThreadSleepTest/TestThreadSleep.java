package com.ThreadSleepTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestThreadSleep {


		
		public static void main(String[] aths)
	{
			
			LocalDateTime local=LocalDateTime.now();
			DateTimeFormatter format=DateTimeFormatter.ofPattern("E,dd MMMM yyy HH:mm:ss");
			String formatdatetime=local.format(format);
			System.out.println(formatdatetime);

			try{
				String name="WELCOME";
				
				for(int i=0;i<=5;i++) {
				
					Thread.sleep(1000);
					System.out.println(name);
				}
				
			}
			catch (Exception e) {
				// TODO: handle exception
			}


	}
	}


