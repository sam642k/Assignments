package com.rabbit.inventorycheckservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.inventorycheckservice.model.Product;

@RestController
@RequestMapping("/inv")
public class InventoryCheckController {
	
	@Autowired
	private AmqpTemplate amqp;
	
	static List<Product> list= Arrays.asList(
			new Product(26342, "Skullcandy In-Ear Earbud", 39, "Electronics", 123),
			new Product(87323, "Dell Keyboard", 9, "Computer", 6),
			new Product(87234, "Zodiac Shirt", 10, "Mens Fashion", 984),
			new Product(89324, "Aragon Skirt", 15, "Womens Fashion", 983),
			new Product(98234, "Dinner Set", 55, "Home & Kitchen", 834),
			new Product(65653, "VIP Traveller", 45, "Luggage", 100),
			new Product(98343, "Dog Chew Toy", 23, "Pet Shop", 873),
			new Product(98233, "Cricket Bat", 20, "Sports", 290),
			new Product(89723, "Dell Optical Mouse", 19, "Computer", 5),
			new Product(87634, "Logitech Camera", 35, "Computer", 1000)
			);
	
	@RequestMapping("/check")
	public String check() {
		list.stream().forEach(p->{
			if(p.getQuantity()<10)
				amqp.convertAndSend("Stock-Notification-Exchange", "", p.toString()+" Required Quantity = "+(10-p.getQuantity())+"\n");
		});

		return "Message Sent Successfully";
	}
	
}
