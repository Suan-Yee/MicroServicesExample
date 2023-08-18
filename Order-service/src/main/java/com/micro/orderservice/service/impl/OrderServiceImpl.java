package com.micro.orderservice.service.impl;

import com.micro.orderservice.dto.OrderDto;
import com.micro.orderservice.entity.Order;
import com.micro.orderservice.repo.OrderRepo;
import com.micro.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepo orderRepo;
    private final ModelMapper modelMapper;

    @Override
    public OrderDto createOrder(OrderDto orderDto) {
        Order order = modelMapper.map(orderDto,Order.class);
        Order savedOrder = orderRepo.save(order);
        return modelMapper.map(savedOrder,OrderDto.class);
    }

   /* @Override
    public OrderDto getOrderByProductID(String productId) {
        Order getProduct = orderRepo.findByProductId(productId);

        return modelMapper.map(getProduct,OrderDto.class);
    }*/
}
