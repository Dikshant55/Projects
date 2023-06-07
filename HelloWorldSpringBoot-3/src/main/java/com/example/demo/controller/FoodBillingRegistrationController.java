package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.FoodBillingRegistrationRepo;
import com.example.demo.repo.entity.FoodBillingRegistration;
import com.example.demo.service.FoodBillingRegistrationService;

@RestController
public class FoodBillingRegistrationController {

	@Autowired
	FoodBillingRegistrationService foodBillingRegistrationService;
	
	@GetMapping("/user/data")
	public FoodBillingRegistration getFoodBillingRegisteredUserDetails() {
		Integer userId = 5;
		FoodBillingRegistration foodBillingRegistration = foodBillingRegistrationService.getUserData(userId);
		System.out.println(foodBillingRegistration);
		return foodBillingRegistrationService.getUserData(userId);
	}

}
