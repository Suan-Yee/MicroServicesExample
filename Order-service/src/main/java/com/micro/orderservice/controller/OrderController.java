package com.micro.orderservice.controller;


import com.micro.orderservice.dto.OrderDto;
import com.micro.orderservice.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDto order) {
        OrderDto savedOrder = orderService.createOrder(order);

        return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);
    }

   /* @GetMapping("{productID}")
    ResponseEntity<OrderDto> getOrderById(@PathVariable("productID")  String productID){
        OrderDto getOrder = orderService.getOrderByProductID(productID);

        return new ResponseEntity<>(getOrder, HttpStatus.OK);
    }*/
}
