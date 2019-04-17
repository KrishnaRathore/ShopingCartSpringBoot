package com.shopingcart.shopingcart.models;

//import com.shopingcart.shopingcart.base.AbstractTable;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;


@Data
@Entity
@Table(name = "products")
@SequenceGenerator(name = "products_SEQ", sequenceName = "products_SEQ", allocationSize = 1)
public class Product /*extends AbstractTable */ {

    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_SEQ")
    private Long id;

    @NotEmpty
    @Column(name = "name", nullable = false)
    private String name;


    @Column(name = "description")
    private String description;


    @Column(name = "rating")
    @Min(0)
    @Max(5)
    private Integer rating;


    @NotNull
    @Column(name = "product_price", nullable = false)
    private double productPrice;

/*
    private Date updatedAt;*/

}
