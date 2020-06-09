package com.kafka.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.User;

@RestController
@RequestMapping("/kafka")
public class UserController {

	@Autowired
	KafkaTemplate<String, User> kafkaTemplate;

	private final String TOPIC = "Kafka_example";

	@GetMapping("/publish/{name}")
	public String getReq(@PathVariable("name") final String name) {
		
		kafkaTemplate.send(TOPIC, new User(name, 24, "IT"));
		
		return "sentttttttt successfully";
	}

}
