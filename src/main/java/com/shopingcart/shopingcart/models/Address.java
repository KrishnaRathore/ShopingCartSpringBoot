
package com.shopingcart.shopingcart.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shopingcart.shopingcart.dto.AddressDTO;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "address")
@SequenceGenerator(name = "address_SEQ", sequenceName = "address_SEQ", allocationSize = 1)
//@ToString(exclude = {"customer"})
public class Address {

    @Id
    @Column(name = "id", updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_SEQ")
    private Long id;

    private String buildingNo;

    private String city;

    private String state;

    private String country;

    /*@OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;*/

//    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;


    public Address() {
    }

    public Address(AddressDTO address) {
        this.id = address.getId();
        this.buildingNo = address.getBuildingNo();
        this.city = address.getCity();
        this.state = address.getState();
        this.country = address.getCountry();
    }
}