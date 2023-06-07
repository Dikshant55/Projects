package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.FoodBillingRegistrationRepo;
import com.example.demo.repo.entity.FoodBillingRegistration;

@Service
public class FoodBillingRegistrationService {

	@Autowired
	FoodBillingRegistrationRepo foodBillingRegistrationRepo;
	
	public FoodBillingRegistration getUserData(Integer userId) {
		// TODO Auto-generated method stub
		return foodBillingRegistrationRepo.getById(userId); 
	}

}
