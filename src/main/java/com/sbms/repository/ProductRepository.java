package com.sbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sbms.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
