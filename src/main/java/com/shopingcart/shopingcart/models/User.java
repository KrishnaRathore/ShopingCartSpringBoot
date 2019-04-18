package com.shopingcart.shopingcart.models;

import com.shopingcart.shopingcart.base.AbstractTable;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
@SequenceGenerator(name = "users_SEQ", sequenceName = "users_SEQ", allocationSize = 1)
public class User extends AbstractTable {

    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_SEQ")
    private Long id;

    @Column(name="first_name")
    private String name;

    @Column(name="email")
    private String email;

}
