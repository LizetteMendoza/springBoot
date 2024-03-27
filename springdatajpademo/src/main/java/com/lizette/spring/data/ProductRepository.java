package com.lizette.spring.data;

import org.springframework.data.repository.CrudRepository;

import com.lizette.spring.data.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
