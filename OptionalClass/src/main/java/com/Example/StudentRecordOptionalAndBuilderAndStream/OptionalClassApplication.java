package com.Example.StudentRecordOptionalAndBuilderAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OptionalClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(OptionalClassApplication.class, args);
		
		
	Student s1=	Student.builder()
		       .name("Dikshant")
		       .age(21)
		       .rollno(1)
		       .standard("btech")
		       .build();
		
		Student s2=Student.builder()
	       .name("Preet")
	       .age(20)
	       .rollno(2)
	       .standard("btech")
	       .build();
		
		Student s3= Student.builder()
	       .name("Meethu")
	       .age(22)
	       .rollno(3)
	       .standard("btech")
	       .build();
		
		Student s4=Student.builder()
	       .name("Rohit")
	       .age(21)
	       .rollno(4)
	       .standard("btech")
	       .build();
	
		List<Student> studentlist=Arrays.asList(s1,s2,s3,s4);
		
		Optional<Student>optional=studentlist.stream().filter(student-> student.getStandard().matches("btech"))
		.findAny();
		
		if(optional.isPresent()) {
			
			System.out.println(optional.get());
		}
		else {
			System.out.println("Empty");
		}
		
	}

}
