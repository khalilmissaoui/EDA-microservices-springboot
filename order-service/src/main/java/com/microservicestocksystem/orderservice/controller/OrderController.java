package com.microservicestocksystem.orderservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder() {
        return "order created";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String findOrder() {
        return "here is your oder";
    }
}