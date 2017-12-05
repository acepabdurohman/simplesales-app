package com.acepabdurohman.simplesalesapp;

import com.acepabdurohman.simplesalesapp.model.Product;
import com.acepabdurohman.simplesalesapp.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimplesalesAppApplicationTests {

	@Autowired
	private ProductRepository productRepository;

	@Test
	public void contextLoads() {
	}

	/*@Test
	public void test(){
		List<Product> products = (List<Product>) productRepository.findAll();
		Assert.assertEquals(50, products.size());
	}*/

}
