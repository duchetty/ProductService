package com.sbms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbms.entity.Product;
import com.sbms.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository ProductRepository;
	
	public Product getProductById(int id)
	{
		return ProductRepository.findById(id).get();
		 
	}
}
