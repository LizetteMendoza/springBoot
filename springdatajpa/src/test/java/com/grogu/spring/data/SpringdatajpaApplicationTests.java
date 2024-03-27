package com.grogu.spring.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.grogu.spring.data.entities.Product;
import com.grogu.spring.data.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {
	@Autowired
	ApplicationContext context;

	@Test
	public void saveProduct() {
		
		ProductRepository repository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(1);
		product.setName("PS5");
		product.setDescription("Videogame console");
		product.setPrice(1500);
		repository.save(product);
	}

}