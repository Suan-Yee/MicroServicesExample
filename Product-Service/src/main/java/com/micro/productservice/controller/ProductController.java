package com.micro.productservice.controller;

import com.micro.productservice.dto.ProductDto;
import com.micro.productservice.entity.Product;
import com.micro.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/product")
public class ProductController {

    private ProductService productService;

    @PostMapping
    ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productdto){
        ProductDto createdProduct = productService.createProduct(productdto);

        return ResponseEntity.ok(createdProduct);
    }
    @GetMapping("{id}")
    ResponseEntity<ProductDto> getProductById(@PathVariable("id") Long productId){
        ProductDto product = productService.getProductById(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    @GetMapping("{code}")
    ResponseEntity<ProductDto> getProductByCode(@PathVariable("code") String productCode){
        ProductDto product = productService.getProductByCode(productCode);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
