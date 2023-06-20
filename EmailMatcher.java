package com.Example.Regex;

import java.util.regex.Pattern;

public class EmailMatcher {
	
	public static void main(String[] args) {
	
	String email1= "dikshant51015@gmail.com";
	
	System.out.println(validEmail(email1));
	}
	
	
	public static String validEmail(String email) {
		
		if(email == null || email.isEmpty()) {
			
			return "Invalid";
		}
		String rgx = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
		        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	
		Pattern pattern =Pattern.compile(rgx);
		if(pattern.matcher(email).matches()) {
			return "valid";
		}else {
			return "Invalid";
		}
		
		
	}
	
}
