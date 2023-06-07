package com.baeldung.multipledb.model;

import jakarta.persistence.Table;
import lombok.Data;

@Data

@Table
public class UserSPDetail {
	
    String email;
	String firstName;
	String mi9ddleName;
	String lastName;
	String gender;
	String phoneNumber;
	String summary;
	String experience;
	int result;
    

}
