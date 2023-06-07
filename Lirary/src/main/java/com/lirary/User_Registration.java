package com.lirary;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name="user_registration")
@Data
public class User_Registration {
	
	@Id
	@Column (name="user_id")
	private int id;
	@Column (name="user_name")
	private String  name;
	@Column (name="user_pass")
	private String pass;
	
	

}
