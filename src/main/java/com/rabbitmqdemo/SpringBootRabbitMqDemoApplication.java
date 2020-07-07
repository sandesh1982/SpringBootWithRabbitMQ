package com.rabbitmqdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRabbitMqDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(
				new Object[] { SpringBootRabbitMqDemoApplication.class }, args);
	}
}