package com.Example.StudentMangementSystem;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Customer {
	
	private String name;
	private int age;
	private String city;
	private String dob;
	private boolean isActiveStatus;

}
