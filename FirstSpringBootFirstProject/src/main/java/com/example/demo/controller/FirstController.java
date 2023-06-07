package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping("meethu")
	public String hello() {
		
		return "Hello Dikshant";
	}
}
