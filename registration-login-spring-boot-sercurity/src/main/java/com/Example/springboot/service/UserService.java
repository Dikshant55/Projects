package com.Example.springboot.service;

import com.Example.springboot.model.User;
import com.Example.springboot.web.dtp.UserRegistrationDto;

public interface UserService {
	
	User save(UserRegistrationDto registrationDto);
	
	
	
	

}
