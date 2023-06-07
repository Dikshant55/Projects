package com.Example.KafkaScheduler;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class SampleProducer {

	  public SampleProducer() {
	       Properties props = new Properties();
	        props.put("bootstrap.servers", "localhost:9092");
	        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
	        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
	     ProducerRecord producerRecord=new ProducerRecord("channel","name","nothing");
	     KafkaProducer kafkaProducer =new KafkaProducer<>(props);
	     
	     kafkaProducer.send(producerRecord);
	     kafkaProducer.close();    
	}
	
}
