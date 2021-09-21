package com.rabbit.inventorycheckservice.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {
	
	@Bean
	Queue retail1Queue() {
		return new Queue("retail1-queue", false);
	}
	
	@Bean
	Queue retail2Queue() {
		return new Queue("retail2-queue", false);
	}
	
	@Bean
	Queue retail3Queue() {
		return new Queue("retail3-queue", false);
	}
	
	@Bean
	FanoutExchange exchange() {
		return new FanoutExchange("Stock-Notification-Exchange");
	}
	
	@Bean
	Binding retail1Binding(Queue retail1Queue, FanoutExchange exchange) {
		return BindingBuilder.bind(retail1Queue).to(exchange);
	}
	
	@Bean
	Binding retail2Binding(Queue retail2Queue, FanoutExchange exchange) {
		return BindingBuilder.bind(retail2Queue).to(exchange);
	}
	
	@Bean
	Binding retail3Binding(Queue retail3Queue, FanoutExchange exchange) {
		return BindingBuilder.bind(retail3Queue).to(exchange);
	}
}
