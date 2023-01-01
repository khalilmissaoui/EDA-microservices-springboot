package com.microservicestocksystem.productservice.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct() {
        return "product is created";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getAllProducts() {
        return "here is the list of products";
    }

}

