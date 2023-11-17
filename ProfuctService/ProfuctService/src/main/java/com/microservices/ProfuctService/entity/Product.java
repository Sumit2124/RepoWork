package com.microservices.ProfuctService.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product")
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private  long productId;
  @Column(name = "product_name")
   private String productName;
  @Column(name = "product_price")
  private long price;
  @Column(name="product_quantity")
  private long quantity;

}
