package com.grogu.spring.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grogu.spring.data.entities.Product;
import com.grogu.spring.data.repos.ProductRepository;

@RestController
@RequestMapping("/produt")
public class ProductController {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping
	public Iterable<Product> getProducts(){
		
		return repository.findAll();
	}

}
