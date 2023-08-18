package com.micro.orderservice.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class OrderDto {

    private Long id;
    private String customerName;
    private String productId;

}
