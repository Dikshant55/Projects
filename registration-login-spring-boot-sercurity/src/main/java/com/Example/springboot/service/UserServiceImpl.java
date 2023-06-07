package com.Example.springboot.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Example.springboot.model.Role;
import com.Example.springboot.model.User;
import com.Example.springboot.repository.UserRepository;
import com.Example.springboot.web.dtp.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User save(UserRegistrationDto registrationDto) {
		
		User user=new User(null, registrationDto.getFirstName(), registrationDto.getLastName(),registrationDto.getEmail(),registrationDto.getPassword(),Arrays.asList(new Role("ROLE_USER")));
	return userRepository.save(user);
	}

}
