package com.microservice.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservice.jpa.dto.OrderResponse;
import com.microservice.jpa.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	@Query("SELECT new com.microservice.jpa.dto.Orderresponse(c.name,p.productName) FROM CUSTOMER c JOIN c.product p")
	public List<OrderResponse> getJoinInfo();

}