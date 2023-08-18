package com.micro.orderservice.repo;

import com.micro.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {

   // Order findByProductId(String productId);
}
