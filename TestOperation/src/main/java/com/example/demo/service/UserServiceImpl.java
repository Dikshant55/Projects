package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repo.UserRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	public User createUser(User user) {
	
		
		return userRepo.save(user);
	}
	@Override
	public User getUserById(Integer id) {
		 Optional<User> optionalUser = userRepo.findById(id);
	        return optionalUser.get();
	}


	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void deleteUSer(Integer id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
		
	}

}
