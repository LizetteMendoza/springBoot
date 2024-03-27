package com.grogu.spring.data.repos;

import org.springframework.data.repository.CrudRepository;

import com.grogu.spring.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	

}
