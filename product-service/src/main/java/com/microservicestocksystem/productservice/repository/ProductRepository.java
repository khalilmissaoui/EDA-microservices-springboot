package com.microservicestocksystem.productservice.repository;

import com.microservicestocksystem.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}

