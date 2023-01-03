package com.microservicestocksystem.inventoryservice.repository;


import com.microservicestocksystem.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
