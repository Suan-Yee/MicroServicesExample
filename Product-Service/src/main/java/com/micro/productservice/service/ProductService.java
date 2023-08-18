package com.micro.productservice.service;

import com.micro.productservice.dto.ProductDto;
import com.micro.productservice.entity.Product;

public interface ProductService {

    ProductDto createProduct(ProductDto productDto);

    ProductDto getProductById(Long productId);

    ProductDto getProductByCode(String productCode);
}
