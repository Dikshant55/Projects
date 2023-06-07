package com.Example.StudentRecordOptionalAndBuilderAndStream;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class Student {	
	private String name;
	private int rollno;
	private String standard;
	private int age;
}
