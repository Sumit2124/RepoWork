package com.service.order.OrderService.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="ORDER_DETAILS")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private long orderId;
    @Column(name="PRODUCT_ID")
    private long productId;
    @Column(name="PRODUCT_QUANTITY")
    private long quantity;
    @Column(name="PRODUCT_DATE")
    private Instant orderDate;
    @Column(name="PRODUCT_STATUS")
    private String orderStatus;
    @Column(name="PRODUCT_AMOUNT")
    private long amount;


}
