package com.service.product.ProductService.service;

import com.service.product.ProductService.model.ProductRequest;
import com.service.product.ProductService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProduct(long productId);
}
