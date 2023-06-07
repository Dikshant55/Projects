package com.example.demo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {
	static Logger logger = Logger.getLogger(StudentApplication.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(StudentApplication.class, args);
		 logger.debug("This is debug message");
	        logger.info("This is info message");
	        logger.warn("This is warn message");
	        logger.fatal("This is fatal message");
	        logger.error("This is error message");

	        System.out.println("Logic executed successfully....");
	}

}
