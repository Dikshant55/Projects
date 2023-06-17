package com.Example.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CFG {
	
	public static void main(String[] args) {
		
	String name = "7776543210";
	
	Pattern pattern = Pattern.compile("[789]{1}[0-9]{9}");
	Matcher matcher = pattern.matcher(name);
	
	if(matcher.matches()) {
		
		System.out.println("Good");
	}
	else 
		System.out.println("Invalid");
	
	
	
	
	
	}

}
