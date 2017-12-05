package com.acepabdurohman.simplesalesapp.controller;

import com.acepabdurohman.simplesalesapp.model.Order;
import com.acepabdurohman.simplesalesapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("")
    public ResponseEntity save(@RequestBody Order order){

        Order result = orderService.save(order);
        return new ResponseEntity(result, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity findAll(){
        List<Order> orders = orderService.findAll();
        return new ResponseEntity(orders, HttpStatus.OK);
    }
}
