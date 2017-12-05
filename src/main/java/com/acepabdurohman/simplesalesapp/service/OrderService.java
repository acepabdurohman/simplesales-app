package com.acepabdurohman.simplesalesapp.service;

import com.acepabdurohman.simplesalesapp.model.Order;

import java.util.List;

public interface OrderService {
    Order save(Order order);

    List<Order> findAll();
}
