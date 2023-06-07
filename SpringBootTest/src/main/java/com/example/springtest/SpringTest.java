package com.example.springtest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringTest {
	
	@RequestMapping("user")
	public String hello() {
		
		return "Hello Springboot";
	}

}
