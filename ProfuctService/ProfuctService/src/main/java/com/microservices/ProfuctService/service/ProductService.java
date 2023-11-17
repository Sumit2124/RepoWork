package com.microservices.ProfuctService.service;

import com.microservices.ProfuctService.model.ProductRequest;

public interface ProductService
{

    long addProduct(ProductRequest productRequest);
}
