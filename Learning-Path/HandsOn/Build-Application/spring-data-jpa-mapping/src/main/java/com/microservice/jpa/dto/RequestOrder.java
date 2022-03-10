package com.microservice.jpa.dto;

import com.microservice.jpa.entity.Customer;

public class RequestOrder {
	
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	RequestOrder(Customer customer)
	{
		this.customer=customer;
	}
	


}
