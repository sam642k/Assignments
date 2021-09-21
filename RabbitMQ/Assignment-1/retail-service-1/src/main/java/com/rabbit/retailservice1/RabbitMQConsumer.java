package com.rabbit.retailservice1;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "retail1-queue")
	public void recievedMessage(String msg) {
		System.out.println("Recieved Message from Inventory Check:\n" + msg);
	}
}