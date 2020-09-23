package com.example.demo;

import java.nio.charset.Charset;

public class Product {

	public Product(String productId, String name) {
		ProductId = productId;
		Name = name;
	}

	private String ProductId;

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	private String Name;

	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId  + "Name=" + Name + "]";
	}

}
