package com.Example.StudentMangementSystem;

public class BuilderPatternProjectApplication {

	public static void main(String[] args) {
		
		Customer c1=Customer.builder().name("Dikshant")
                .age(21)
                .city("Mandi")
                .isActive(true)
                .dob("06/12/2001")
                .build();
	
	}

}
