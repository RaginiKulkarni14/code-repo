package com.microservice.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.jpa.dto.OrderResponse;
import com.microservice.jpa.dto.RequestOrder;
import com.microservice.jpa.entity.Customer;
import com.microservice.jpa.repository.CustomerRepository;
import com.microservice.jpa.repository.ProductRepository;

@RestController
public class OrderController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@PostMapping("/placeOrder")
	public Customer saveCustomer(@RequestBody RequestOrder customer)
	{
		return customerRepository.save(customer.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> getAllCustomerInfo()
	{
		return customerRepository.findAll();
	}
	
	@GetMapping("/getJoinInfo")
	public List<OrderResponse> getJoinInfo()
	{
		return customerRepository.getJoinInfo();
	}
}