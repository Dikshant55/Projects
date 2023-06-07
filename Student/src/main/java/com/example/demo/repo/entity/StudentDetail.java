package com.example.demo.repo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table (name="studentdetail")
@Data
public class StudentDetail {
	
	@Id
	@Column (name="UserId")
	private int userid;
	
	@Column (name="UserName")
	private String username;

}
