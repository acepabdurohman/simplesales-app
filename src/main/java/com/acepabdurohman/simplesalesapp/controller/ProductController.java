package com.acepabdurohman.simplesalesapp.controller;

import com.acepabdurohman.simplesalesapp.dto.ProductRequest;
import com.acepabdurohman.simplesalesapp.model.Product;
import com.acepabdurohman.simplesalesapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("")
    public ResponseEntity findAll(){
        List<Product> products = productService.findAll();
        if(products != null){
            return new ResponseEntity(products, HttpStatus.OK);
        }
        return new ResponseEntity(products, HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity findOne(@PathVariable("id") Long id){
        Product product = productService.findOne(id);
        if(product != null){
            return new ResponseEntity(product, HttpStatus.OK);
        }
        return new ResponseEntity(product, HttpStatus.NOT_FOUND);
    }

    @PostMapping("")
    public ResponseEntity save(@RequestBody ProductRequest productRequest){
        Product product = productService.save(productRequest, null);
        return new ResponseEntity(product, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity save(@RequestBody ProductRequest productRequest, @PathVariable("id") Long id){
        Product product = productService.save(productRequest, id);
        if(product != null){
            return new ResponseEntity(product, HttpStatus.OK);
        }
        return new ResponseEntity(product, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id){
        productService.delete(id);
        return new ResponseEntity("ID " + id + " berhasil dihapus", HttpStatus.OK);
    }
}
