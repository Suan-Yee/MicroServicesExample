package com.micro.productservice.service.impl;

import com.micro.productservice.dto.ProductDto;
import com.micro.productservice.entity.Product;
import com.micro.productservice.repo.ProductRepo;
import com.micro.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;
    private ModelMapper modelMapper;

    @Override
    public ProductDto createProduct(ProductDto productdto) {
        Product product = modelMapper.map(productdto,Product.class);
        Product savedProduct = productRepo.save(product);
        return modelMapper.map(savedProduct,ProductDto.class);
    }

    @Override
    public ProductDto getProductById(Long productId) {

        Product getProduct = productRepo.findById(productId).get();
        return modelMapper.map(getProduct,ProductDto.class);
    }

    @Override
    public ProductDto getProductByCode(String productCode) {
        Product product = productRepo.findByProductCode(productCode);
        return modelMapper.map(product,ProductDto.class);
    }
}
