package com.microservice.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.jpa.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
