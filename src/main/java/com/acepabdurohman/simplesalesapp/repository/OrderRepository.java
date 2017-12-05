package com.acepabdurohman.simplesalesapp.repository;

import com.acepabdurohman.simplesalesapp.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
