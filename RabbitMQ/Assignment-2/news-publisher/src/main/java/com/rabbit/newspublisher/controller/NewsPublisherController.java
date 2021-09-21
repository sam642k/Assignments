package com.rabbit.newspublisher.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news-publisher")
public class NewsPublisherController {
	
	@Autowired
	AmqpTemplate amqp;
	
	@RequestMapping("/publish")
	public String publish(@RequestParam("routingKey") String routingKey, @RequestParam("msg") String msg) {
		
		amqp.convertAndSend("News-Publisher", routingKey, msg);
		
		return "Message: "+msg+" sent successfully to "+routingKey;
	}
	
}
