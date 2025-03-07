package com.sbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sbms.entity.Product;
import com.sbms.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService ProductService;
	
	@GetMapping("/product/{id}")
	 private ResponseEntity<Product> getEmployeeDetails(@PathVariable("id") int id) {
		Product product = ProductService.getProductById(id);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }
	
}
