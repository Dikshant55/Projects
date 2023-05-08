package com.codedecode.KafkaDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.KafkaDemo.service.Producer;

@RestController
@RequestMapping("/rest/api")
public class RestControllForKafkaMsg {

	@Autowired
	Producer producer;
	
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message) {
	
		producer.sendMsgToTopic(message);
	}
}
