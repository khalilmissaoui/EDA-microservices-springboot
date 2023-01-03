package com.microservicestocksystem.orderservice.repository;

import com.microservicestocksystem.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
