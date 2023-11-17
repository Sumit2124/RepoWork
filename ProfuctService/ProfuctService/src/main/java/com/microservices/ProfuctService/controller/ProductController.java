package com.microservices.ProfuctService.controller;

import com.microservices.ProfuctService.model.ProductRequest;
import com.microservices.ProfuctService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping("/product")
public class ProductController
{
    @Autowired
private ProductService productService;
    @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest)
    {
        long productId=productService.addProduct(productRequest);
        return new ResponseEntity<>(productId,HttpStatus.CREATED);
    }

}
