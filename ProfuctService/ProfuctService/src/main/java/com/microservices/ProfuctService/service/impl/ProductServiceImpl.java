package com.microservices.ProfuctService.service.impl;

import com.microservices.ProfuctService.entity.Product;
import com.microservices.ProfuctService.model.ProductRequest;
import com.microservices.ProfuctService.repository.ProductRepository;
import com.microservices.ProfuctService.service.ProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public long addProduct(ProductRequest productRequest)
    {
        log.info("Adding product..");
        Product product=Product
                .builder()
                .productName(productRequest.getName())
                .price(productRequest.getPrice())
                .quantity(productRequest.getQuantity())
                .build();
        log.info("Product Created");
        productRepository.save(product);
        return product.getProductId();
    }
}
