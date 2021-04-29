package com.example.stream.api;

import java.util.*;

public class BasicExp {

	public static void main(String[] args) {

		List<Product> al = new ArrayList<Product>();

		//Traditional way
		/*for (Product element : getProducts()) {
			if (element.getPrice() > 6000) {
				al.add(element);
			}
		}

		for (Product element : al) {
			System.out.println(element);
		}*/

		//using stream-api filter
		getProducts().stream().filter(product -> product.getPrice() > 6000).forEach(element -> System.out.println(element));
	}

	public static List<Product> getProducts() {
		List<Product> product = new ArrayList<Product>();
		product.add(new Product("Fridge", 6000));
		product.add(new Product("TV", 8000));
		product.add(new Product("Washing Machine", 10000));
		product.add(new Product("Sofa", 6000));
		return product;

	}

}
