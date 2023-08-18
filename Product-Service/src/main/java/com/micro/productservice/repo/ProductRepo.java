package com.micro.productservice.repo;

import com.micro.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {

    Product findByProductCode(String productCode);
}
