package com.rabbit.inventorycheckservice.model;

public class Product {
	
	int id;
	String name;
	int price;
	String category;
	int quantity;
	
	public Product() {}
	
	public Product(int id, String name, int price, String category, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}
	
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + ", quantity="
				+ quantity + "]";
	}
	
}
