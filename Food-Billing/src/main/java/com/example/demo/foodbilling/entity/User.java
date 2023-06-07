package com.example.demo.foodbilling.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name ="user")
public class User{
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String pass;
	

}
