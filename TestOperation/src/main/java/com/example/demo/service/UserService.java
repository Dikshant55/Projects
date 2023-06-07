package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.User;

public interface UserService {
	
	
	User createUser(User user);
	
	User getUserById(Integer id);
	
	List<User> getAllUser();
	
	void deleteUSer(Integer id);

}
