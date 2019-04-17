package com.shopingcart.shopingcart.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Data
@Entity
@Table(name = "category")
@SequenceGenerator(name = "category_SEQ", sequenceName = "category_SEQ", allocationSize = 1)
public class Category {

    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_SEQ")
    private Long id;

    @NotEmpty
    @Column(name="name", nullable=false)
    private String name;

    @Column(name="description")
    private String description;

    @NotEmpty
    @Column(name="last_name", nullable=false)
    private String lastName;

    @NotEmpty
    @Column(name="image", nullable=false)
    private String image;
}