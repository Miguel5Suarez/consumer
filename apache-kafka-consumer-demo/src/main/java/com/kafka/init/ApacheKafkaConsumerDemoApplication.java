package com.kafka.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.kafka.consumer", "com.kafka.config"})
public class ApacheKafkaConsumerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaConsumerDemoApplication.class, args);
	}

}
