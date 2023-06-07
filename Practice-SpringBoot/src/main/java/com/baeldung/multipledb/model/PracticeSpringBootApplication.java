package com.baeldung.multipledb.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSpringBootApplication implements CommandLineRunner {
	
	@Autowired
	Demo demo;

	public static void main(String[] args) {
		SpringApplication.run(PracticeSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		print();
	}
	
	public void print() {
		
		Demo d1=new Demo(1, "Dikshant", "Mandi");
		Demo d2 =new Demo (2,"abc","xyz");
		
		System.out.println(d1);
		System.out.println(d2);
		
	}
	
	

}
