package com.Example.StudentRecordOptionalAndBuilderAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class StudentRecordOptionalAndBuilderAndStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRecordOptionalAndBuilderAndStreamApplication.class, args);

		StudentEntity s1 = StudentEntity.builder().name("Dikshant").rollno(1).standard("8th sem")
				.mail("dikshant51015@gmail.com").phn("8580677442").build();
		log.info("S1 completed");
		StudentEntity s2 = StudentEntity.builder().name("Meethu").rollno(2).standard("8th sem")
				.mail("dikshant51015@gmail.com").phn("8580677442").build();
		log.info("S2 completed");
		StudentEntity s3 = StudentEntity.builder().name("Preet").rollno(3).standard("2nd sem").mail("preet@gmail.com")
				.phn("8580677442").build();
		log.info("S3 completed");
		StudentEntity s4 = StudentEntity.builder().name("mohit").rollno(4).standard("2th sem").mail("mohit@gmail.com")
				.phn("1234562").build();
		log.info("S4 completed");
		StudentEntity s5 = StudentEntity.builder().name("Vishal").rollno(5).standard("8th sem").mail("vishal@gmail.com")
				.phn("8580677442").build();
		log.info("S5 completed");

		List<StudentEntity> studentlist = Arrays.asList(s1, s2, s3, s4, s5);
		Optional<StudentEntity> optional = studentlist.stream().filter(student -> student.getName().matches("Dikshant"))
				.findFirst();
		if (optional.isPresent()) {
			log.info("Present->" + optional.get());
		} else {

			log.info("Not Present");
		}

	}

}
