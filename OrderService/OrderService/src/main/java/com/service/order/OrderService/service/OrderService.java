package com.service.order.OrderService.service;

import com.service.order.OrderService.model.OrderRequest;

public interface OrderService
{

    long placeOrder(OrderRequest orderRequest);
}
