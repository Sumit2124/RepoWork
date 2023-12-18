package com.service.product.ProductService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class ProductResponse
{
    private String productName;
    private long productId;
    private long price;
    private long quantity;
}
