package com.example.demo.foodbilling.service;

import com.example.demo.foodbilling.entity.User;

public interface User_Service {
	
	
	User createUser(User user);
	
	User getUserById(Integer id);
	
	void deleteUser(Integer id);
	

}
