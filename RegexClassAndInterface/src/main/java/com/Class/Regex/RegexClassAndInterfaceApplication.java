package com.Class.Regex;

import java.util.regex.Pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegexClassAndInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegexClassAndInterfaceApplication.class, args);
	
	
		
		System.out.println(Pattern.matches("HEL*LO", "HELLO"));
		
	
	}

}
