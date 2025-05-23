package com.service.order.OrderService.service;

import com.service.order.OrderService.entity.Order;
import com.service.order.OrderService.model.OrderRequest;
import com.service.order.OrderService.repository.OrderRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
public class OrderServiceImpl implements  OrderService
{
    @Autowired
private OrderRepository orderRepository;
    @Override
    public long placeOrder(OrderRequest orderRequest)
    {
        //Create Order Entity
        //Product Service -Block The products(Reduce the quantity)
        //Payments Service -> Payments -> Success -> Completed
        //Cancelled
        log.info("Placing Order request: {}",orderRequest);
        Order order= Order.builder().amount(orderRequest.getAmount())
                .orderStatus("Created")
                .productId(orderRequest.getProductId())
                .orderDate(Instant.now())
                .quantity(orderRequest.getQuantity())
                .build();

        order=orderRepository.save(order);
        log.info("Order placed successfully with Order id: {}",order.getOrderId());
        return order.getOrderId();
    }
}
