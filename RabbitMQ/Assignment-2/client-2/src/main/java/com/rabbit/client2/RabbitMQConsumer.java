package com.rabbit.client2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "client2-queue")
	public void recievedMessage(String msg) {
		System.out.println("Recieved News from Publisher: " + msg);
	}
}