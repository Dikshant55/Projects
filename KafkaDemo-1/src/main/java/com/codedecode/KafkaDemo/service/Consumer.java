package com.codedecode.KafkaDemo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="codeDecode_Topic", groupId="codeDecode_group")
	public void listenToTopic(String recievedMessage) {
	System.out.println("The message  recieved is"+recievedMessage);
	}
}
