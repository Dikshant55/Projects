package com.example.demo.repo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "foodbillingregistration")
@Data
public class FoodBillingRegistration {
	
	@Id
	@Column(name="user_id")
	private Integer userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_mail")
	private String userMail;
	@Column(name="user_pass")
	private String userPass;

}
