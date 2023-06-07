package com.Example.StudentMangementSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderPatternProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(BuilderPatternProject1Application.class, args);
		System.out.println("hello");
		
		Customer c1=Customer.builder().name("Dikshant")
		                  .age(21)
		                  .city("Mandi")
		                  .dob("06/12/2002")
		                  
		            .build();
		
		System.out.println(c1.getName()+" "+c1.getAge()+" "+c1.getCity()+" "+c1.getDob()+" "+c1.isActiveStatus());
		
		Customer c11=Customer.builder().name("Preet")
                .age(20)
                .city("Una")
                .dob("15/03/2003")
                
          .build();

System.out.println(c11.getName()+" "+c11.getAge()+" "+c11.getCity()+" "+c11.getDob());}

	
}
