package com.shopingcart.shopingcart.dto;

import com.shopingcart.shopingcart.models.Customer;
import lombok.Data;

@Data
public class CustomerDTO {

    private Long id;

    private String firstName;

    private String middleName;

    private String lastName;

    private String email;

    private String password;

    private String mobile;

    private AddressDTO address;

   /* public CustomerDTO(Long customerVarId, String firstName, String middleName, String lastName, String email, String password, String mobile) {
        this.customerVarId = customerVarId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }*/

    public CustomerDTO(Customer customer) {
        this.id = customer.getId();
        this.firstName = customer.getFirstName();
        this.middleName = customer.getMiddleName();
        this.lastName = customer.getLastName();
        this.email = customer.getEmail();
        this.password = customer.getPassword();
        this.mobile = customer.getMobile();

    }

    public CustomerDTO() {
    }
}

