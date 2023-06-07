package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User savedUser = userService.createUser(user);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
		}
	 @GetMapping("{id}")
	    public ResponseEntity<User> getUserById(@PathVariable("id") Integer userId){
	        User user = userService.getUserById(userId);
	        return new ResponseEntity<>(user, HttpStatus.OK);
	    }
	
	 @DeleteMapping("{id}")
	 public ResponseEntity<String> deleteUSer(@PathVariable("id") Integer id ){
	userService.deleteUSer(id);
	return new ResponseEntity<>("successfully delete",HttpStatus.OK);
	}

}
