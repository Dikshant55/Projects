package com.example.demo.foodbilling.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.foodbilling.entity.User;
import com.example.demo.foodbilling.repositary.User_Repo;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class UserServiceImpl implements User_Service {
	
	@Autowired
	private User_Repo userrepo;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userrepo.save(user);
		
		
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		  Optional<User> optionalUser = userrepo.findById(id);
	        return optionalUser.get();
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		
		userrepo.deleteById(id);
		
	}
	
	
	
	
	

}
