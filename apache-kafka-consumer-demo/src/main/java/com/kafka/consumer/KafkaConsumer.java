package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = {"pagos_topic",}, groupId = "pagos_tesing")
	public void consume(String message) {
		System.out.println("I've received this message: " + message);
	}
	
}
