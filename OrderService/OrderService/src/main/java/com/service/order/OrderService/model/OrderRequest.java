package com.service.order.OrderService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest
{
    private long productId;
    private long amount;
    private long quantity;
    private String orderStatus;
    private PaymentMode paymentMode;

}
