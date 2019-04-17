package com.shopingcart.shopingcart.helper;

import com.shopingcart.shopingcart.dto.CustomerDTO;
import com.shopingcart.shopingcart.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerHelper {

    @Autowired
    private AddressHelper addressHelper;

    public CustomerDTO modelToDTO(Customer customer) {
        CustomerDTO dto = new CustomerDTO(customer);
        dto.setAddress(addressHelper.modelToDTO(customer.getAddress()));
        return dto;
    }


    public Customer dtoToModel(CustomerDTO data) {
        Customer dto = new Customer(data);
        dto.setAddress(addressHelper.dtoToModel(data.getAddress()));
        return dto;
    }
}
