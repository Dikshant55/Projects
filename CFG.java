package com.Example.Regex;
import java.util.regex.Pattern;

class CFG{
	
	public static void main(String []arfs) {
		
		String fname ="dikshant";
		if(typeOfName(fname)) {
			System.out.println("Good");
		}else System.out.println("NotGood");
	}
	
	public static boolean typeOfName(String name) {
		
		if(name == null || name.isEmpty()) {
			return false;
		}
		String rgx="[a-zA-Z]*";
		
		Pattern pattern =Pattern.compile(rgx);
		if(pattern.matcher(name).matches()) {
			
			return true;
		}else return false;
		
	}
	
	}

