package com.example.orderservice.order;

import com.example.orderservice.order.dto.OrderDto;

public interface OrdersService {
    OrderDto createOrder(OrderDto orderDetails);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
