package com.shopingcart.shopingcart.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shopingcart.shopingcart.dto.CustomerDTO;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "customers")
@SequenceGenerator(name = "customers_SEQ", sequenceName = "customers_SEQ", allocationSize = 1)
//@ToString(exclude = "address")
public class Customer {

    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customers_SEQ")
    private Long id;

    @NotEmpty
    @Column(name="first_name", nullable=false)
    private String firstName;

    @Column(name="middle_name")
    private String middleName;

    @NotEmpty
    @Column(name="last_name", nullable=false)
    private String lastName;

    @NotEmpty
    @Column(name="email", nullable=false)
    private String email;

    @NotEmpty
    @Column(name="password", nullable=false)
    private String password;

    @NotEmpty
    @Column(name="mobile", nullable=false)
    private String mobile;

   /* @OneToOne(cascade = CascadeType.ALL)
    private Address address;*/

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id", referencedColumnName = "id")

//    @JsonIgnore
    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private Address address;

    public Customer(CustomerDTO customer) {
        this.id = customer.getId();
        this.firstName = customer.getFirstName();
        this.middleName = customer.getMiddleName();
        this.lastName = customer.getLastName();
        this.email = customer.getEmail();
        this.password = customer.getPassword();
        this.mobile = customer.getMobile();
    }

    public Customer() {
    }
}