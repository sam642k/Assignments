package com.rabbit.client3;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "client3-queue")
	public void recievedMessage(String msg) {
		System.out.println("Recieved News from Publisher: " + msg);
	}
}