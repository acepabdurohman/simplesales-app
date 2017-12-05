package com.acepabdurohman.simplesalesapp.service;

import com.acepabdurohman.simplesalesapp.dto.ProductRequest;
import com.acepabdurohman.simplesalesapp.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findOne(Long id);

    Product save(ProductRequest productRequest, Long id);

    void delete(Long id);
}
