package com.rabbit.newspublisher.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitMQConfig {
	
	@Bean
	Queue client1Queue() {
		return new Queue("client1-queue", false);
	}
	
	@Bean
	Queue client2Queue() {
		return new Queue("client2-queue", false);
	}
	
	@Bean
	Queue client3Queue() {
		return new Queue("client3-queue", false);
	}
	
	@Bean
	TopicExchange exchange() {
		return new TopicExchange("News-Publisher");
	}
	
	@Bean
	Binding client1Binding(Queue client1Queue, TopicExchange exchange) {
		return BindingBuilder.bind(client1Queue).to(exchange).with("sports");
	}
	
	@Bean
	Binding client2Binding1(Queue client2Queue, TopicExchange exchange) {
		return BindingBuilder.bind(client2Queue).to(exchange).with("politics");
	}
	
	@Bean
	Binding client2Binding2(Queue client2Queue, TopicExchange exchange) {
		return BindingBuilder.bind(client2Queue).to(exchange).with("tech");
	}
	
	@Bean
	Binding client3Binding1(Queue client3Queue, TopicExchange exchange) {
		return BindingBuilder.bind(client3Queue).to(exchange).with("science");
	}
	
	@Bean
	Binding client3Binding2(Queue client3Queue, TopicExchange exchange) {
		return BindingBuilder.bind(client3Queue).to(exchange).with("sports");
	}
	
}
