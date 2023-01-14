package com.microservicestocksystem.orderservice.event;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {
    public enum OrderState {SUCCESS, FAILURE};

    private String orderNumber;
    private OrderState orderState;
}
