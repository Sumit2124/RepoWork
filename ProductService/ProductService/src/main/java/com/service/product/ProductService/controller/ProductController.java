package com.service.product.ProductService.controller;

import com.service.product.ProductService.model.ProductRequest;
import com.service.product.ProductService.model.ProductResponse;
import com.service.product.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController
{
    @Autowired
private ProductService productService;
   @PostMapping
    public ResponseEntity<Long> addProduct(@RequestBody ProductRequest productRequest)
    {
        long productId=productService.addProduct(productRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED);
    }
    @GetMapping("/{productId}")
    public ResponseEntity<ProductResponse> getProduct(@PathVariable long productId)
    {
        ProductResponse productResponse=productService.getProduct(productId);
        return new ResponseEntity<>(productResponse,HttpStatus.OK);
    }
}
