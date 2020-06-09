package com.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.model.User;

@Service
public class Listener {

	@KafkaListener(topics = "Kafka_example", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message : " + message);
	}

	
	@KafkaListener(topics="Kafka_example_json", groupId = "group_json", containerFactory = "userKafkaListenerContainerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed Json mesage : "+user);
	}
}
