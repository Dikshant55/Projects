package com.lirary;

import org.springframework.beans.factory.annotation.Autowired;

public class UserRegistrationService {
	
	@Autowired
	
	UserRegistrationRepo userRegistrationRepo ;
	
	public User_Registration getUserData (Integer id) {
		
		
		
		return UserRegistrationRepo.getById(id);
	}

}
