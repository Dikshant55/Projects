package com.practice.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoListWithStream {
	
	public static void main(String[] args) {
	
		List<String> names = Arrays.asList("Dikshant","Sharma","Preet","Bharwal");
		
		// start with particular name
		List<String> result= names.stream().filter(s -> s.startsWith("P"))
				                           .collect(Collectors.toList());
		System.out.println(result);
		
		// sorted
		
		List<String> sorted = names.stream().sorted()
				                            .collect(Collectors.toList());
		System.out.println(sorted);
	}}
