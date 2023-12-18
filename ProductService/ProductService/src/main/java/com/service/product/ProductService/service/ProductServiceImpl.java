package com.service.product.ProductService.service;

import com.service.product.ProductService.entity.Product;
import com.service.product.ProductService.exception.ProductNotFoundException;
import com.service.product.ProductService.model.ProductRequest;
import com.service.product.ProductService.model.ProductResponse;
import com.service.product.ProductService.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.springframework.beans.BeanUtils.*;

@Service
@Log4j2
public class ProductServiceImpl implements  ProductService
{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public long addProduct(ProductRequest productRequest)
    {
        log.info("Adding Product");
       Product product= Product.builder().productName(productRequest.getName()).price(productRequest.getPrice()).quantity(productRequest.getQuantity()).build();
       productRepository.save(product);
       log.info("Product Created {}",product);
       return product.getProductId();

    }

    @Override
    public ProductResponse getProduct(long productId)
    {
        log.info("Getting product by id {}",productId);
        Product product = productRepository.findById(productId).orElseThrow(
                () -> new ProductNotFoundException(("Product Not found with given id"),"Product Not Found")
        );
        ProductResponse productResponse=new ProductResponse();
        copyProperties(product,productResponse);
        return productResponse;
    }
}
