package com.acepabdurohman.simplesalesapp.repository;

import com.acepabdurohman.simplesalesapp.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>{
}
