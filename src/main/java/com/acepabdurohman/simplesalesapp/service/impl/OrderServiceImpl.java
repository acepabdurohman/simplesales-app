package com.acepabdurohman.simplesalesapp.service.impl;

import com.acepabdurohman.simplesalesapp.model.Order;
import com.acepabdurohman.simplesalesapp.repository.OrderRepository;
import com.acepabdurohman.simplesalesapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        Order result = orderRepository.save(order);
        return result;
    }

    @Override
    public List<Order> findAll() {
        return (List<Order>) orderRepository.findAll();
    }
}
