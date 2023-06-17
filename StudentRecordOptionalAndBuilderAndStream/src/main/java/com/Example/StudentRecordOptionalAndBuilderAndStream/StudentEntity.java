package com.Example.StudentRecordOptionalAndBuilderAndStream;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentEntity {

	private String name;
	private int rollno;
	private String standard;
	private String phn;
	private String mail;
}
