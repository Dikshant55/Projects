package com.Example.StudentMangementSystem;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
	
	private String name;
	private int age;
	private String city;
	private boolean isActive;
	private String dob;
	

}
