package com.acepabdurohman.simplesalesapp.service.impl;

import com.acepabdurohman.simplesalesapp.dto.ProductRequest;
import com.acepabdurohman.simplesalesapp.model.Product;
import com.acepabdurohman.simplesalesapp.repository.ProductRepository;
import com.acepabdurohman.simplesalesapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        List<Product> products = (List<Product>) productRepository.findAll();
        if(!products.isEmpty()){
            return products;
        }
        return null;
    }

    @Override
    public Product findOne(Long id) {
        Product product = productRepository.findOne(id);
        if(product != null){
            return product;
        }
        return null;
    }

    @Override
    public Product save(ProductRequest productRequest, Long id) {
        if(id == null){
            Product product = new Product();
            product.setNama(productRequest.getNama());
            product.setHarga(productRequest.getHarga());
            productRepository.save(product);
            return product;
        }
        Product product = productRepository.findOne(id);
        if(product != null){
            product.setNama(productRequest.getNama());
            product.setHarga(productRequest.getHarga());
            productRepository.save(product);
            return product;
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(id);
    }
}
