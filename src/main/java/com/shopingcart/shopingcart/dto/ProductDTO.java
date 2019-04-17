package com.shopingcart.shopingcart.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private String name;
    private String description;
    private Integer rating;
    private double productPrice;
}
