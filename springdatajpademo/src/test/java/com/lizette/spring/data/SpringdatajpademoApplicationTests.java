package com.lizette.spring.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.lizette.spring.data.models.Product;

@SpringBootTest
class SpringdatajpademoApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void saveProduct() {

		ProductRepository repository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(1l);
		product.setName("Mac");
		product.setDescription("Awesome");
		product.setPrice(1200l);
		
		repository.save(product);
	}

}
