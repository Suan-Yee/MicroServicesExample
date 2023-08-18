package com.micro.orderservice.service;

import com.micro.orderservice.dto.OrderDto;

public interface OrderService {

    OrderDto createOrder (OrderDto order);
 //   OrderDto getOrderByProductID(String productId);

}
