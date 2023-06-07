package com.example.demo.foodbilling.controller;
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
import com.example.demo.foodbilling.entity.User;
import com.example.demo.foodbilling.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("user")

public class UserController {

	@Autowired
	private UserServiceImpl userservice;
	
	@PostMapping
	 public ResponseEntity<User> createUser(@RequestBody User user){
		log.info("creating user :{}",user);
	        User savedUser = userservice.createUser(user);
	        log.info("Saved user with id :{}",savedUser.getId());
	        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	    }
	 
	 @GetMapping("/{id}")
	    public ResponseEntity<User> getUserById(@PathVariable("id") Integer userId){
	        User user = userservice.getUserById(userId);
	        log.info("User  is present "+user);
	        return new ResponseEntity<>(user, HttpStatus.OK);
	    }
	 
	 @DeleteMapping("{id}")
	   public ResponseEntity<String> deleteUser(@PathVariable ("id") Integer id){
		 
		 userservice.deleteUser(id);
		 log.info("Successfully deleted"+id);
		 
		 return new ResponseEntity<>("User successfully deleted",HttpStatus.OK);
	 }
                           
}
